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

class Dog {
    public String name;
    public int imageID;
    public Dog(String name,  int imageID) {
        this.name = name;

        this.imageID = imageID;
    }}
class MyViewAdapter3 extends ArrayAdapter<Dog> {
    public MyViewAdapter3(@NonNull Context context,

                          ArrayList<Dog> dogArrayList ) {
        super(context, 0, dogArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Dog dog = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.seventhactivity, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView4);
        ImageView imageView = convertView.findViewById(R.id.imageView4);
        textViewName.setText(dog.name);
        imageView.setImageResource(dog.imageID);
        return convertView;
    }
}
public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog);
        ArrayList<Dog> dogArrayList= new ArrayList<Dog>();
        dogArrayList.add(new Dog("Dog", R.drawable.d1));
        dogArrayList.add(new Dog("Duck",R.drawable.d2));
        dogArrayList.add(new Dog("Door", R.drawable.d3));

        ;
        MyViewAdapter3 adapter = new MyViewAdapter3(this, dogArrayList);
        ListView listView = findViewById(R.id.LV4);
        listView.setAdapter(adapter);

    }
}
