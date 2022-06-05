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

class Banana {
    public String name;
    public int imageID;
    public Banana(String name,  int imageID) {
        this.name = name;

        this.imageID = imageID;
    }}
class MyViewAdapter1 extends ArrayAdapter<Banana> {
    public MyViewAdapter1(@NonNull Context context,

                         ArrayList<Banana> bananaArrayList ) {
        super(context, 0, bananaArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Banana banana = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.fourthactivity, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView2);
        ImageView imageView = convertView.findViewById(R.id.imageView2);
        textViewName.setText(banana.name);
        imageView.setImageResource(banana.imageID);
        return convertView;
    }
}
public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banana);
        ArrayList<Banana> bananaArrayList = new ArrayList<Banana>();
        bananaArrayList.add(new Banana("Banana", R.drawable.b1));
        bananaArrayList.add(new Banana("Ball",R.drawable.b2));
        bananaArrayList.add(new Banana("Bus", R.drawable.b3));

       ;
        MyViewAdapter1 adapter = new MyViewAdapter1(this, bananaArrayList);
        ListView listView = findViewById(R.id.LV1);
        listView.setAdapter(adapter);

    }
}
