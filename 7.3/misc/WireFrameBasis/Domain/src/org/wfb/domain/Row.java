package org.wfb.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {

    private String displayName;
    private Table parent;
    private List<Item> items;

    public Row(String displayName, Table parent, List<Item> items) {
        this.displayName = displayName;
        this.parent = parent;
        this.items = new ArrayList<Item>();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Table getParent() {
        return parent;
    }

    public void setParent(Table parent) {
        this.parent = parent;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
}
