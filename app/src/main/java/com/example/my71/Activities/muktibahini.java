package com.example.my71.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my71.R;

public class muktibahini extends AppCompatActivity {

    private Toolbar mToolbar;
    TextView TvMuktibahini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muktibahini);

        ToolBar();

        Intent intent = getIntent();
        String intentValue =  intent.getExtras().getString("IntentValue");

        TvMuktibahini = findViewById(R.id.tvMuktibahini);

        if (intentValue.equals("10")){

            TvMuktibahini = findViewById(R.id.tvMuktibahini);
            TvMuktibahini.setText(R.string.muktibahibistring);

        }


    }


    private void ToolBar() {

        mToolbar = findViewById( R.id.Sector_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.MuktiBahini);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }
}
