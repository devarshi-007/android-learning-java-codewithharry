package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        tv = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e1.getText().toString();
                SharedPreferences sP = getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor ed = sP.edit();
                ed.putString("name",str);
                ed.apply();
                String val = sP.getString("name", "no value as of now");
                tv.setText(val);

            }
        });
    }
}