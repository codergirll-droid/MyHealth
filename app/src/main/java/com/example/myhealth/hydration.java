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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
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
    FirebaseDatabase rootNode;
    DatabaseReference reference;


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

    //*******************************************

    void test(){

        //ADD VALUE
        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("users");

        String name = "aab";
        String id = "123";

        user_info user = new user_info(name,3,3,3, id, numberofTakenGlasses,5,5,5,5,5,5,5,5);

        reference.child(name).setValue(user);


        //GET VALUE
        Query checkUser = rootNode.getReference("users").orderByChild("userName").equalTo(name);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){

                    String userStr = snapshot.child(name).child("userName").getValue(String.class);
                    Toast.makeText(hydration.this, userStr, Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        //SET VALUE
        reference.child(name).child("userName").setValue("value changed");

    }



}