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

public class MuktiJudderItihasActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    Button Sector,Gerila,Muktibahini,Buddhijibi,SevenMarch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mukti_judder_itihas);

        ToolBar();
        Casting();
        clickListener();
        setAnimation();
    }

    private void ToolBar() {

        mToolbar = findViewById( R.id.MujibMuktijuddho_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.Muktijuddher_itihash);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }

    private void Casting() {
        Sector = findViewById(R.id.idSector);
        Gerila = findViewById(R.id.idGerila);
        Muktibahini = findViewById(R.id.idMuktibahini);
        Buddhijibi =findViewById(R.id.idBuddhijibi);
        SevenMarch = findViewById(R.id.idSevenMarch);
    }


    private void clickListener() {

        Sector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MuktiJudderItihasActivity.this,UnfoldableeDetailsActivityy.class);
                if(Build.VERSION.SDK_INT>20){
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MuktiJudderItihasActivity.this);
                    startActivity(i,options.toBundle());
                }else {
                    startActivity(i);
                }
            }
        });

        Gerila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MuktiJudderItihasActivity.this,Gerila.class);
                //intent.putExtra("IntentValue","9");
                startActivity(intent);
            }
        });

        Muktibahini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MuktiJudderItihasActivity.this,muktibahini.class);
                intent.putExtra("IntentValue","10");
                startActivity(intent);
            }
        });
        Buddhijibi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MuktiJudderItihasActivity.this,muktibahini.class);
                intent.putExtra("IntentValue","11");
                startActivity(intent);
            }
        });
        SevenMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MuktiJudderItihasActivity.this,muktibahini.class);
                intent.putExtra("IntentValue","12");
                startActivity(intent);
            }
        });


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
}
