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

class Apple {
    public String name;
    public int imageID;
    public Apple(String name,  int imageID) {
        this.name = name;

        this.imageID = imageID;
    }}
class MyViewAdapter extends ArrayAdapter<Apple> {
    public MyViewAdapter(@NonNull Context context,

                         ArrayList<Apple> appleArrayListt) {
        super(context, 0, appleArrayListt);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Apple student = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.fifthactivity, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        textViewName.setText(student.name);
        imageView.setImageResource(student.imageID);
        return convertView;
    }
}
public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple);
        ArrayList<Apple> appleArrayList = new ArrayList<Apple>();
        appleArrayList.add(new Apple("Apple", R.drawable.a1));
        appleArrayList.add(new Apple("Axe",R.drawable.a2));
        appleArrayList.add(new Apple("Ant", R.drawable.a3));

        MyViewAdapter adapter = new MyViewAdapter(this,appleArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}