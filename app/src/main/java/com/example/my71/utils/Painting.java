package com.example.my71.utils;

import android.content.res.Resources;
import android.content.res.TypedArray;

import com.example.my71.R;

public class Painting {
    private final int imageId;
    private final String title;
    private final String description;

    private Painting(int imageId, String title, String description)
    {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
    }

    public int getImageId()
    {
        return imageId;
    }

    public String getTitle()
    {
        return title;
    }


    public String getLocation()
    {
        return description;
    }

    public static Painting[] getAllPaintings(Resources res)
    {
        String[] titles = res.getStringArray(R.array.chobi_titles);
        String[] description = res.getStringArray(R.array.chobi_description);
        TypedArray images = res.obtainTypedArray(R.array.chobi_images);

        int size = titles.length;
        Painting[] paintings = new Painting[size];

        for (int i = 0; i < size; i++)
        {
            final int imageId = images.getResourceId(i, -1);
            paintings[i] = new Painting(imageId, titles[i], description[i]);
        }

        images.recycle();

        return paintings;
    }
}
