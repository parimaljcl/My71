package com.example.my71.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GlideHelperr {

    private GlideHelperr() {}

    public static void loadPaintingImage(ImageView image, Paintingg paintingg) {
        Glide.with(image.getContext().getApplicationContext())
                .load(paintingg.getImageId())
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image);
    }

}