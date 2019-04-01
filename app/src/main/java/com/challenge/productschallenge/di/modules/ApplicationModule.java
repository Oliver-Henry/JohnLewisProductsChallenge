package com.challenge.productschallenge.di.modules;

import com.challenge.productschallenge.common.ColorConverter;
import com.challenge.productschallenge.common.SchedulerProvider;
import com.challenge.productschallenge.data.RepositoryImpl;
import com.challenge.productschallenge.data.remote.RemoteDataSourceImpl;
import com.challenge.productschallenge.data.remote.base.RemoteDataSource;
import com.challenge.productschallenge.data.remote.base.Repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module(includes = NetworkModule.class)
public class ApplicationModule {


    @Provides
    @Singleton
    Repository provideRepository(RepositoryImpl repository) {
        return repository;
    }

    @Provides
    @Singleton
    RemoteDataSource provideRemoteDataSource(RemoteDataSourceImpl remoteDataSource) {
        return remoteDataSource;
    }

    @Provides
    @Singleton
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @Singleton
    SchedulerProvider provideSchedulerProvider() {
        return new SchedulerProvider();
    }

    @Provides
    @Singleton
    ColorConverter provideColorConverter() {
        return new ColorConverter();
    }
}
