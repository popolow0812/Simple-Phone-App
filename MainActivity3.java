package com.example.simplephoneapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        if (getIntent().hasExtra("DISPLAYDATA")) {
            TextView displayTextView = (TextView) findViewById(R.id.displayTextView);
            String text = getIntent().getExtras().getString("DISPLAYDATA");
            displayTextView.setText(text);
        }
    }
}