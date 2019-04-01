package com.challenge.productschallenge.ui.products;

import com.challenge.productschallenge.data.models.Product;
import com.challenge.productschallenge.data.models.ProductsItem;
import com.challenge.productschallenge.data.remote.base.Repository;
import com.challenge.productschallenge.ui.base.BaseViewModel;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import androidx.lifecycle.MutableLiveData;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ProductsViewModel extends BaseViewModel {

    private MutableLiveData<List<ProductsItem>> productsItemLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoadingLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> showSnackBarLiveData = new MutableLiveData<>();

    @Inject
    public ProductsViewModel(CompositeDisposable compositeDisposable, Repository repository) {
        super(compositeDisposable, repository);
        getProducts();
    }

    private void getProducts() {
        compositeDisposable.add(repository.getProducts()
                .subscribeOn(Schedulers.io())
                .map(this::getProductsItemsFromProducts)
                .doOnSubscribe(disposable -> isLoadingLiveData.setValue(true))
                .doFinally(() -> isLoadingLiveData.setValue(false))
                .subscribe(productsItems -> productsItemLiveData.setValue(productsItems),
                        throwable -> showSnackBarLiveData.setValue(true)));
    }

    private List<ProductsItem> getProductsItemsFromProducts(List<Product> products) {
        List<ProductsItem> productsItems = new ArrayList<>();
        for (Product product : products) {
            productsItems.add(getProductItemFromProduct(product));
        }
        return productsItems;
    }

    private ProductsItem getProductItemFromProduct(Product product) {
        ProductsItem productsItem = new ProductsItem();
        productsItem.setId(product.getProductId());
        productsItem.setNowPrice(getNowPrice(product.getPrice().getNow()));
        productsItem.setColorSwatches(product.getColorSwatches());
        productsItem.setTitle(product.getTitle());
        productsItem.setPriceReduction(getPriceReduction(productsItem.getNowPrice(), product.getPrice().getWas()));
        return productsItem;
    }

    private double getPriceReduction(String nowPrice, String wasPrice) {
        Double now = Double.parseDouble(nowPrice);
        Double was = Double.parseDouble(wasPrice);
        double reduction = 0;
        if (was > now) {
            reduction = was - now;
        }
        return reduction;
    }

    private String getNowPrice(Object nowPrice) {
        String nowValue = "";
        if (nowPrice instanceof String) {
            nowValue = (String) nowPrice;
        } else if (nowPrice instanceof LinkedTreeMap) {
            // We assume, in the case that the returned 'now' value is an Object,
            // that the now price will be the 'to' value.
            Object toPrice = ((LinkedTreeMap) nowPrice).get("to");
            nowValue = Objects.requireNonNull(toPrice).toString();
        }
        return nowValue;
    }

    public MutableLiveData<List<ProductsItem>> getProductsItemLiveData() {
        return productsItemLiveData;
    }

    public MutableLiveData<Boolean> getIsLoadingLiveData() {
        return isLoadingLiveData;
    }

    public MutableLiveData<Boolean> getShowSnackBarLiveData() {
        return showSnackBarLiveData;
    }
}
