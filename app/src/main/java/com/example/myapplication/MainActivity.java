package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText digit1;
    private EditText digit2;
    private TextView result;
    private float a;
    private float b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting references to UI elements
        digit1 = (EditText)findViewById(R.id.editText);
        digit2 = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.result);

        //setting onclick-listeners to buttons
        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseDigits();
                result.setText(String.valueOf(a+b));
            }
        });

        findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseDigits();
                result.setText(String.valueOf(a-b));
            }
        });

        findViewById(R.id.buttonDivision).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseDigits();
                result.setText(String.valueOf(a/b));
            }
        });

        findViewById(R.id.buttonMupltipl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseDigits();
                result.setText(String.valueOf(a*b));
            }
        });
    }

    //parsing input text to float digits
    public void parseDigits(){
        try{
            a = Float.parseFloat(digit1.getText().toString());
            b = Float.parseFloat(digit2.getText().toString());
        }catch(NumberFormatException e){
            result.setText("Error!");
        }
    }
}