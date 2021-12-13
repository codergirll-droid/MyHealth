package com.example.myhealth;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PhysicalHealth extends AppCompatActivity {

    EditText distanceInKm ;
    int distance ;
    EditText stepsCount ;
    int steps ;
    EditText ExtraBurnedCalories ;
    int extraCalories ;
    EditText totalCalorie ;
    int totalCalorieIntake ;
    FloatingActionButton backMain ;
    Button OK_btn1 ;
    Button OK_btn2 ;
    Button OK_btn3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_health);

        distanceInKm = (EditText) findViewById(R.id.txtDistanceInKm) ;
        stepsCount = (EditText) findViewById(R.id.txtStepsCount) ;
        ExtraBurnedCalories = (EditText) findViewById(R.id.txtExtraBurnedCalories) ;
        totalCalorie = (EditText) findViewById(R.id.txtTotalCalorieIntake) ;




    }
}
