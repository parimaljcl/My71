package com.example.my71.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.my71.R;

import pl.droidsonroids.gif.GifImageView;

public class Splash_Activity extends AppCompatActivity {

    Thread splashTread;

    ImageView l1;
    GifImageView l2;

    Button btnsub;
    Animation uptodown,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);


        uptodown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);
        uptodown.reset();
        l1 =  findViewById(R.id.l1);
        l1.clearAnimation();
        l1.startAnimation(uptodown);



        downtoup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downtoup);
        uptodown.reset();
        l2 =  findViewById(R.id.l2);
        l2.clearAnimation();
        l2.startAnimation(downtoup);


        thread();


    }


    private void thread() {

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 6000) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(Splash_Activity.this,
                            HomeActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Splash_Activity.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Splash_Activity.this.finish();
                }

            }
        };
        splashTread.start();

    }

}
