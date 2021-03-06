/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2012 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2012 Sun Microsystems, Inc.
 */
package org.netbeans.modules.profiler.selector.ui;

import java.util.*;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.netbeans.lib.profiler.client.ClientUtils;
import org.netbeans.modules.profiler.api.java.SourceClassInfo;
import org.netbeans.modules.profiler.selector.api.nodes.*;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

/**
 * Bi-directional tree search support with index backing and state persisting
 * @author Jaroslav Bachorik
 */
public class TreePathSearch extends WrappingSearchCursor<TreePath> {
    public static interface ClassIndex {
        List<SourceClassInfo> getClasses(String pattern, Lookup context);
    }
    
    private TreeNode root;
    
    final private ClassIndex ci;
    final private List<Lookup> contexts = new ArrayList<Lookup>();
    final private List<List<SourceClassInfo>> rslts = new ArrayList<List<SourceClassInfo>>();
        
    protected TreePathSearch(TreeNode root, String searchTerm, ClassIndex ci) {
        super(searchTerm);
        this.ci = ci;
        this.root = root;

        Enumeration e = root.children();
        while (e.hasMoreElements()) {
            SelectorNode n = (SelectorNode)e.nextElement();
            contexts.add(n.getLookup());
            rslts.add(null);
        }
    }

    @Override
    protected TreePath getItem(int slotIndex, int itemIndex) {
        SourceClassInfo sci = getSlot(slotIndex).get(itemIndex);
        if (sci != null) {
            return findPath(sci, slotIndex);
        }
        return null;
    }

    @Override
    protected int getSlotSize(int slotIndex) {
        return getSlot(slotIndex).size();
    }

    @Override
    protected int getSlotsNumber() {
        return contexts.size();
    }

    private List<SourceClassInfo> getSlot(int slotIndex) {
        List<SourceClassInfo> scis = rslts.get(slotIndex);
        if (scis == null) {
            String pattern = ".*" + getSearchTerm() + ".*"; // NOI18N
            Lookup c = contexts.get(slotIndex);
            scis = ci.getClasses(pattern, c);

            rslts.set(slotIndex, scis);
        }
        return scis;
    }    
    
    private TreePath findPath(SourceClassInfo sci, int slotIndex) {
        if (sci == null) return null;

        ClientUtils.SourceCodeSelection scs = new ClientUtils.SourceCodeSelection(sci.getQualifiedName() + "$**", null, null); // NOI18N

        SelectorNode n = findNode((SelectorNode)root.getChildAt(slotIndex), scs);
        if (n != null) {
            Object[] nPath = n.getPath();
            Object[] path = new Object[nPath.length + 1];
            path[0] = root;
            System.arraycopy(nPath, 0, path, 1, nPath.length);
            return new TreePath(path);
        }
        
        return null;
    }
    
    private SelectorNode findNode(SelectorNode root, ClientUtils.SourceCodeSelection sig) {
        Deque<SelectorNode> toSearch = new ArrayDeque<SelectorNode>();

        toSearch.add(root);
        while (!toSearch.isEmpty()) {
            if (isCancelled()) return null;
            SelectorNode n = toSearch.poll();
            ClientUtils.SourceCodeSelection nodeSig = n.getSignature();
            if (nodeSig != null && nodeSig.equals(sig)) {
                return n;
            }
            if (nodeSig == null || nodeSig.contains(sig)) {
                Enumeration e = n.children();
                while (e.hasMoreElements()) {
                    if (isCancelled()) return null;
                    SelectorNode childNode = (SelectorNode) e.nextElement();
                    ClientUtils.SourceCodeSelection childSig = childNode.getSignature();
                    if (childSig != null && childSig.equals(sig)) {
                        return childNode;
                    }
                    if (childSig == null || childSig.contains(sig)) {
                        if (!(childNode instanceof MethodsNode) && !(childNode instanceof ConstructorsNode)) {
                            toSearch.offer(childNode);
                        }
                    }
                }
            }
        }
        return null;
    }
}
