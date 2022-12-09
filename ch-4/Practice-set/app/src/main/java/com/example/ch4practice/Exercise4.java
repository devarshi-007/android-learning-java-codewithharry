package com.example.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

public class Exercise4 extends AppCompatActivity {
    private EditText email;
    private EditText subject;
    private EditText message;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);
        email = findViewById(R.id.editTextPersonName4);

    }
}