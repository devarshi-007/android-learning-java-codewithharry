package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private Button btn;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        ans=findViewById(R.id.textView3);
        btn = findViewById(R.id.button);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a;
//                String s1 = e1.getText().toString();
//                String s2 = e2.getText().toString();
//                int v1 = Integer.parseInt(s1);
//                int v2 = Integer.parseInt(s2);
//                a = v1 + v2;
//                ans.setText("The result is: "+a);
//            }
        //});
    }
    public void calculate(View view){
        int a;
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        a = v1 + v2;
        ans.setText("The result is: "+a);
    }
}