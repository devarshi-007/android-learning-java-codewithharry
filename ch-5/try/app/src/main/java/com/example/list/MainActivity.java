package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String arr[]={"Sunday","Monday","Tusday","Wedensday","Thursday","Friday","Saturday"};
   // String[] img ={"res/drawable-v24/one.png","res/drawable-v24/two.png","res/drawable-v24/one.png","res/drawable-v24/two.png","res/drawable-v24/one.png","res/drawable-v24/two.png","res/drawable-v24/one.png"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        lv.setAdapter(ad);

        DevAdapter da = new DevAdapter(this,R.layout.my_devlayout,arr);
        lv.setAdapter(da);

    }
}