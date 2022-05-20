package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button btn1;
    Button btn2, btn3 , btn4, btn5,btn6,btn7,btn8,btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactiviy);
        btn1 = findViewById(R.id.button13);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);

            }

        });
        btn2 = findViewById(R.id.button12);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, FifthActivity.class);
                startActivity(intent);

            }

        });
        btn3 = findViewById(R.id.button14);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, SixthActivity.class);
                startActivity(intent);

            }

        });
        btn4 = findViewById(R.id.button15);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, SeventhActivity.class);
                startActivity(intent);

            }

        });
        btn5 = findViewById(R.id.button16);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, EigthActivity.class);
                startActivity(intent);

            }

        });
        btn6 = findViewById(R.id.button17);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, NinthActivity.class);
                startActivity(intent);

            }

        });
        btn7 = findViewById(R.id.button18);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, TenthActivity.class);
                startActivity(intent);

            }

        });
        btn8 = findViewById(R.id.button19);
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(ThirdActivity.this, EleventhActivity.class);
                startActivity(intent);

            }

        });

    }
}