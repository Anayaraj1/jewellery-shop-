package com.example.rubi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Ring1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring1);
        getSupportActionBar().hide();
    }
}