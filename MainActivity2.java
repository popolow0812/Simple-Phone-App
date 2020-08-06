package com.example.simplephoneapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button addButton = (Button) findViewById(R.id.addBtn);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText NumText1 = (EditText) findViewById(R.id.numText1);
                EditText NumText2 = (EditText) findViewById(R.id.numText2);
                TextView textResult = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(NumText1.getText().toString());
                int num2 = Integer.parseInt(NumText2.getText().toString());
                int result = num1 + num2;

                textResult.setText("The sum of " + num1 + " and " + num2 + "is " + result + "");
            }
        });

        Button subtractBtn = (Button) findViewById(R.id.subtractBtn);
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText NumText1 = (EditText) findViewById(R.id.numText1);
                EditText NumText2 = (EditText) findViewById(R.id.numText2);
                TextView textResult = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(NumText1.getText().toString());
                int num2 = Integer.parseInt(NumText2.getText().toString());
                int result = num1 - num2;

                textResult.setText("The subtract of " + num1 + " and " + num2 + "is " + result + "");
            }
        });
    }
}