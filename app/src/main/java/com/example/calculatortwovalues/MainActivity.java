package com.example.calculatortwovalues;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    Add Operation

    public void Add(View v)
    {
//        Variable Declaration
        EditText et1= findViewById(R.id.editTextNumber);
        EditText et2= findViewById(R.id.editTextNumber2);
        TextView et3= findViewById(R.id.editTextNumber3);

//        Covert variable into integer
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

//        Display Result
        et3.setText("Total Value " + result);
    }

    //    Subtract Operation
    public void Subtract(View v)
    {

        EditText et1= findViewById(R.id.editTextNumber);
        EditText et2= findViewById(R.id.editTextNumber2);
        TextView et3= findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//      Only change here!
        int result = n1 - n2;

//      Display Result
        et3.setText("Subtract Value " + result);
    }

        //    Multiply Operation
    public void Multiply(View v)
    {
        EditText et1= findViewById(R.id.editTextNumber);
        EditText et2= findViewById(R.id.editTextNumber2);
        TextView et3= findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//       Only change here!
        int result = n1 * n2;

//        Display Result
        et3.setText("Multiply Value " + result);
    }

        //    Divide Operation
    public void Divide(View v)
    {
        EditText et1= findViewById(R.id.editTextNumber);
        EditText et2= findViewById(R.id.editTextNumber2);
        TextView et3= findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
//       Only change here!
        int result = n1 / n2;

//        Display Result
        et3.setText("Divide Value " + result);
    }
}