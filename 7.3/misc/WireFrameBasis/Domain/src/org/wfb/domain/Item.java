package org.wfb.domain;

public class Item {

    private String displayName;
    private Row parent;

    public Item(String displayName, Row parent) {
        this.displayName = displayName;
        this.parent = parent;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Row getParent() {
        return parent;
    }

    public void setParent(Row parent) {
        this.parent = parent;
    }
    
}
