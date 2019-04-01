package com.challenge.productschallenge.ui.base;

import android.os.Bundle;

import com.challenge.productschallenge.ui.ViewModelFactory;

import javax.inject.Inject;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity {

    @Inject
    protected ViewModelFactory viewModelFactory;
    protected ViewModelProvider viewModelProvider;

    @LayoutRes
    protected abstract int layoutRes();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutRes());
        ButterKnife.bind(this);
        viewModelProvider = ViewModelProviders.of(this, viewModelFactory);
    }

}
