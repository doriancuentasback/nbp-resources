package org.netbeans.gradle.project.classpath;


/**
 *
 * @author schmidtm
 * @author Martin Adamek
 */
public enum SourceCategory {

    SRC_JAVA("src", null, null),
    LIB("lib", null, null);

    private final String relativePath;
    
    private final String command;

    private final String suffix;

    SourceCategory(String relativePath, String command, String suffix) {
        this.relativePath = relativePath;
        this.command = command;
        this.suffix = suffix;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public String getCommand() {
        return command;
    }

    public String getSuffix() {
        return suffix;
    }

}
