package com.example.sdgunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textView=findViewById(R.id.textView3);
        editText=findViewById(R.id.editTextNumberDecimal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double kg = Float.parseFloat(s);
                double pound = 2.205 * kg;
                textView.setText("The Corresponding Value In Pound Is: " + pound);
                Toast.makeText(MainActivity.this, "Thanks A Lot For Using This App!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //ALTERNATE PROCESS
    //public void calculator(View view){
        //String s=editText.getText().toString();
        //double kg = Float.parseFloat(s);
        //double pound=2.205 * kg;
        //textView.setText("The Corresponding Value In Pounds Is:"+pound);
        //Toast.makeText(MainActivity.this, "Thanks A Lot For Using This App!", Toast.LENGTH_SHORT).show();
}
