package com.example.myhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

//Uzay


public class foods extends AppCompatActivity {

    TextView txtFood;
    FloatingActionButton buttonBack2;
    TextView totalIntake ;
    int a =0 , b=0 , c=0, d=0, e=0 , f=0;
    int totalCal=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_foods);

        txtFood = (TextView) findViewById(R.id.txtFood);
        totalIntake = (TextView) findViewById(R.id.txtTotalCalorieIntake);


        Intent intent = getIntent();

        Boolean apple = this.getIntent().getExtras().getBoolean("Apple", false);
        Boolean egg = this.getIntent().getExtras().getBoolean("Egg", false);
        Boolean pasta = this.getIntent().getExtras().getBoolean("Pasta", false);
        Boolean pizza = this.getIntent().getExtras().getBoolean("Pizza", false);
        Boolean broccoli = this.getIntent().getExtras().getBoolean("Broccoli", false);
        Boolean banana = this.getIntent().getExtras().getBoolean("Banana", false);


        String food=" ";

        if(apple){
            food+="Apple -> 5 cal\n";
            a=5;
        }

        if(egg){
            food+="Egg -> 10 cal\n";
            b=10;
        }

        if(pasta){
            food+="Pasta -> 150 cal\n ";
            c=150;
        }

        if (pizza) {
            food += "Pizza -> 500 cal\n";
            d=500;
        }

        if (broccoli) {
            food += "Broccoli -> 15 cal\n";
            e=15;
        }

        if (banana) {
            food += "Banana -> 50 cal\n";
            f=50;
        }
        totalCal = (a+b+c+d+e+f);

        txtFood.setText(food);
        totalIntake.setText(String.valueOf(totalCal));

        buttonBack2 =(FloatingActionButton) findViewById(R.id.btnBack8);
        buttonBack2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
        goToMain4();
        }
    });
}

    public void goToMain4() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


