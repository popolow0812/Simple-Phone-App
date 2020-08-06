package com.example.simplephoneapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculatorBtn = (Button) findViewById(R.id.calculatorBtn);
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        Button yahooBtn = (Button) findViewById(R.id.yahooBtn);
        Button displayBtn = (Button) findViewById(R.id.diaplayBtn);

        calculatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(startIntent);
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String googleText = "http://www.google.com";
                Uri webAddress = Uri.parse(googleText);

                Intent googleIntent = new Intent(Intent.ACTION_VIEW, webAddress);
                if (googleIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(googleIntent);
                }
            }
        });

        yahooBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yahooText = "http://www.yahoo.com";
                Uri webAddress = Uri.parse(yahooText);

                Intent yahooIntent = new Intent(Intent.ACTION_VIEW, webAddress);
                if (yahooIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(yahooIntent);
                }
            }
        });

        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity3.class);
                startIntent.putExtra("DISPLAYDATA", "Welcome to the New World");
                startActivity(startIntent);
            }
        });
    }
}