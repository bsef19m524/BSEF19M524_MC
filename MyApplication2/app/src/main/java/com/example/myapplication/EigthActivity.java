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

class Egg {
    public String name;
    public int imageID;
    public Egg(String name,  int imageID) {
        this.name = name;

        this.imageID = imageID;
    }}
class MyViewAdapter4 extends ArrayAdapter<Egg> {
    public MyViewAdapter4(@NonNull Context context,

                          ArrayList<Egg> EggArrayList ) {
        super(context, 0, EggArrayList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Egg egg = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.eigthactivity, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView4);
        ImageView imageView = convertView.findViewById(R.id.imageView4);
        textViewName.setText(egg.name);
        imageView.setImageResource(egg.imageID);
        return convertView;
    }
}
public class EigthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.egg);
        ArrayList<Egg> eggArrayList= new ArrayList<Egg>();
        eggArrayList.add(new Egg("Dog", R.drawable.e1));
        eggArrayList.add(new Egg("Duck",R.drawable.e2));
        eggArrayList.add(new Egg("Door", R.drawable.e3));

        ;
        MyViewAdapter4 adapter = new MyViewAdapter4(this, eggArrayList);
        ListView listView = findViewById(R.id.LV5);
        listView.setAdapter(adapter);

    }
}
