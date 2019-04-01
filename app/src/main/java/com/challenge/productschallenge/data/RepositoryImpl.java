package com.challenge.productschallenge.data;

import com.challenge.productschallenge.data.models.Product;
import com.challenge.productschallenge.data.remote.base.RemoteDataSource;
import com.challenge.productschallenge.data.remote.base.Repository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;

public class RepositoryImpl implements Repository {

    private final RemoteDataSource remoteDataSource;

    @Inject
    public RepositoryImpl(RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public Single<List<Product>> getProducts() {
        return remoteDataSource.getProducts()
                .flatMap(Observable::fromIterable)
                .filter(product -> !product.getPrice().getWas().isEmpty())
                .toList();
    }
}
