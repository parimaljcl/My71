package com.example.my71.Activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.my71.R;


public class HomeActivity extends AppCompatActivity {

    private Button mujib,ekattorcovi,ekkatorvideo;
    private Button muktijuddo;

    //toolbar(Akash)
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_home );

        //toolbar(Akash)
        ToolBar();

        casting();
        clickListener();
        setAnimation();

        //Set Title and logo
        getSupportActionBar().setLogo(R.drawable.title_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

    }

    private void ToolBar() {

        mToolbar = findViewById( R.id.Home_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.app_name);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( false );

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
                Intent intent=new Intent(HomeActivity.this,Mujib_Muktijuddho.class);
                startActivity(intent);
            }
        });

        ekattorcovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,ChhobiActivity.class);
                startActivity(intent);
            }
        });
        ekkatorvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,VideoActivity.class);
                startActivity(intent);
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
