package com.example.my71.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.Toast;

import com.example.my71.R;

public class HomeActivity extends AppCompatActivity {

    private Button mujib,ekattorcovi,ekkatorvideo;
    private Button muktijuddo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        casting();
        clickListener();
        setAnimation();

    }

    private void setAnimation() {
        if(Build.VERSION.SDK_INT>20) {
            Slide slide = new Slide();
            slide.setSlideEdge(Gravity.LEFT);
            slide.setDuration(300);
            slide.setInterpolator(new DecelerateInterpolator());
            getWindow().setExitTransition(slide);
            getWindow().setEnterTransition(slide);
        }
    }


    private void clickListener() {
        muktijuddo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MuktiJudderItihasActivity.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this);
                    startActivity(i,options.toBundle());
                }else {
                    startActivity(i);
                }
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
