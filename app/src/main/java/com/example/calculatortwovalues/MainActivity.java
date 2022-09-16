package com.example.calculatortwovalues;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et1, et2;
    private TextView tv;
    private Button addButton, multiplyButton, divideButton, subButton, clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init Edit text fields (input)
        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);

        //init output textview
        tv = findViewById(R.id.outputResult);

        // init buttons
        addButton = findViewById(R.id.buttonAdd);
        addButton.setOnClickListener(this);
        multiplyButton = findViewById(R.id.buttonMultiply);
        multiplyButton.setOnClickListener(this);
        divideButton = findViewById(R.id.buttonDivide);
        divideButton.setOnClickListener(this);
        subButton = findViewById(R.id.buttonSubtract);
        subButton.setOnClickListener(this);
        clearButton = findViewById(R.id.buttonClear);
        clearButton.setOnClickListener(this);
    }

    private void Add()
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        tv.setText("Total Value " + result);
    }

    private void Subtract()
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;

        tv.setText("Subtract Value " + result);
    }

    private void Multiply()
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        tv.setText("Multiply Value " + result);
    }

    private void Divide()
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;

        tv.setText("Divide Value " + result);
    }

    @Override
    public void onClick(View v) {
        if (v == addButton) {
            Add();
        } else if (v == multiplyButton) {
            Multiply();
        } else if (v == divideButton) {
            Divide();
        } else if (v == subButton) {
            Subtract();
        } else if (v == clearButton) {
            tv.setText("");
            et1.getText().clear();
            et2.getText().clear();
        }
    }
}