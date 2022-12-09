package com.example.ch5ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class recyclerview extends AppCompatActivity {
    String data[] = {"Sunday","Monday","Tuesday","Thursday","Friday","Saturday","Sunday"};
    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        rcv = findViewById(R.id.recyclerView);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcvAdapter rcc = new rcvAdapter(data);
        rcv.setAdapter(rcc);
    }
}