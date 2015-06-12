package org.netbeans.gradle.project.classpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.netbeans.api.java.project.JavaProjectConstants;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;

/**
 * Constants useful for Gradle-based projects.
 *
 * @author Martin Adamek
 */
public class GroovySources {

    public static final String SOURCES_TYPE_GRADLE = "test"; // NOI18N

    public static List<SourceGroup> getGroovySourceGroups(Sources sources) {
        List<SourceGroup> result = new ArrayList<SourceGroup>();
        result.addAll(Arrays.asList(sources.getSourceGroups(JavaProjectConstants.SOURCES_TYPE_JAVA)));
        result.addAll(Arrays.asList(sources.getSourceGroups(GroovySources.SOURCES_TYPE_GRADLE)));
        return result;
    }

}
