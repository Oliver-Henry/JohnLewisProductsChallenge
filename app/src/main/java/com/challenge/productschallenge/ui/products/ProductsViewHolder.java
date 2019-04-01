package com.challenge.productschallenge.ui.products;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.challenge.productschallenge.R;
import com.challenge.productschallenge.data.models.ProductsItem;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

class ProductsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.product_image_view)
    ImageView productImageView;
    @BindView(R.id.product_id_text)
    TextView productIdTextView;
    @BindView(R.id.product_title_text)
    TextView productTitleTextView;
    @BindView(R.id.product_now_price_label_text)
    TextView productNowPriceLabelTextView;
    @BindView(R.id.product_reduced_by_text)
    TextView productReducedByText;

    private Context context;


    public ProductsViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        context = itemView.getContext();
    }

    public void bind(ProductsItem product) {
        loadImage(product.getImageUrl(), productImageView);
        productIdTextView.setText(product.getId());
        productReducedByText.setText(context.getString(R.string.reduced_by, getPrice(product.getPriceReduction())));
        productTitleTextView.setText(product.getTitle());
        productNowPriceLabelTextView.setText(getPriceLabel(product.getWas(), product.getNowPrice()));
    }

    private void loadImage(String imageUrl, ImageView imageView) {
        Picasso.get()
                .load(imageUrl)
                .into(imageView);
    }


    private String getPriceLabel(String priceWas, String priceNow) {
        return context.getString(R.string.price_was_now, getPrice(priceWas), getPrice(priceNow));
    }

    private String getPrice(String priceVal) {
        double price = Double.parseDouble(priceVal);
        if (price < 10) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            return decimalFormat.format(price);
        }
        return Integer.toString((int) price);
    }

    private String getPrice(double price) {
        if (price < 10) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            return decimalFormat.format(price);
        }
        return Integer.toString((int) price);
    }

}
