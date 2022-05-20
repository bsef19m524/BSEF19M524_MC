package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ThirteenActivity extends AppCompatActivity implements
        View.OnClickListener {
    CheckBox checkBox1, checkBox2, checkBox3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirteenactivity);

        checkBox1 = findViewById(R.id.checkBox4);

        checkBox1.setOnClickListener(this);

        checkBox2 = findViewById(R.id.checkBox5);

        checkBox2.setOnClickListener(this);

        checkBox3 = findViewById(R.id.checkBox6);

        checkBox3.setOnClickListener(this);

        btn = findViewById(R.id.button6);


    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.checkBox4:

                if (checkBox1.isChecked()) {
                } else {
                    btn.setText("wron answer");
                }

                break;

            case R.id.checkBox5:

                if (checkBox2.isChecked())

                    btn.setText("right answer");

                break;

            case R.id.checkBox6:

                if (checkBox3.isChecked())

                    btn.setText("wrong answer");

                break;

        }


    }


}
