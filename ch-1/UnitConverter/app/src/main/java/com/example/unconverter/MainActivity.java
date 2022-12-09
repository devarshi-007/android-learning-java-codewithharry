package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private Button button;
    private EditText editText;
    private TextView textviewPound;
    private TextView textviewDag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById((R.id.editTextNumber));
        textview = findViewById(R.id.textView);
        textviewPound = findViewById(R.id.textView3);
        textviewDag = findViewById(R.id.textView4);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               //toast.makeText(MainActivity.this, "You added a number", Toast.LENGTH_SHORT).show();
//                String kg = editText.getText().toString();
//                double inp = Double.parseDouble(kg);
//                double oup = inp*1000;
//                textview.setText(inp+" kg is qual to "+oup+" grams.");
//            }
//        });

    }

    public void calculate(View view){
        String kg = editText.getText().toString();
        float inp = Float.parseFloat(kg);
        float oup = inp*2.205f;
        textviewPound.setText(this.getString(R.string.kgToPound, inp, oup));

        float oup1 = inp*1000f;
        textview.setText(this.getString(R.string.kgToGrams, inp, oup1));

        float oup2 = inp*100f;
        textviewDag.setText(this.getString(R.string.kgToDags, inp, oup2));

        Toast.makeText(this, "Thanks for using this app.", Toast.LENGTH_SHORT).show();

    }
}