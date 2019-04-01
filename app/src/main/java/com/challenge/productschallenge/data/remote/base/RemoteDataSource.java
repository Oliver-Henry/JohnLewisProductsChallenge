package com.challenge.productschallenge.data.remote.base;

import com.challenge.productschallenge.data.models.Product;

import java.util.List;

import io.reactivex.Observable;

public interface RemoteDataSource {
    Observable<List<Product>> getProducts();
}
