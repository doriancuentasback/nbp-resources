package org.netbeans.lib.visage.lexer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * This class optimizes the lexer memory usage by detecting and removing
 * redundancy in the ANTLR state transition tables. It does so in a hacky way
 * by namespace-override of the ANTLR's own DFA to hijack
 * the unpackEncodedString call.
 *
 * Alternative solutions to this problem (2x9.5MB wasted) are:<ul>
 * <li>Patch ANTLR to generate more effective tables (patch was actually submitted)</li>
 * <li>Post-fix the Lexer class everytime after generation from the grammar</li>
 * </ul>
 *
 * @author nenik
 */
public class DFA extends org.antlr.runtime.DFA {
    private static Map<ArrayWrapper,ArrayWrapper> cache = new HashMap<ArrayWrapper, ArrayWrapper>();

    public static short[] getShared(short[] shorts) {
        ArrayWrapper wrapper = new ArrayWrapper(shorts);
        if (cache.containsKey(wrapper)) {
            wrapper = cache.get(wrapper);
        } else {
            cache.put(wrapper, wrapper);
        }
        return wrapper.array;
    }

    public static short[] unpackEncodedString(String def) {
        short[] shorts = org.antlr.runtime.DFA.unpackEncodedString(def);
        return getShared(shorts);
    }

    private static class ArrayWrapper {
        short[] array;
        int hashcode;

        ArrayWrapper(short[] data) {
            array = data;
            int sum = data.length;
            for (short v : data) {
                sum = sum * 33 + v;
            }
            hashcode = sum;
        }

        public @Override int hashCode() {
            return hashcode;
        }

        public @Override boolean equals(Object obj) {
            if (obj instanceof ArrayWrapper) {
                ArrayWrapper other = (ArrayWrapper)obj;
                if (other.hashcode != hashcode) return false;
                return Arrays.equals(other.array, array);
            }
            return false;
        }

    }
}
