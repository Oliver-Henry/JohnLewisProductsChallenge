package com.challenge.productschallenge.di.components;

import com.challenge.productschallenge.BaseApplication;
import com.challenge.productschallenge.di.modules.ApplicationModule;
import com.challenge.productschallenge.scopes.AppScoped;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScoped
@Component(modules = {AndroidSupportInjectionModule.class, ApplicationModule.class})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    abstract  class Builder extends AndroidInjector.Builder<BaseApplication>{}
}
