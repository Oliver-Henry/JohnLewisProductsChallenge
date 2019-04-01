package com.challenge.productschallenge.ui.products;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.challenge.productschallenge.R;
import com.challenge.productschallenge.ui.base.BaseActivity;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

public class ProductsActivity extends BaseActivity {

    private ProductsAdapter productsAdapter;
    private ProductsViewModel viewModel;

    @BindView(R.id.parent_container)
    FrameLayout parent;
    @BindView(R.id.products_recyclerview)
    RecyclerView productsRecyclerView;
    @BindView(R.id.progress_circular)
    ProgressBar progressBar;


    @Override
    protected int layoutRes() {
        return R.layout.activity_products;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = viewModelProvider.get(ProductsViewModel.class);

        initViews();

        getIsLoading();
        getProducts();
        getShowSnackBar();
    }

    protected void initViews() {
        productsAdapter = new ProductsAdapter();
        productsRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        productsRecyclerView.setAdapter(productsAdapter);
    }

    private void getShowSnackBar() {
        viewModel.getShowSnackBarLiveData().observe(this, showSnackBar -> {
            Snackbar.make(parent, getString(R.string.error_message_string), Snackbar.LENGTH_LONG).show();
        });
    }

    private void getProducts() {
        viewModel.getProductsItemLiveData().observe(this, productsItems -> {
            productsAdapter.setProductList(productsItems);
        });
    }

    private void getIsLoading() {
        viewModel.getIsLoadingLiveData().observe(this, isLoading -> {
            progressBar.setVisibility(isLoading ? View.VISIBLE : View.GONE);
        });
    }
}
