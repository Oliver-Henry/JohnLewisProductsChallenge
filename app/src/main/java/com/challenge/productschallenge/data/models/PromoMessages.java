
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromoMessages {

    @SerializedName("priceMatched")
    @Expose
    private String priceMatched;
    @SerializedName("offer")
    @Expose
    private String offer;
    @SerializedName("customPromotionalMessage")
    @Expose
    private String customPromotionalMessage;
    @SerializedName("bundleHeadline")
    @Expose
    private String bundleHeadline;
    /**
     * No args constructor for use in serialization
     * 
     */
    public PromoMessages() {
    }

    /**
     * 
     * @param priceMatched
     * @param bundleHeadline
     * @param customPromotionalMessage
     * @param offer
     */
    public PromoMessages(String priceMatched, String offer, String customPromotionalMessage, String bundleHeadline) {
        super();
        this.priceMatched = priceMatched;
        this.offer = offer;
        this.customPromotionalMessage = customPromotionalMessage;
        this.bundleHeadline = bundleHeadline;
    }

    public String getPriceMatched() {
        return priceMatched;
    }

    public void setPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
    }

    public PromoMessages withPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
        return this;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public PromoMessages withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    public String getCustomPromotionalMessage() {
        return customPromotionalMessage;
    }

    public void setCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
    }

    public PromoMessages withCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
        return this;
    }

    public String getBundleHeadline() {
        return bundleHeadline;
    }

    public void setBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
    }

    public PromoMessages withBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
        return this;
    }

}
