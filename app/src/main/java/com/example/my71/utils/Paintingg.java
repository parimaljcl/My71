package com.example.my71.utils;

import android.content.res.Resources;
import android.content.res.TypedArray;

import com.example.my71.R;

public class Paintingg {
    private final int imageId;
    private final String title;
//    private final String year;
    private final String description;

    private Paintingg(int imageId, String title, String description) {
        this.imageId = imageId;
        this.title = title;
//        this.year = year;
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

//    public String getYear() {
//        return year;
//    }

    public String getLocation() {
        return description;
    }

    public static Paintingg[] getAllPaintings(Resources res) {
        String[] titles = res.getStringArray(R.array.chobi_titles);
//        String[] years = res.getStringArray(R.array.paintingss_years);
        String[] description = res.getStringArray(R.array.chobi_description);
        TypedArray images = res.obtainTypedArray(R.array.chobi_images);

        int size = titles.length;
        Paintingg[] paintinggs = new Paintingg[size];

        for (int i = 0; i < size; i++) {
            final int imageId = images.getResourceId(i, -1);
            paintinggs[i] = new Paintingg(imageId, titles[i], description[i]);
        }

        images.recycle();

        return paintinggs;
    }
}
