package org.gheditor.visual.items.filesupport;

public class Item {
    private String uniqueId;
    private String type;
    private String displayname;
    private int width;
    private int height;
    private int x;
    private int y;
    private String icon16;

    public Item(String type, String displayname, int width, int height, int x, int y, String icon16) {
        this.type = type;
        this.displayname = displayname;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.uniqueId = String.valueOf(System.currentTimeMillis());
        this.icon16 = icon16;
    }

    public String getIcon16() {
        return icon16;
    }

    public void setIcon16(String icon16) {
        this.icon16 = icon16;
    }
    
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
