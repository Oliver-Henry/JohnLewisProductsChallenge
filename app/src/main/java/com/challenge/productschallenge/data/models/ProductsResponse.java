
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsResponse {

    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("categoryTitle")
    @Expose
    private String categoryTitle;
    @SerializedName("childCategoriesCount")
    @Expose
    private int childCategoriesCount;
    @SerializedName("seoInformation")
    @Expose
    private SeoInformation seoInformation;
    @SerializedName("results")
    @Expose
    private int results;
    @SerializedName("pagesAvailable")
    @Expose
    private int pagesAvailable;
    @SerializedName("crumbs")
    @Expose
    private List<Crumb> crumbs = null;
    @SerializedName("dynamicBannerId")
    @Expose
    private String dynamicBannerId;
    @SerializedName("seoBannerId")
    @Expose
    private String seoBannerId;
    @SerializedName("triggeredRules")
    @Expose
    private TriggeredRules triggeredRules;
    @SerializedName("redirectUrl")
    @Expose
    private String redirectUrl;
    @SerializedName("staticLinks")
    @Expose
    private List<Object> staticLinks = null;
    @SerializedName("selectedDept")
    @Expose
    private String selectedDept;
    @SerializedName("multiCatSelected")
    @Expose
    private String multiCatSelected;
    @SerializedName("endecaCanonical")
    @Expose
    private String endecaCanonical;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductsResponse() {
    }

    /**
     * 
     * @param selectedDept
     * @param categoryTitle
     * @param seoBannerId
     * @param childCategoriesCount
     * @param pagesAvailable
     * @param dynamicBannerId
     * @param endecaCanonical
     * @param seoInformation
     * @param triggeredRules
     * @param results
     * @param staticLinks
     * @param multiCatSelected
     * @param crumbs
     * @param products
     * @param redirectUrl
     */
    public ProductsResponse(List<Product> products, String categoryTitle, int childCategoriesCount, SeoInformation seoInformation, int results, int pagesAvailable, List<Crumb> crumbs, String dynamicBannerId, String seoBannerId, TriggeredRules triggeredRules, String redirectUrl, List<Object> staticLinks, String selectedDept, String multiCatSelected, String endecaCanonical) {
        super();
        this.products = products;
        this.categoryTitle = categoryTitle;
        this.childCategoriesCount = childCategoriesCount;
        this.seoInformation = seoInformation;
        this.results = results;
        this.pagesAvailable = pagesAvailable;
        this.crumbs = crumbs;
        this.dynamicBannerId = dynamicBannerId;
        this.seoBannerId = seoBannerId;
        this.triggeredRules = triggeredRules;
        this.redirectUrl = redirectUrl;
        this.staticLinks = staticLinks;
        this.selectedDept = selectedDept;
        this.multiCatSelected = multiCatSelected;
        this.endecaCanonical = endecaCanonical;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductsResponse withProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public ProductsResponse withCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
        return this;
    }

    public int getChildCategoriesCount() {
        return childCategoriesCount;
    }

    public void setChildCategoriesCount(int childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
    }

    public ProductsResponse withChildCategoriesCount(int childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
        return this;
    }

    public SeoInformation getSeoInformation() {
        return seoInformation;
    }

    public void setSeoInformation(SeoInformation seoInformation) {
        this.seoInformation = seoInformation;
    }

    public ProductsResponse withSeoInformation(SeoInformation seoInformation) {
        this.seoInformation = seoInformation;
        return this;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public ProductsResponse withResults(int results) {
        this.results = results;
        return this;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }

    public void setPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    public ProductsResponse withPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
        return this;
    }

    public List<Crumb> getCrumbs() {
        return crumbs;
    }

    public void setCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
    }

    public ProductsResponse withCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
        return this;
    }

    public String getDynamicBannerId() {
        return dynamicBannerId;
    }

    public void setDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
    }

    public ProductsResponse withDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
        return this;
    }

    public String getSeoBannerId() {
        return seoBannerId;
    }

    public void setSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
    }

    public ProductsResponse withSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
        return this;
    }

    public TriggeredRules getTriggeredRules() {
        return triggeredRules;
    }

    public void setTriggeredRules(TriggeredRules triggeredRules) {
        this.triggeredRules = triggeredRules;
    }

    public ProductsResponse withTriggeredRules(TriggeredRules triggeredRules) {
        this.triggeredRules = triggeredRules;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public ProductsResponse withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public List<Object> getStaticLinks() {
        return staticLinks;
    }

    public void setStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
    }

    public ProductsResponse withStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
        return this;
    }

    public String getSelectedDept() {
        return selectedDept;
    }

    public void setSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
    }

    public ProductsResponse withSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
        return this;
    }

    public String getMultiCatSelected() {
        return multiCatSelected;
    }

    public void setMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
    }

    public ProductsResponse withMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
        return this;
    }

    public String getEndecaCanonical() {
        return endecaCanonical;
    }

    public void setEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
    }

    public ProductsResponse withEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
        return this;
    }

}
