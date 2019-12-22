package com.example.my71.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.my71.MainActivity;
import com.example.my71.R;

public class Purbo_itihash extends AppCompatActivity {


    //toolbar(Akash)
    private Toolbar mToolbar;
    private Button btn1952, btn1966, btn1969, btnBoisommo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purbo_itihash);


        ToolBar();
        casting();
        clickListener();


    }

    private void ToolBar() {

        mToolbar = findViewById( R.id.purbo_itihash_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.app_name);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }

    private void casting() {
        btn1952 = findViewById(R.id.baonnoID);
        btn1966 = findViewById(R.id.chesottiID);
        btn1969 = findViewById(R.id.unosotturID);
        btnBoisommo = findViewById(R.id.boisommoID);

    }

    private void clickListener() {
        btn1952.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Purbo_itihash.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btn1966.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Purbo_itihash.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn1969.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Purbo_itihash.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnBoisommo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Purbo_itihash.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }



}
