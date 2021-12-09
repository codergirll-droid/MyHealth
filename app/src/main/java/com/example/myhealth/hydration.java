package com.example.myhealth;


import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class hydration extends AppCompatActivity {

    EditText takenGlasses; //taken glasses of water input
    int numberofTakenGlasses; //taken glasses of water - will get from cloud
    ProgressBar pbHydration; //progress bar of hydration
    Button okButton; //ok button for the input
    FloatingActionButton backtoMain; //button to return to main menu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydration);

        //GETTING THE VIEWS
        takenGlasses = (EditText) findViewById(R.id.numberofGlassesTaken);
        okButton = (Button) findViewById(R.id.OKbutton);
        backtoMain = (FloatingActionButton) findViewById(R.id.btnBacktoMain);
        pbHydration = (ProgressBar) findViewById(R.id.progressBarHydration);

        //SETTING EDITTEXT AND UPDATING PROGRESS BAR
        getIntFromDatabaseAndDisplayInEdittext();
        updateBar();

        //SETTING UP ONCLICKLISTENER FOR OKBUTTON
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateBar();
            }
        });

        //SETTING UO ONCLICKLISTENER FOR BACKTOMAIN BUTTON
        backtoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    goToMain();

            }
        });


    }

    //UPDATING PROGRESS BAR FUNCTION
    public void updateBar(){

        tryGetInt();
        pbHydration.setProgress(numberofTakenGlasses);

    }

    //GETTING INT FOR NUMBER OF TAKEN GLASSES
    //! get value from edittext and assign it to takenGlasses, update database
    public void tryGetInt(){
        try{
            numberofTakenGlasses = parseInt ( takenGlasses.getText().toString());
        }catch (NumberFormatException exception){
            numberofTakenGlasses = 0;
        }
    }

    //if database value is 0, edittext is null, else edittext is value
    public void getIntFromDatabaseAndDisplayInEdittext(){

    }

    //GO TO MAIN MENU
    public void goToMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //! set up progress bar max value according to age, weight, height etc. and update water need in database
    public void setProgressBarMaxValue(){

    }

}