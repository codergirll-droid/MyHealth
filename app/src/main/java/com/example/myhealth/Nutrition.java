package com.example.myhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

//Uzay

public class Nutrition extends AppCompatActivity {

    FloatingActionButton buttonNext ;
    FloatingActionButton buttonBack ;
    CheckBox apple ;
    CheckBox egg ;
    CheckBox pasta ;
    CheckBox pizza ;
    CheckBox broccoli ;
    CheckBox banana ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);


        apple = (CheckBox) findViewById(R.id.apple);
        egg = (CheckBox) findViewById(R.id.egg);
        pasta = (CheckBox) findViewById(R.id.pasta);
        pizza = (CheckBox) findViewById(R.id.pizza);
        broccoli = (CheckBox) findViewById(R.id.broccoli);
        banana = (CheckBox) findViewById(R.id.banana);


        buttonNext = (FloatingActionButton) findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Nutrition.this, foods.class);
                intent.putExtra("Apple", apple.isChecked());
                intent.putExtra("Egg", egg.isChecked());
                intent.putExtra("Pasta", pasta.isChecked());
                intent.putExtra("Pizza", pizza.isChecked());
                intent.putExtra("Broccoli", broccoli.isChecked());
                intent.putExtra("Banana", banana.isChecked());
                startActivity(intent);

            }

        });


        buttonBack = (FloatingActionButton) findViewById(R.id.btnBack1);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain3();

            }
        });
    }

    public void goToMain3() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
