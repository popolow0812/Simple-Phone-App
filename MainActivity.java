package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText NumText1 = (EditText) findViewById(R.id.NumText1);
                EditText NumText2 = (EditText) findViewById(R.id.NumText2);
                TextView textResult = (TextView) findViewById(R.id.displayTextView);

                int num1 = Integer.parseInt(NumText1.getText().toString());
                int num2 = Integer.parseInt(NumText2.getText().toString());
                int result = num1 + num2;

                textResult.setText(result + "");
            }
        });
    }
}