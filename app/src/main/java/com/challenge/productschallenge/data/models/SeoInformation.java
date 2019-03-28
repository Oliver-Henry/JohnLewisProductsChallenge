
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeoInformation {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SeoInformation() {
    }

    /**
     * 
     * @param title
     * @param description
     */
    public SeoInformation(String title, String description) {
        super();
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SeoInformation withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SeoInformation withDescription(String description) {
        this.description = description;
        return this;
    }

}
