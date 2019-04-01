package com.challenge.productschallenge.di.modules;

import com.challenge.productschallenge.BuildConfig;
import com.challenge.productschallenge.common.Constants;
import com.challenge.productschallenge.data.remote.ProductsService;
import com.challenge.productschallenge.scopes.LoggingInterceptor;
import com.challenge.productschallenge.scopes.NetworkInterceptor;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {


    @Provides
    @LoggingInterceptor
    Interceptor provideLoggingInterceptor() {
        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Provides
    @NetworkInterceptor
    Interceptor provideAPIKeyInterceptor() {
        return chain -> {
            HttpUrl originalUrl = chain.request().url();
            HttpUrl modifiedUrl = originalUrl.newBuilder()
                    .addQueryParameter("key", BuildConfig.API_KEY)
                    .build();
            Request request = chain.request().newBuilder()
                    .url(modifiedUrl)
                    .build();
            return chain.proceed(request);
        };
    }


    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(@LoggingInterceptor Interceptor loggingInterceptor, @NetworkInterceptor Interceptor apiInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(apiInterceptor)
                .connectTimeout(Constants.REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Constants.REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    ProductsService provideProductsService(Retrofit retrofit) {
        return retrofit.create(ProductsService.class);
    }

}
