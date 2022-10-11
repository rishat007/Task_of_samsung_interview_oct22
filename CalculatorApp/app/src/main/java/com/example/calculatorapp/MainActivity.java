package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnumber_1,etnumber_2;
    Button btnaddition,btnsubtract,btnmultiply,btndivide;
    Double number_1,number_2;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumber_1=findViewById(R.id.etnumber_1);
        etnumber_2=findViewById(R.id.etnumber_2);
        btnaddition=findViewById(R.id.btnaddition);
        btnsubtract=findViewById(R.id.btnsubtract);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        tvresult=findViewById(R.id.tvresult);

        Clicklistener();
    }
    public void Clicklistener(){
        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               number_1=Double.parseDouble(etnumber_1.getText().toString());
               number_2=Double.parseDouble(etnumber_2.getText().toString());
               Double result=number_1+number_2;
               tvresult.setText(String.valueOf(result));
            }
        });
       btnsubtract.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               number_1=Double.parseDouble(etnumber_1.getText().toString());
               number_2=Double.parseDouble(etnumber_2.getText().toString());
               Double result=number_1-number_2;
               tvresult.setText(String.valueOf(result));
           }
       });
       btnmultiply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               number_1=Double.parseDouble(etnumber_1.getText().toString());
               number_2=Double.parseDouble(etnumber_2.getText().toString());
               Double result=number_1*number_2;
               tvresult.setText(String.valueOf(result));
           }
       });
       btndivide.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               number_1=Double.parseDouble(etnumber_1.getText().toString());
               number_2=Double.parseDouble(etnumber_2.getText().toString());
               Double result=number_1/number_2;
               tvresult.setText(String.valueOf(result));
           }
       });
    }
}