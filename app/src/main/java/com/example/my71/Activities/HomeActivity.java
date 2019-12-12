package com.example.my71.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

import com.example.my71.R;

public class HomeActivity extends AppCompatActivity {

    private CardView muktijuddo,mujib,ekattorcovi,ekkatorvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        casting();
        clickListener();
    }

    private void clickListener() {
        muktijuddo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mujib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ekattorcovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ekkatorvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    private void casting() {
        muktijuddo = findViewById(R.id.muktijuddoID);
        mujib = findViewById(R.id.mujibID);
        ekattorcovi = findViewById(R.id.ekkatorercobiID);
        ekkatorvideo = findViewById(R.id.ekkatorervideoID);
    }
}
