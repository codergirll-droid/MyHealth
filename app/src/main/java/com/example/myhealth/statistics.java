package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class statistics extends AppCompatActivity {


    FloatingActionButton btnBack;
    TextView name, age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        //SET BACK BUTTON
        btnBack = (FloatingActionButton) findViewById(R.id.btnBacktoMain2);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMain();
            }
        });

        //GET NAME, AGE, HEIGHT, WEIGHT
        name = (TextView) findViewById(R.id.Name);
        age = (TextView) findViewById(R.id.Age);
        height = (TextView) findViewById(R.id.Height);
        weight = (TextView) findViewById(R.id.Weight);

        //! setup the name, age, height, weight from the firebase
        // example code : name.setText("aaa");


        //! get calories taken and calories needed to take from firebase and put them to display


        //! get mental health progress and physical health progress and display them

    }





    //GO TO MAIN MENU FOR BACK BUTTON
    public void goToMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}