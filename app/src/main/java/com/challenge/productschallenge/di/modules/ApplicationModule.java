package com.challenge.productschallenge.di.modules;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module(includes = NetworkModule.class)
public abstract class ApplicationModule {

    @Binds
    abstract Context bindContext(Application application);
}
