package com.challenge.productschallenge.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

public interface BaseResourceProvider {

    @NonNull
    String getString(@StringRes final int id);


    @NonNull
    String getString(@StringRes final int resId, final Object... formatArgs);
}
