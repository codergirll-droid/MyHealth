package com.example.myhealth;

import android.os.Bundle;

    public class foods extends Nutrition {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_foods);

            Boolean apple = this.getIntent().getExtras().getBoolean("Apple");
            Boolean egg = this.getIntent().getExtras().getBoolean("Egg");
            Boolean pasta = this.getIntent().getExtras().getBoolean("Pasta");
            Boolean pizza = this.getIntent().getExtras().getBoolean("Pizza");
            Boolean broccoli = this.getIntent().getExtras().getBoolean("Broccoli");
            Boolean banana = this.getIntent().getExtras().getBoolean("Banana");



        }
    }
