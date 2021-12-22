package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class fragment extends AppCompatActivity implements ArticleFragment.OnArticleSelected{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }


    @Override
    public void articleSelected(Article article) {
        Log.d("Main activity", article.getHeader());

        Intent intent = new Intent(this, DetailsActivity.class);

        intent.putExtra("article", article);

        startActivity(intent);

    }

}