package com.challenge.productschallenge.data.remote;

import com.challenge.productschallenge.BuildConfig;
import com.challenge.productschallenge.data.models.Product;
import com.challenge.productschallenge.data.models.ProductsResponse;
import com.challenge.productschallenge.data.remote.base.RemoteDataSource;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class RemoteDataSourceImpl implements RemoteDataSource {

    private final ProductsService productsService;

    @Inject
    public RemoteDataSourceImpl(ProductsService productsService) {
        this.productsService = productsService;
    }

    @Override
    public Observable<List<Product>> getProducts() {
        return productsService.getProducts(BuildConfig.API_KEY)
                .map(ProductsResponse::getProducts);
    }
}
