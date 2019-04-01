package com.challenge.productschallenge.data;

import com.challenge.productschallenge.common.ColorConverter;
import com.challenge.productschallenge.data.models.ColorSwatch;
import com.challenge.productschallenge.data.models.Product;
import com.challenge.productschallenge.data.models.ProductsItem;
import com.challenge.productschallenge.data.remote.base.RemoteDataSource;
import com.challenge.productschallenge.data.remote.base.Repository;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;

public class RepositoryImpl implements Repository {

    private final RemoteDataSource remoteDataSource;
    private final ColorConverter colorConverter;

    @Inject
    public RepositoryImpl(RemoteDataSource remoteDataSource, ColorConverter colorConverter) {
        this.remoteDataSource = remoteDataSource;
        this.colorConverter = colorConverter;
    }

    @Override
    public Single<List<ProductsItem>> getProducts() {
        return remoteDataSource.getProducts()
                .flatMap(Observable::fromIterable)
                .filter(product -> !product.getPrice().getWas().isEmpty())
                .toList()
                .map(this::getProductsItemsFromProducts);
    }


    private List<ProductsItem> getProductsItemsFromProducts(List<Product> products) {
        List<ProductsItem> productsItems = new ArrayList<>();
        for (Product product : products) {
            productsItems.add(getProductItemFromProduct(product));
        }
        Collections.sort(productsItems, (item1, item2) -> (int) (item2.getPriceReduction() - item1.getPriceReduction()));
        return productsItems;
    }

    private ProductsItem getProductItemFromProduct(Product product) {
        ProductsItem productsItem = new ProductsItem();
        productsItem.setId(product.getProductId());
        productsItem.setNowPrice(getNowPrice(product.getPrice().getNow()));
        productsItem.setColorSwatches(getColorSwatches(product.getColorSwatches()));
        productsItem.setTitle(product.getTitle());
        productsItem.setImageUrl("https://".concat(product.getImage()));
        productsItem.setPriceReduction(getPriceReduction(productsItem.getNowPrice(), product.getPrice().getWas()));
        productsItem.setWas(product.getPrice().getWas());
        return productsItem;
    }

    private List<ColorSwatch> getColorSwatches(List<ColorSwatch> colorSwatches) {
        List<ColorSwatch> colorSwatchList = new ArrayList<>();
        for (ColorSwatch colorSwatch : colorSwatches) {
            colorSwatch.setRgbColor(colorConverter.getRGBColorFor(colorSwatch.getBasicColor()));
            if (!colorSwatchList.contains(colorSwatch)) { // avoid adding duplicate colors
                colorSwatchList.add(colorSwatch);
            }
        }
        return colorSwatchList;
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
}
