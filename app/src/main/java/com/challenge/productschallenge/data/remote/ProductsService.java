package com.challenge.productschallenge.data.remote;

import com.challenge.productschallenge.BuildConfig;
import com.challenge.productschallenge.data.models.ProductsResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductsService {

    @GET(BuildConfig.RELATIVE_URL)
    Observable<ProductsResponse> getProducts(@Query("key") String key);
}
