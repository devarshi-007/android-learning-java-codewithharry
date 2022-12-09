package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;

    // set the contact list statically




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contacts o1=new Contacts(1,"Devarshi","6666666666");
        Contacts o2=new Contacts(1,"Devarshi","6666666666");
        Contacts o3=new Contacts(1,"Devarshi","6666666666");
        Contacts o4=new Contacts(1,"Devarshi","6666666666");
        Contacts [] contacts = {o1, o2, o3, o4};
// Time for an entry if an adapter
        rcv = findViewById(R.id.recycle);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcvAdapter rcc = new rcvAdapter(contacts);

        rcv.setAdapter(rcc);
    }
}

