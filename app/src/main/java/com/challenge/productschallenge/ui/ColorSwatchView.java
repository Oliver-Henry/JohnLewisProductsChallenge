package com.challenge.productschallenge.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.challenge.productschallenge.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ColorSwatchView extends RelativeLayout {


    @BindView(R.id.color_image_view)
    ImageView colorImageView;

    public ColorSwatchView(Context context) {
        super(context);
        init();
    }


    public ColorSwatchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ColorSwatchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ColorSwatchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void setBackGroundColor(String color) {
        colorImageView.setBackgroundColor(Color.parseColor(color));
    }

    private void init() {
        inflate(getContext(), R.layout.view_color_swatch, this);
        ButterKnife.bind(this);
    }

}
