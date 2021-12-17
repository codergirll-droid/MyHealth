package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Article article = getIntent().getParcelableExtra("article");

        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        fts.add(R.id.detailsActivitycontainer, ArticleDetailsFragment.newInstance(article));
        fts.commit();
    }
}