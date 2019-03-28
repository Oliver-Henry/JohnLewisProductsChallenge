
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DynamicAttributes {

    @SerializedName("newinproducttype")
    @Expose
    private String newinproducttype;
    @SerializedName("washinginstructions")
    @Expose
    private String washinginstructions;
    @SerializedName("dressbyoccasion")
    @Expose
    private String dressbyoccasion;
    @SerializedName("dressshape")
    @Expose
    private String dressshape;
    @SerializedName("typeofpattern")
    @Expose
    private String typeofpattern;
    @SerializedName("luxuryfabric")
    @Expose
    private String luxuryfabric;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DynamicAttributes() {
    }

    /**
     * 
     * @param newinproducttype
     * @param luxuryfabric
     * @param washinginstructions
     * @param dressbyoccasion
     * @param dressshape
     * @param typeofpattern
     */
    public DynamicAttributes(String newinproducttype, String washinginstructions, String dressbyoccasion, String dressshape, String typeofpattern, String luxuryfabric) {
        super();
        this.newinproducttype = newinproducttype;
        this.washinginstructions = washinginstructions;
        this.dressbyoccasion = dressbyoccasion;
        this.dressshape = dressshape;
        this.typeofpattern = typeofpattern;
        this.luxuryfabric = luxuryfabric;
    }

    public String getNewinproducttype() {
        return newinproducttype;
    }

    public void setNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
    }

    public DynamicAttributes withNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
        return this;
    }

    public String getWashinginstructions() {
        return washinginstructions;
    }

    public void setWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
    }

    public DynamicAttributes withWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
        return this;
    }

    public String getDressbyoccasion() {
        return dressbyoccasion;
    }

    public void setDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
    }

    public DynamicAttributes withDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
        return this;
    }

    public String getDressshape() {
        return dressshape;
    }

    public void setDressshape(String dressshape) {
        this.dressshape = dressshape;
    }

    public DynamicAttributes withDressshape(String dressshape) {
        this.dressshape = dressshape;
        return this;
    }

    public String getTypeofpattern() {
        return typeofpattern;
    }

    public void setTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
    }

    public DynamicAttributes withTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
        return this;
    }

    public String getLuxuryfabric() {
        return luxuryfabric;
    }

    public void setLuxuryfabric(String luxuryfabric) {
        this.luxuryfabric = luxuryfabric;
    }

    public DynamicAttributes withLuxuryfabric(String luxuryfabric) {
        this.luxuryfabric = luxuryfabric;
        return this;
    }

}
