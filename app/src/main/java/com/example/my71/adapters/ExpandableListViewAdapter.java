package com.example.my71.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.my71.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {


    private Context context;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;

    public ExpandableListViewAdapter(Context context, List<String>listDataGroup, HashMap<String, List<String>>listDataChild){
        this.context = context;
        this.listDataGroup = listDataGroup;
        this.listDataChild = listDataChild;
    }

    @Override
    public int getGroupCount() {
        return this.listDataGroup.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.listDataChild.get(this.listDataGroup.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.listDataGroup.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return this.listDataChild.get(this.listDataGroup.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        String headerTitle = (String)getGroup(i);
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.mujib_list_group,null);
        }
        TextView textViewGroup = view.findViewById(R.id.text_view_group);
        textViewGroup.setTypeface(null, Typeface.BOLD);
        textViewGroup.setText(headerTitle);

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childText = (String)getChild(i, i1);
        if (view==null){
            LayoutInflater layoutInflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.mujib_list_child,null);
        }
        TextView textViewChild = view.findViewById(R.id.text_view_child);

        textViewChild.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
