package com.example.my71.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my71.R;
import com.example.my71.adapters.VideoAdapter;
import com.example.my71.models.Video;

import java.util.Vector;

public class VideoActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<Video> youtubeVideos = new Vector<Video>();

    //toolbar(Akash)
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        //toolbar(Akash)
        ToolBar();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youtubeVideos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zGhUSy-SuT8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mYehpS9_PRk\n\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-vYuOINCNi4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nE6REh24GSM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ROHdK_QVwOQ\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
    }


    private void ToolBar() {

        mToolbar = findViewById( R.id.Video_toolbar );
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);

        //toolbar name ==>
        mTitle.setText(R.string.ekattorervideo);
        setSupportActionBar( mToolbar );

        getSupportActionBar().setDisplayShowTitleEnabled( false );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }

}
