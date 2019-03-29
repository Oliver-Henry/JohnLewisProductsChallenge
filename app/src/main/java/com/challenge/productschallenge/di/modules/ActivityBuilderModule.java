package com.challenge.productschallenge.di.modules;

import com.challenge.productschallenge.ui.products.ProductsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract ProductsActivity bindProductsActivity();
}
