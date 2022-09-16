package com.example.calculatortwovalues;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);
        tv = findViewById(R.id.editTextNumber3);

    }

    //    Add Operation

    public void Add(View v)
    {
//        Covert variable into integer
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

//        Display Result
        tv.setText("Total Value " + result);
    }

    //    Subtract Operation
    public void Subtract(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//      Only change here!
        int result = n1 - n2;

//      Display Result
        tv.setText("Subtract Value " + result);
    }

        //    Multiply Operation
    public void Multiply(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//       Only change here!
        int result = n1 * n2;

//        Display Result
        tv.setText("Multiply Value " + result);
    }

        //    Divide Operation
    public void Divide(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//       Only change here!
        int result = n1 / n2;

//        Display Result
        tv.setText("Divide Value " + result);
    }
}