package com.example.myhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class PhysicalHealth extends AppCompatActivity {

    EditText txtDistance ;
    EditText stepsCount ;
    EditText ExtraBurnedCalories ;
    EditText totalCalorie ;
    TextView distance ;
    TextView steps ;
    TextView extraCalorie ;
    TextView totalCalorieIntake ;
    int countOfSteps, kmCount, calorieCount ;
    FloatingActionButton backMain ;
    Button btnENTER ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_health);

        distance = (TextView) findViewById(R.id.txtDistance );
        txtDistance = (EditText) findViewById(R.id.txtDistanceInKm);

        steps = (TextView) findViewById(R.id.txtSteps) ;
        stepsCount = (EditText) findViewById(R.id.txtStepsCount) ;

        extraCalorie = (TextView) findViewById(R.id.txtExtraCalorie);
        ExtraBurnedCalories = (EditText) findViewById(R.id.txtExtraBurnedCalories) ;

        totalCalorieIntake = (TextView) findViewById(R.id.txtTotalCalorie) ;
        totalCalorie = (EditText) findViewById(R.id.txtTotalCalorieIntake) ;

        btnENTER = (Button) findViewById(R.id.btnEnter) ;
        btnENTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countOfSteps = Integer.parseInt(stepsCount.getText().toString());
                kmCount =Integer.parseInt(distance.getText().toString());
                calorieCount = Integer.parseInt(ExtraBurnedCalories.getText().toString());

                showToast(countOfSteps);
                showToast(kmCount);
                showToast(calorieCount);
            }
        });

        backMain =(FloatingActionButton) findViewById(R.id.btnBacktoMain3) ;
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

    public void showToast (int text ) {
        Toast.makeText(PhysicalHealth.this, text, Toast.LENGTH_SHORT).show();
    }
}
