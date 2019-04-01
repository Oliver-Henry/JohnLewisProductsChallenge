package com.challenge.productschallenge.common.base;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

public class ResourceProvider implements BaseResourceProvider {

    @NonNull
    private final Context context;

    public ResourceProvider(@NonNull Context context) {
        this.context = Preconditions.checkNotNull(context, "context cannot be null");
    }

    @NonNull
    @Override
    public String getString(int resId) {
        return context.getString(resId);
    }

    @NonNull
    @Override
    public String getString(int resId, Object... formatArgs) {
        return context.getString(resId, formatArgs);
    }
}
