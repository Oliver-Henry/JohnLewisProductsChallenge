
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("was")
    @Expose
    private String was;
    @SerializedName("then1")
    @Expose
    private String then1;
    @SerializedName("then2")
    @Expose
    private String then2;
    @SerializedName("now")
    @Expose
    private Object now;
    @SerializedName("uom")
    @Expose
    private String uom;
    @SerializedName("currency")
    @Expose
    private String currency;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param uom
     * @param now
     * @param then2
     * @param then1
     * @param currency
     * @param was
     */
    public Price(String was, String then1, String then2, String now, String uom, String currency) {
        super();
        this.was = was;
        this.then1 = then1;
        this.then2 = then2;
        this.now = now;
        this.uom = uom;
        this.currency = currency;
    }

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public Price withWas(String was) {
        this.was = was;
        return this;
    }

    public String getThen1() {
        return then1;
    }

    public void setThen1(String then1) {
        this.then1 = then1;
    }

    public Price withThen1(String then1) {
        this.then1 = then1;
        return this;
    }

    public String getThen2() {
        return then2;
    }

    public void setThen2(String then2) {
        this.then2 = then2;
    }

    public Price withThen2(String then2) {
        this.then2 = then2;
        return this;
    }

    public Object getNow() {
        return now;
    }

    public void setNow(Object now) {
        this.now = now;
    }

    public Price withNow(String now) {
        this.now = now;
        return this;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Price withUom(String uom) {
        this.uom = uom;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Price withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

}
