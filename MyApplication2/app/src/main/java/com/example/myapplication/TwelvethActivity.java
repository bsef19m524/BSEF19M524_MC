package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class TwelvethActivity extends AppCompatActivity implements
        View.OnClickListener {
    CheckBox checkBox1, checkBox2, checkBox3;
    Button btn, btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twelvethactivity);

        checkBox1 = findViewById(R.id.checkBox);

        checkBox1.setOnClickListener(this);

        checkBox2 = findViewById(R.id.checkBox2);

        checkBox2.setOnClickListener(this);

        checkBox3 = findViewById(R.id.checkBox3);

        checkBox3.setOnClickListener(this);

        btn = findViewById(R.id.button4);
        btn.setOnClickListener(this);
        btn1 = findViewById(R.id.button5);

    }

    public void onClick(View v) {
        Intent intent = new Intent(TwelvethActivity.this, ThirteenActivity.class);
        startActivity(intent);

        switch (v.getId()) {

            case R.id.checkBox:

                if (checkBox1.isChecked()) {
                } else {
                    btn1.setText("right answer");
                }

                break;

            case R.id.checkBox2:

                if (checkBox2.isChecked())

                    btn1.setText("Wrong answer");

                break;

            case R.id.checkBox3:

                if (checkBox3.isChecked())

                    btn1.setText("wrong answer");

                break;

        }


    }


}
