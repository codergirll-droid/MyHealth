package com.example.myhealth;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Timer;
import java.util.TimerTask;

//Uzay

public class MentalHealth extends AppCompatActivity {

    ProgressBar vProgress;
    VideoView videoView;
    VideoView videoView2;
    FloatingActionButton btnMain ;
    int progress ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health);


        vProgress = (ProgressBar) findViewById(R.id.videoProgress);
        videoView = (VideoView) findViewById(R.id.meditationVideo);
        videoView2 = (VideoView) findViewById(R.id.breathExerciseVideo);

        vProgress.setMax(100);
        progress =vProgress.getProgress();


        videoView.setVideoPath("android.resource://com.example.myhealth/" + R.raw.meditation);
        videoView2.setVideoPath("android.resource://com.example.myhealth/" + R.raw.breathing_exercise);


        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.requestFocus();


        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);
        videoView2.requestFocus();


        Thread view1 = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_DISPLAY);
                vProgress.setProgress(progress++);  // value of increment
                videoView.start();
            }
        });

        Thread view2 = new Thread(new Runnable() {

            @Override
            public void run() {
                android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_DISPLAY);
                vProgress.setProgress(progress++);  // value of increment
                videoView2.start();
            }
        });


        btnMain = (FloatingActionButton) findViewById(R.id.btnBacktoMain9);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain2();

            }
        });
    }
    public void goToMain2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

