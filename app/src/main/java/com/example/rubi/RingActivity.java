package com.example.rubi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RingActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.button4);
        btn2 = findViewById(R.id.button5);
        btn3 = findViewById(R.id.button6);
        btn4 = findViewById(R.id.button7);
        btn5 = findViewById(R.id.button8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(RingActivity.this,Buynow1Activity.class);
                startActivity(i);
            }
        });
    }
}