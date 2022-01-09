package com.example.myhealth;


import static java.lang.Integer.parseInt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hydration extends AppCompatActivity {

    EditText takenGlasses; //taken glasses of water input
    int numberofTakenGlasses; //taken glasses of water - will get from cloud
    ProgressBar pbHydration; //progress bar of hydration
    Button okButton; //ok button for the input
    FloatingActionButton backtoMain; //button to return to main menu

    //**********************************************
    FirebaseFirestore db;
    ArrayList<user_stats> users = new ArrayList<>();

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
                test();

            }
        });

        //SETTING UO ONCLICKLISTENER FOR BACKTOMAIN BUTTON
        backtoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMain();

                //****************************************
            }
        });


        //*********************************************************




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


    //*****************************************************

/*
    user_stats createUser(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        user_stats user = new user_stats();
        user.setId(db.collection("users").document().getId());
        return user;
    }


    void updateHydration(user_stats user){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        user.setWaterDrunk(numberofTakenGlasses);
        db.collection("users").document(user.getId()).set(user);
    }

 */


    void test(){
        db = FirebaseFirestore.getInstance();

        String id = db.collection("users").document().getId();
        Log.d("Document id: ", id);

/*
        Map<Object, Object> user = new HashMap<>();
        user.put("Hydration", numberofTakenGlasses);
        user.put("Name", "Ayse");


        db.collection("user").add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(hydration.this, "Successful", Toast.LENGTH_SHORT).show();
            }
        })
.addOnFailureListener(new OnFailureListener() {
    @Override
    public void onFailure(@NonNull Exception e) {
        Toast.makeText(hydration.this, "Failed", Toast.LENGTH_SHORT).show();

    }
});


 */

    }



}