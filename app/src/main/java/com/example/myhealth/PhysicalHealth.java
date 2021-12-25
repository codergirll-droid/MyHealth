package com.example.myhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PhysicalHealth extends AppCompatActivity {

    EditText txtDistance;
    EditText stepsCount;
    EditText ExtraBurnedCalories;
    TextView totalCalorie;
    FloatingActionButton backMain;
    Button btnENTER;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_health);


        txtDistance = (EditText) findViewById(R.id.txtDistanceInKm);
        stepsCount = (EditText) findViewById(R.id.txtStepsCount);
        ExtraBurnedCalories = (EditText) findViewById(R.id.txtExtraBurnedCalories);
        totalCalorie = (TextView) findViewById(R.id.totalCalorieBurned);



        btnENTER = (Button) findViewById(R.id.btnEnter);
        btnENTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= 0, b = 0, c = 0, total ;
                if (txtDistance.getText() != null && !txtDistance.getText().toString().equals("")) {
                    try {
                        a = Integer.parseInt(txtDistance.getText().toString());
                    } catch (Exception e) {
                        a = 0;
                    }
                }

                if (stepsCount.getText() != null && !stepsCount.getText().toString().equals("")) {
                    try {
                        b = Integer.parseInt(stepsCount.getText().toString());
                    } catch (Exception e) {
                        b = 0;
                    }
                }
                if (ExtraBurnedCalories.getText() != null && !ExtraBurnedCalories.getText().toString().equals("")) {
                    try {
                        c = Integer.parseInt(ExtraBurnedCalories.getText().toString());
                    } catch (Exception e) {
                        c = 0;
                    }
                }
                total = (a + b + c);
                totalCalorie.setText(String.valueOf(total));
            }
        });

        backMain = (FloatingActionButton) findViewById(R.id.btnBacktoMain3);
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();

            }
        });

    }

    public void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}