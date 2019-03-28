
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TriggeredRules {

    @SerializedName("seo")
    @Expose
    private String seo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TriggeredRules() {
    }

    /**
     * 
     * @param seo
     */
    public TriggeredRules(String seo) {
        super();
        this.seo = seo;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public TriggeredRules withSeo(String seo) {
        this.seo = seo;
        return this;
    }

}
