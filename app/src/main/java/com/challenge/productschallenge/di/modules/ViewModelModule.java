package com.challenge.productschallenge.di.modules;

import com.challenge.productschallenge.di.ViewModelKey;
import com.challenge.productschallenge.ui.ViewModelFactory;
import com.challenge.productschallenge.ui.products.ProductsViewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(ProductsViewModel.class)
    abstract ViewModel bindProductViewModel(ProductsViewModel productsViewModel);

}
