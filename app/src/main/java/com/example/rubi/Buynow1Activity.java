package com.example.rubi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buynow1Activity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buynow1);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btnsumbit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Buynow1Activity.this,SubmitActivity.class);
                startActivity(i);
            }
        });


    }
}