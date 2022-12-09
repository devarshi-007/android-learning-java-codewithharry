package com.devarshi.tmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button add = findViewById(R.id.add);
        EditText data = findViewById(R.id.editTask);

        //database instance
        DbHadler db = new DbHadler(this, "Task", null, 1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String str = data.getText().toString();
                while (str.isEmpty()) {
                    Toast.makeText(AddActivity.this, "Task is Empty", Toast.LENGTH_SHORT).show();
                }

                    db.addTask(str);
                    db.close();
              //  }
                finish();
            }
        });

}}