package org.demo;

import org.openide.explorer.view.CheckableNode;

class CheckNode implements CheckableNode {

    private BusinessObject businessObject;
    private Boolean selected = false;

    public CheckNode(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    //Tell the view to display a checkbox for this node:
    public boolean isCheckable() {
        return true;
    }

    //Provide the enabled state of the checkbox:
    public boolean isCheckEnabled() {
        return true;
    }

    //Provide the selected state of the checkbox:
    public Boolean isSelected() {
        if (selected) {
            return true;
        } else {
            return false;
        }
    }

    //Called by the view when the checkbox gets selected/unselected:
    public void setSelected(Boolean isSelected) {
        this.selected = isSelected;
        //Change the 'selected' property, which triggers everything else:
        businessObject.setSelected(isSelected);
    }

}
