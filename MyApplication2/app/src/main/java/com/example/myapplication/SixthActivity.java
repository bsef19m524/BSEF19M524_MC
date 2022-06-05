package com.example.myapplication;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

class Cat {
    public String name;
    public int imageID;
    public Cat(String name,  int imageID) {
        this.name = name;

        this.imageID = imageID;
    }}
class MyViewAdapter2 extends ArrayAdapter<Cat> {
    public MyViewAdapter2(@NonNull Context context,

                          ArrayList<Cat> catArrayList ) {
        super(context, 0, catArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Cat cat = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.sixthactivity, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView3);
        ImageView imageView = convertView.findViewById(R.id.imageView3);
        textViewName.setText(cat.name);
        imageView.setImageResource(cat.imageID);
        return convertView;
    }
}
public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat);
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        catArrayList.add(new Cat("cat", R.drawable.c1));
        catArrayList.add(new Cat("car",R.drawable.c2));
        catArrayList.add(new Cat("cap", R.drawable.c3));

        ;
        MyViewAdapter2 adapter = new MyViewAdapter2(this, catArrayList);
        ListView listView = findViewById(R.id.LV2);
        listView.setAdapter(adapter);

    }
}
