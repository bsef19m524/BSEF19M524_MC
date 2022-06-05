package com.example.customizedlist;

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

class Student {
        public String name;
        public String campus;
        public String rollNumber;
        public int imageID;
        public Student(String name, String campus, String rollNumber, int imageID) {
            this.name = name;
            this.campus = campus;
            this.rollNumber = rollNumber;
            this.imageID = imageID;
        }}
    class MyViewAdapter extends ArrayAdapter<Student> {
        public MyViewAdapter(@NonNull Context context,

                             ArrayList<Student> studentArrayList) {
            super(context, 0, studentArrayList);
        }

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            Student student = getItem(position);
            convertView = LayoutInflater.from(getContext()).

                    inflate(R.layout.student_view, parent, false);
            TextView textViewName = convertView.findViewById(R.id.textViewName);
            TextView textViewCampus = convertView.findViewById(R.id.textViewCampus);
            TextView textViewId = convertView.findViewById(R.id.textViewID);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            textViewName.setText(student.name);
            textViewCampus.setText(student.campus);
            textViewId.setText(student.rollNumber);
            imageView.setImageResource(student.imageID);
            return convertView;
        }
    }
        public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("Ali", "Alpha", "1", R.drawable.a1));
        studentArrayList.add(new Student("Saad", "Beta", "2", R.drawable.a2));
        studentArrayList.add(new Student("Aila", "Alpha", "5", R.drawable.a5));
        studentArrayList.add(new Student("Aiman", "Beta", "6", R.drawable.a2));
        MyViewAdapter adapter = new MyViewAdapter(this, studentArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}