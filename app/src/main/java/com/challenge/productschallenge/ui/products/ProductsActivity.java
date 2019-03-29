package com.challenge.productschallenge.ui.products;

import android.os.Bundle;

import com.challenge.productschallenge.R;
import com.challenge.productschallenge.ui.base.BaseActivity;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

public class ProductsActivity extends BaseActivity {

    private static final int NUM_COLUMNS = 2;

    private ProductsAdapter productsAdapter;

    @BindView(R.id.products_recyclerview)
    RecyclerView productsRecyclerView;

    @Override
    protected int layoutRes() {
        return R.layout.activity_products;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initViews() {
        productsAdapter = new ProductsAdapter();
        productsRecyclerView.setLayoutManager(new GridLayoutManager(this, NUM_COLUMNS));
        productsRecyclerView.setAdapter(productsAdapter);
    }

}
