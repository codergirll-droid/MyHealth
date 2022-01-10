package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

import java.io.File;

public class MainActivity extends AppCompatActivity{

    Button goToPhysicalHealth;
    Button goToMentalHealth;
    Button goToNutrition;
    Button goToHydration;
    Button goToGeneralHealthTips;
    Button goToStatistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToPhysicalHealth = (Button) findViewById(R.id.goToPhysicalHealth);
        goToPhysicalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("PhysicalHealth");
            }
        });
        goToMentalHealth = (Button) findViewById(R.id.goToMentalHealth);
        goToMentalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("MentalHealth");
            }
        });
        goToNutrition = (Button) findViewById(R.id.goToNutrition);
        goToNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Nutrition");
            }
        });
        goToHydration = (Button) findViewById(R.id.goToHydration);
        goToHydration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("hydration");
            }
        });
        goToGeneralHealthTips = (Button) findViewById(R.id.goToGeneralHealthTips);
        goToGeneralHealthTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("tips");
            }
        });
        goToStatistics = (Button) findViewById(R.id.goToStatistics);
        goToStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("stats");
            }
        });



    }

    public void openActivity(String className){
        Intent intent;
        switch (className){
            case "PhysicalHealth":
                intent = new Intent(this, PhysicalHealth.class);
                startActivity(intent);
                break;
            case "MentalHealth":
                intent = new Intent(this, MentalHealth.class);
                startActivity(intent);
                break;
            case "Nutrition":
                intent = new Intent(this, Nutrition.class);
                startActivity(intent);
                break;
            case "hydration":
                intent = new Intent(this, hydration.class);
                startActivity(intent);
                break;
            case "tips":
                intent = new Intent(this, fragment.class);
                startActivity(intent);
                break;
            case "stats":
                intent = new Intent(this, statistics.class);
                startActivity(intent);
                break;

        }



    }


}