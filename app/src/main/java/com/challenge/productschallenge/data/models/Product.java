
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("averageRating")
    @Expose
    private int averageRating;
    @SerializedName("reviews")
    @Expose
    private int reviews;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("additionalServices")
    @Expose
    private List<Object> additionalServices = null;
    @SerializedName("displaySpecialOffer")
    @Expose
    private String displaySpecialOffer;
    @SerializedName("promoMessages")
    @Expose
    private PromoMessages promoMessages;
    @SerializedName("nonPromoMessage")
    @Expose
    private String nonPromoMessage;
    @SerializedName("defaultSkuId")
    @Expose
    private String defaultSkuId;
    @SerializedName("colorSwatches")
    @Expose
    private List<ColorSwatch> colorSwatches = null;
    @SerializedName("colorSwatchSelected")
    @Expose
    private int colorSwatchSelected;
    @SerializedName("colorWheelMessage")
    @Expose
    private String colorWheelMessage;
    @SerializedName("outOfStock")
    @Expose
    private boolean outOfStock;
    @SerializedName("emailMeWhenAvailable")
    @Expose
    private boolean emailMeWhenAvailable;
    @SerializedName("availabilityMessage")
    @Expose
    private String availabilityMessage;
    @SerializedName("compare")
    @Expose
    private boolean compare;
    @SerializedName("fabric")
    @Expose
    private String fabric;
    @SerializedName("swatchAvailable")
    @Expose
    private boolean swatchAvailable;
    @SerializedName("categoryQuickViewEnabled")
    @Expose
    private boolean categoryQuickViewEnabled;
    @SerializedName("swatchCategoryType")
    @Expose
    private String swatchCategoryType;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("ageRestriction")
    @Expose
    private int ageRestriction;
    @SerializedName("isInStoreOnly")
    @Expose
    private boolean isInStoreOnly;
    @SerializedName("isMadeToMeasure")
    @Expose
    private boolean isMadeToMeasure;
    @SerializedName("isBundle")
    @Expose
    private boolean isBundle;
    @SerializedName("isProductSet")
    @Expose
    private boolean isProductSet;
    @SerializedName("promotionalFeatures")
    @Expose
    private List<PromotionalFeature> promotionalFeatures = null;
    @SerializedName("features")
    @Expose
    private List<Object> features = null;
    @SerializedName("quickAddToBasket")
    @Expose
    private QuickAddToBasket quickAddToBasket;
    @SerializedName("dynamicAttributes")
    @Expose
    private DynamicAttributes dynamicAttributes;
    @SerializedName("directorate")
    @Expose
    private String directorate;
    @SerializedName("releaseDateTimestamp")
    @Expose
    private int releaseDateTimestamp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param availabilityMessage
     * @param averageRating
     * @param ageRestriction
     * @param colorWheelMessage
     * @param quickAddToBasket
     * @param type
     * @param additionalServices
     * @param isBundle
     * @param emailMeWhenAvailable
     * @param swatchCategoryType
     * @param title
     * @param features
     * @param promotionalFeatures
     * @param fabric
     * @param isProductSet
     * @param nonPromoMessage
     * @param defaultSkuId
     * @param reviews
     * @param releaseDateTimestamp
     * @param isInStoreOnly
     * @param compare
     * @param categoryQuickViewEnabled
     * @param image
     * @param code
     * @param promoMessages
     * @param productId
     * @param outOfStock
     * @param isMadeToMeasure
     * @param displaySpecialOffer
     * @param price
     * @param dynamicAttributes
     * @param colorSwatchSelected
     * @param directorate
     * @param brand
     * @param swatchAvailable
     * @param colorSwatches
     */
    public Product(String productId, String type, String title, String code, int averageRating, int reviews, Price price, String image, List<Object> additionalServices, String displaySpecialOffer, PromoMessages promoMessages, String nonPromoMessage, String defaultSkuId, List<ColorSwatch> colorSwatches, int colorSwatchSelected, String colorWheelMessage, boolean outOfStock, boolean emailMeWhenAvailable, String availabilityMessage, boolean compare, String fabric, boolean swatchAvailable, boolean categoryQuickViewEnabled, String swatchCategoryType, String brand, int ageRestriction, boolean isInStoreOnly, boolean isMadeToMeasure, boolean isBundle, boolean isProductSet, List<PromotionalFeature> promotionalFeatures, List<Object> features, QuickAddToBasket quickAddToBasket, DynamicAttributes dynamicAttributes, String directorate, int releaseDateTimestamp) {
        super();
        this.productId = productId;
        this.type = type;
        this.title = title;
        this.code = code;
        this.averageRating = averageRating;
        this.reviews = reviews;
        this.price = price;
        this.image = image;
        this.additionalServices = additionalServices;
        this.displaySpecialOffer = displaySpecialOffer;
        this.promoMessages = promoMessages;
        this.nonPromoMessage = nonPromoMessage;
        this.defaultSkuId = defaultSkuId;
        this.colorSwatches = colorSwatches;
        this.colorSwatchSelected = colorSwatchSelected;
        this.colorWheelMessage = colorWheelMessage;
        this.outOfStock = outOfStock;
        this.emailMeWhenAvailable = emailMeWhenAvailable;
        this.availabilityMessage = availabilityMessage;
        this.compare = compare;
        this.fabric = fabric;
        this.swatchAvailable = swatchAvailable;
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
        this.swatchCategoryType = swatchCategoryType;
        this.brand = brand;
        this.ageRestriction = ageRestriction;
        this.isInStoreOnly = isInStoreOnly;
        this.isMadeToMeasure = isMadeToMeasure;
        this.isBundle = isBundle;
        this.isProductSet = isProductSet;
        this.promotionalFeatures = promotionalFeatures;
        this.features = features;
        this.quickAddToBasket = quickAddToBasket;
        this.dynamicAttributes = dynamicAttributes;
        this.directorate = directorate;
        this.releaseDateTimestamp = releaseDateTimestamp;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Product withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product withCode(String code) {
        this.code = code;
        return this;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public Product withAverageRating(int averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public Product withReviews(int reviews) {
        this.reviews = reviews;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Product withPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product withImage(String image) {
        this.image = image;
        return this;
    }

    public List<Object> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public Product withAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
        return this;
    }

    public String getDisplaySpecialOffer() {
        return displaySpecialOffer;
    }

    public void setDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
    }

    public Product withDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
        return this;
    }

    public PromoMessages getPromoMessages() {
        return promoMessages;
    }

    public void setPromoMessages(PromoMessages promoMessages) {
        this.promoMessages = promoMessages;
    }

    public Product withPromoMessages(PromoMessages promoMessages) {
        this.promoMessages = promoMessages;
        return this;
    }

    public String getNonPromoMessage() {
        return nonPromoMessage;
    }

    public void setNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
    }

    public Product withNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
        return this;
    }

    public String getDefaultSkuId() {
        return defaultSkuId;
    }

    public void setDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    public Product withDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
        return this;
    }

    public List<ColorSwatch> getColorSwatches() {
        return colorSwatches;
    }

    public void setColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
    }

    public Product withColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
        return this;
    }

    public int getColorSwatchSelected() {
        return colorSwatchSelected;
    }

    public void setColorSwatchSelected(int colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
    }

    public Product withColorSwatchSelected(int colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
        return this;
    }

    public String getColorWheelMessage() {
        return colorWheelMessage;
    }

    public void setColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
    }

    public Product withColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
        return this;
    }

    public boolean isOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Product withOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
        return this;
    }

    public boolean isEmailMeWhenAvailable() {
        return emailMeWhenAvailable;
    }

    public void setEmailMeWhenAvailable(boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
    }

    public Product withEmailMeWhenAvailable(boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
        return this;
    }

    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    public Product withAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
        return this;
    }

    public boolean isCompare() {
        return compare;
    }

    public void setCompare(boolean compare) {
        this.compare = compare;
    }

    public Product withCompare(boolean compare) {
        this.compare = compare;
        return this;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public Product withFabric(String fabric) {
        this.fabric = fabric;
        return this;
    }

    public boolean isSwatchAvailable() {
        return swatchAvailable;
    }

    public void setSwatchAvailable(boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
    }

    public Product withSwatchAvailable(boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
        return this;
    }

    public boolean isCategoryQuickViewEnabled() {
        return categoryQuickViewEnabled;
    }

    public void setCategoryQuickViewEnabled(boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
    }

    public Product withCategoryQuickViewEnabled(boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
        return this;
    }

    public String getSwatchCategoryType() {
        return swatchCategoryType;
    }

    public void setSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
    }

    public Product withSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Product withAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
        return this;
    }

    public boolean isIsInStoreOnly() {
        return isInStoreOnly;
    }

    public void setIsInStoreOnly(boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
    }

    public Product withIsInStoreOnly(boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
        return this;
    }

    public boolean isIsMadeToMeasure() {
        return isMadeToMeasure;
    }

    public void setIsMadeToMeasure(boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
    }

    public Product withIsMadeToMeasure(boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
        return this;
    }

    public boolean isIsBundle() {
        return isBundle;
    }

    public void setIsBundle(boolean isBundle) {
        this.isBundle = isBundle;
    }

    public Product withIsBundle(boolean isBundle) {
        this.isBundle = isBundle;
        return this;
    }

    public boolean isIsProductSet() {
        return isProductSet;
    }

    public void setIsProductSet(boolean isProductSet) {
        this.isProductSet = isProductSet;
    }

    public Product withIsProductSet(boolean isProductSet) {
        this.isProductSet = isProductSet;
        return this;
    }

    public List<PromotionalFeature> getPromotionalFeatures() {
        return promotionalFeatures;
    }

    public void setPromotionalFeatures(List<PromotionalFeature> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
    }

    public Product withPromotionalFeatures(List<PromotionalFeature> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
        return this;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    public Product withFeatures(List<Object> features) {
        this.features = features;
        return this;
    }

    public QuickAddToBasket getQuickAddToBasket() {
        return quickAddToBasket;
    }

    public void setQuickAddToBasket(QuickAddToBasket quickAddToBasket) {
        this.quickAddToBasket = quickAddToBasket;
    }

    public Product withQuickAddToBasket(QuickAddToBasket quickAddToBasket) {
        this.quickAddToBasket = quickAddToBasket;
        return this;
    }

    public DynamicAttributes getDynamicAttributes() {
        return dynamicAttributes;
    }

    public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }

    public Product withDynamicAttributes(DynamicAttributes dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
        return this;
    }

    public String getDirectorate() {
        return directorate;
    }

    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }

    public Product withDirectorate(String directorate) {
        this.directorate = directorate;
        return this;
    }

    public int getReleaseDateTimestamp() {
        return releaseDateTimestamp;
    }

    public void setReleaseDateTimestamp(int releaseDateTimestamp) {
        this.releaseDateTimestamp = releaseDateTimestamp;
    }

    public Product withReleaseDateTimestamp(int releaseDateTimestamp) {
        this.releaseDateTimestamp = releaseDateTimestamp;
        return this;
    }

}
