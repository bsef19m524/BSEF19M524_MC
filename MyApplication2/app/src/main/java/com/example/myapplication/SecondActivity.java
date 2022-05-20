package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn1 ,btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }

        });
        btn2 = findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(SecondActivity.this, TwelvethActivity.class);
                startActivity(intent);

            }

        });
        btn3 = findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Uri webpage = Uri.parse("https://github.com/bsef19m524/BSEF19M524_MC.git");
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }

        });

    }
}