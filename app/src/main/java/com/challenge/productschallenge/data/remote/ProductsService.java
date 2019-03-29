package com.challenge.productschallenge.data.remote;

import com.challenge.productschallenge.data.models.ProductsResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductsService {

    @GET
    Single<ProductsResponse> getProducts(@Query("key") String key);
}
