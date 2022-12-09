package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private TextView tv;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.editTextNumber);
        bt = findViewById(R.id.button);
        tv = findViewById(R.id.textView2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = num.getText().toString();
                int val = Integer.parseInt(s);
                tv.setText(val+" X 1 = "+val*1+"\n"+
                        val+" X 2 = "+val*2+"\n"+
                        val+" X 3 = "+val*3+"\n"+
                        val+" X 4 = "+val*4+"\n"+
                        val+" X 5 = "+val*5+"\n"+
                        val+" X 6 = "+val*6+"\n"+
                        val+" X 7 = "+val*7+"\n"+
                        val+" X 8 = "+val*8+"\n"+
                        val+" X 9 = "+val*9+"\n"+
                        val+" X 10 = "+val*10+"\n");
            }
        });
    }
}