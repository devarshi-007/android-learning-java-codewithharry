package com.devarshi.tmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton addActivity;
    RecyclerView shelf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String data Source
//        ArrayList<String> data = new ArrayList<String>();
//        data.add("a");
//        data.add("b");
//        data.add("c");
//        data.add("d");
        String data="";
        //Database Instance
        DbHadler database = new DbHadler(this, "Task",null,1);

//        int count = database.getCount();
//
//        //retriving records from database
//
//        for(int i=0;i<count;i++){
//            data.add(database.getTask(i));
//        }
        addActivity = findViewById(R.id.addActivity);

        shelf = findViewById(R.id.recyclerView);
        shelf.setLayoutManager(new LinearLayoutManager(this));
        TaskAdapter tad = new TaskAdapter(data);
        shelf.setAdapter(tad);

        //closing the database
      //  database.close();
        database.addTask("Hello");
        data.equals(database.getTask(1));
        TextView tv = findViewById(R.id.textView);
        tv.setText(data);

        addActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go to AddActivity page
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

        database.close();

    }
}