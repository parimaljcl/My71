package com.example.my71.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alexvasilkov.android.commons.adapters.ItemsAdapter;
import com.alexvasilkov.android.commons.ui.ContextHelper;
import com.alexvasilkov.android.commons.ui.Views;
import com.example.my71.Activities.FoldableListActivityy;
import com.example.my71.Activities.UnfoldableeDetailsActivityy;
import com.example.my71.R;
import com.example.my71.utils.GlideHelperr;
import com.example.my71.utils.Paintingg;

import java.util.Arrays;

public class PaintingsAdapterr extends ItemsAdapter<Paintingg, PaintingsAdapterr.ViewHolder>
        implements View.OnClickListener {

    public PaintingsAdapterr(Context context) {
        setItemsList(Arrays.asList(Paintingg.getAllPaintings(context.getResources())));
    }

    @Override
    protected ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        final ViewHolder holder = new ViewHolder(parent);
        holder.image.setOnClickListener(this);
        return holder;
    }

    @Override
    protected void onBindHolder(ViewHolder holder, int position) {
        final Paintingg item = getItem(position);

        holder.image.setTag(R.id.list_item_image, item);
        GlideHelperr.loadPaintingImage(holder.image, item);
        holder.title.setText(item.getTitle());
    }

    @Override
    public void onClick(View view) {
        final Paintingg item = (Paintingg) view.getTag(R.id.list_item_image);
        final Activity activity = ContextHelper.asActivity(view.getContext());

        if (activity instanceof UnfoldableeDetailsActivityy) {
            ((UnfoldableeDetailsActivityy) activity).openDetails(view, item);
        } else if (activity instanceof FoldableListActivityy) {
            Toast.makeText(activity, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    }

    static class ViewHolder extends ItemsAdapter.ViewHolder {
        final ImageView image;
        final TextView title;

        ViewHolder(ViewGroup parent) {
            super(Views.inflate(parent, R.layout.list_item));
            image = Views.find(itemView, R.id.list_item_image);
            title = Views.find(itemView, R.id.list_item_title);
        }
    }

}