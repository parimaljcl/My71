package com.example.my71.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my71.R;

public class muktibahini extends AppCompatActivity {

    private Toolbar mToolbar;
    TextView TvMuktibahini;
    ImageView IvImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muktibahini);


        Intent intent = getIntent();
        String intentValue =  intent.getExtras().getString("IntentValue");

        TvMuktibahini = findViewById(R.id.tvMuktibahini);
        IvImg = findViewById(R.id.ivImg);

        mToolbar = findViewById( R.id.Sector_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        if (intentValue.equals("10")){


            TvMuktibahini.setText(R.string.muktibahibistring);
            mTitle.setText(R.string.MuktiBahini);
            IvImg.setImageResource(R.drawable.muktibahini);

        }

        if (intentValue.equals("11")){


            TvMuktibahini.setText(R.string.buddhijibistring);
            mTitle.setText(R.string.Buddijibi);
            IvImg.setImageResource(R.drawable.buddhijibii);

        }

        if (intentValue.equals("12")){


            TvMuktibahini.setText(R.string.sevenmarchstring);
            mTitle.setText(R.string.Seven_March);
            IvImg.setImageResource(R.drawable.sevenmarchh);

        }


        setSupportActionBar( mToolbar );
        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


    }


}
