
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorSwatch {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("basicColor")
    @Expose
    private String basicColor;
    @SerializedName("colorSwatchUrl")
    @Expose
    private String colorSwatchUrl;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("isAvailable")
    @Expose
    private boolean isAvailable;
    @SerializedName("skuId")
    @Expose
    private String skuId;
    private String rgbColor;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ColorSwatch() {
    }

    /**
     * 
     * @param imageUrl
     * @param color
     * @param skuId
     * @param basicColor
     * @param colorSwatchUrl
     * @param isAvailable
     */
    public ColorSwatch(String color, String basicColor, String colorSwatchUrl, String imageUrl, boolean isAvailable, String skuId) {
        super();
        this.color = color;
        this.basicColor = basicColor;
        this.colorSwatchUrl = colorSwatchUrl;
        this.imageUrl = imageUrl;
        this.isAvailable = isAvailable;
        this.skuId = skuId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorSwatch withColor(String color) {
        this.color = color;
        return this;
    }

    public String getBasicColor() {
        return basicColor;
    }

    public void setBasicColor(String basicColor) {
        this.basicColor = basicColor;
    }

    public ColorSwatch withBasicColor(String basicColor) {
        this.basicColor = basicColor;
        return this;
    }

    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    public ColorSwatch withColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ColorSwatch withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public ColorSwatch withIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public ColorSwatch withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public String getRgbColor() {
        return rgbColor;
    }

    public void setRgbColor(String rgbColor) {
        this.rgbColor = rgbColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorSwatch)) return false;

        ColorSwatch that = (ColorSwatch) o;

        return getRgbColor() != null ? getRgbColor().equals(that.getRgbColor()) : that.getRgbColor() == null;
    }

    @Override
    public int hashCode() {
        return getRgbColor() != null ? getRgbColor().hashCode() : 0;
    }
}
