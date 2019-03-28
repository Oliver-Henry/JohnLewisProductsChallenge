
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromotionalFeature {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("linkUrl")
    @Expose
    private String linkUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PromotionalFeature() {
    }

    /**
     * 
     * @param title
     * @param linkUrl
     * @param description
     * @param iconUrl
     * @param longDescription
     */
    public PromotionalFeature(String title, String iconUrl, String linkUrl, String description, String longDescription) {
        super();
        this.title = title;
        this.iconUrl = iconUrl;
        this.linkUrl = linkUrl;
        this.description = description;
        this.longDescription = longDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PromotionalFeature withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public PromotionalFeature withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public PromotionalFeature withLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PromotionalFeature withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public PromotionalFeature withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

}
