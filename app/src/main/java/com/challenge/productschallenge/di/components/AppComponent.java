package com.challenge.productschallenge.di.components;

import com.challenge.productschallenge.ProductsApplication;
import com.challenge.productschallenge.di.modules.ActivityBuilderModule;
import com.challenge.productschallenge.di.modules.ApplicationModule;
import com.challenge.productschallenge.di.modules.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ApplicationModule.class,
        ViewModelModule.class, ActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<ProductsApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ProductsApplication>{}
}
