package com.challenge.productschallenge.ui.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.challenge.productschallenge.R;
import com.challenge.productschallenge.data.models.Product;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsViewHolder> {

    private List<Product> productList = new ArrayList<>();

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.products_list_recycler_view_item, parent, false);
        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public void setProductList(List<Product> products) {
        if (!productList.isEmpty()) {
            productList.clear();
        }
        productList.addAll(products);
        notifyDataSetChanged();
    }
}
