package com.example.rubi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btnmale);
        btn2 = findViewById(R.id.btnfemale);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,MaleActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Welcome to Male Collection", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,FemaleActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Welcome to Female Collection", Toast.LENGTH_SHORT).show();
            }
        });
    }
}