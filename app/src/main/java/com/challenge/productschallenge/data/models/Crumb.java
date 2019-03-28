
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crumb {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("clickable")
    @Expose
    private String clickable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Crumb() {
    }

    /**
     * 
     * @param item
     * @param clickable
     * @param displayName
     * @param type
     */
    public Crumb(String type, String displayName, String item, String clickable) {
        super();
        this.type = type;
        this.displayName = displayName;
        this.item = item;
        this.clickable = clickable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Crumb withType(String type) {
        this.type = type;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Crumb withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Crumb withItem(String item) {
        this.item = item;
        return this;
    }

    public String getClickable() {
        return clickable;
    }

    public void setClickable(String clickable) {
        this.clickable = clickable;
    }

    public Crumb withClickable(String clickable) {
        this.clickable = clickable;
        return this;
    }

}
