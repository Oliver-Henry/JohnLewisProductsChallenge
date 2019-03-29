package com.challenge.productschallenge.data.models;

import java.util.ArrayList;
import java.util.List;

public class ProductsScreenState {

    private boolean isLoading;
    private List<Product> productList = new ArrayList<>();

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProducts(List<Product> products) {
        productList.addAll(products);
    }
}
