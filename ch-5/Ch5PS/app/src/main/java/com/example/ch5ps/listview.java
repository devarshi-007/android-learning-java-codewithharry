package com.example.ch5ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {
    String data[] = {"Sunday","Monday","Tuesday","Thursday","Friday","Saturday","Sunday"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv=findViewById(R.id.lister);
        clvAdapter cv = new clvAdapter(listview.this, R.layout.clvresource, data);
        lv.setAdapter(cv);
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
//        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(listview.this,"You are on "+data[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}