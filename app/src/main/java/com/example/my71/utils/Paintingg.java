package com.example.my71.utils;

import android.content.res.Resources;
import android.content.res.TypedArray;

import com.example.my71.R;

public class Paintingg {
    private final int imageId;
    private final String title;
    private final String year;
    private final String location;

    private Paintingg(int imageId, String title, String year, String location) {
        this.imageId = imageId;
        this.title = title;
        this.year = year;
        this.location = location;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getLocation() {
        return location;
    }

    public static Paintingg[] getAllPaintings(Resources res) {
        String[] titles = res.getStringArray(R.array.paintingss_titles);
        String[] years = res.getStringArray(R.array.paintingss_years);
        String[] locations = res.getStringArray(R.array.paintingss_locations);
        TypedArray images = res.obtainTypedArray(R.array.paintingss_images);

        int size = titles.length;
        Paintingg[] paintinggs = new Paintingg[size];

        for (int i = 0; i < size; i++) {
            final int imageId = images.getResourceId(i, -1);
            paintinggs[i] = new Paintingg(imageId, titles[i], years[i], locations[i]);
        }

        images.recycle();

        return paintinggs;
    }
}
