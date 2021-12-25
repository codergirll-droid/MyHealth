package com.example.myhealth;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MentalHealth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health);

        ProgressBar vProgress ;


        VideoView videoView = (VideoView) findViewById(R.id.meditationVideo);
        VideoView videoView2 = (VideoView) findViewById(R.id.breathExerciseVideo);


        videoView.setVideoPath("android.resource://com.example.myhealth/" + R.raw.meditation);
        videoView.setVideoPath("android.resource://com.example.myhealth/" + R.raw.breathing_exercise);


        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        mediaController.setAnchorView(videoView2);
        videoView.setMediaController(mediaController);
        videoView2.setMediaController(mediaController);

        videoView.start();
        videoView2.start();

        vProgress = (ProgressBar) findViewById(R.id.videoProgress);
        vProgress.setVisibility(View.VISIBLE);

}
}
