package com.example.my71.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.my71.R;
import com.example.my71.adapters.ExpandableListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mujib_Muktijuddho extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private ExpandableListViewAdapter expandableListViewAdapter;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;


    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mujib__muktijuddho);

        ToolBar();

        expandableListView = findViewById(R.id.expandable_list_view);
        listDataGroup = new ArrayList<>();
        listDataChild = new HashMap<>();
        initListData();

        expandableListViewAdapter = new ExpandableListViewAdapter(Mujib_Muktijuddho.this, listDataGroup, listDataChild );
        expandableListView.setAdapter(expandableListViewAdapter);

        //initViews();
        //initListData();
        //initListeners();
        //initObjects();

    }

    private void initViews() {
        expandableListView = findViewById(R.id.expandable_list_view);
    }

    private void initListeners() {
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {

            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {

            }
        });
    }

    private void initObjects() {
        listDataGroup = new ArrayList<>();
        listDataChild = new HashMap<>();
        expandableListViewAdapter = new ExpandableListViewAdapter(Mujib_Muktijuddho.this, listDataGroup, listDataChild );
        expandableListView.setAdapter(expandableListViewAdapter);
    }

    private void initListData() {
        listDataGroup.add(getString(R.string.introduction));
        listDataGroup.add(getString(R.string.educational_life));
        listDataGroup.add(getString(R.string.political_life));
        listDataGroup.add(getString(R.string.declaration_of_independence));
        listDataGroup.add(getString(R.string.confinement));
        listDataGroup.add(getString(R.string.adjuration));
        listDataGroup.add(getString(R.string.death));
        listDataGroup.add(getString(R.string.biography));

        String[] array;

        List<String>পরিচিতি = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_পরিচিতি);
        for (String item: array){
            পরিচিতি.add(item);
        }

        List<String>শিক্ষাজীবন = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_শিক্ষাজীবন);
        for (String item: array){
            শিক্ষাজীবন.add(item);
        }

        List<String>রাজনীতি = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_রাজনীতি);
        for (String item: array){
            রাজনীতি.add(item);
        }

        List<String>স্বাধীনতার_ঘোষণা = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_স্বাধীনতার_ঘোষণা);
        for (String item: array){
            স্বাধীনতার_ঘোষণা.add(item);
        }

        List<String>কারাবরণ = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_কারাবরণ);
        for (String item: array){
            কারাবরণ.add(item);
        }

        List<String>শপথ_গ্রহণ = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_শপথ_গ্রহণ);
        for (String item: array){
            শপথ_গ্রহণ.add(item);
        }

        List<String>মৃত্যু = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_মৃত্যু);
        for (String item: array){
            মৃত্যু.add(item);
        }

        List<String>আত্মজীবনীমূলক_বই = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_আত্মজীবনীমূলক_বই);
        for (String item: array){
            আত্মজীবনীমূলক_বই.add(item);
        }

        listDataChild.put(listDataGroup.get(0), পরিচিতি);
        listDataChild.put(listDataGroup.get(1), শিক্ষাজীবন);
        listDataChild.put(listDataGroup.get(2), রাজনীতি);
        listDataChild.put(listDataGroup.get(3), স্বাধীনতার_ঘোষণা);
        listDataChild.put(listDataGroup.get(4), কারাবরণ);
        listDataChild.put(listDataGroup.get(5), শপথ_গ্রহণ);
        listDataChild.put(listDataGroup.get(6), মৃত্যু);
        listDataChild.put(listDataGroup.get(7), আত্মজীবনীমূলক_বই);

        //expandableListViewAdapter.notifyDataSetChanged();
    }

    private void ToolBar() {

        mToolbar = findViewById( R.id.mujib_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.Mujib_Muktijuddho);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }

}
