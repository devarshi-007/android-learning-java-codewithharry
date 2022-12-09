package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etx;
    public static final String Extra = "name_key";
    private EditText url;
    private Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etx = findViewById(R.id.editTextTextPersonName);
        url = findViewById(R.id.url);
        enter = findViewById(R.id.button2);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = url.getText().toString();
                Toast.makeText(MainActivity.this,uri,Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
                    startActivity(intent2);
            }
        });
    }

    public void openActivity(View view){
        String detail = etx.getText().toString();
        Toast.makeText(MainActivity.this,"Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(Extra, detail);
        startActivity(intent);

    }
}