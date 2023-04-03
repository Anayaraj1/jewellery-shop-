package com.example.rubi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FemaleActivity extends AppCompatActivity {

    Button btngold,btnsilver,btnplatinum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);

        getSupportActionBar().hide();

        btngold = findViewById(R.id.btngold);
        btnsilver = findViewById(R.id.btnsilver);
        btnplatinum = findViewById(R.id.btnplatinum);

        btngold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FemaleActivity.this,GoldActivity.class);
                startActivity(i);
                Toast.makeText(FemaleActivity.this, "Welcome to Gold Setion", Toast.LENGTH_SHORT).show();
            }
        });

        btnsilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FemaleActivity.this,SilverActivity.class);
                startActivity(i);
                Toast.makeText(FemaleActivity.this, "Welcome to Silver Setion", Toast.LENGTH_SHORT).show();
            }
        });
        btnplatinum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FemaleActivity.this,PlatinumActivity.class);
                startActivity(i);
                Toast.makeText(FemaleActivity.this, "Welcome to Platinum Setion", Toast.LENGTH_SHORT).show();
            }
        });
    }
}