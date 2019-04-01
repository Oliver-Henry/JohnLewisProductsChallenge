package com.challenge.productschallenge.data.remote.base;

import com.challenge.productschallenge.data.models.ProductsItem;

import java.util.List;

import io.reactivex.Single;

public interface Repository {

    Single<List<ProductsItem>> getProducts();

}
