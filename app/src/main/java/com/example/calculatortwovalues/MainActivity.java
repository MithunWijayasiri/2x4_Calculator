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

    private void calculate(View view) {
       final int n1 = Integer.parseInt(et1.getText().toString());
       final int n2 = Integer.parseInt(et2.getText().toString());
       final int result;

       if (view == addButton) {
           result = n1 + n2;
           tv.setText(Integer.toString(result));
       } else if (view == subButton) {
           result = n1 - n2;
           tv.setText(Integer.toString(result));
       } else if (view == divideButton) {
           result = n1 / n2;
           tv.setText(Integer.toString(result));
       } else if (view == multiplyButton) {
           result = n1 * n2;
           tv.setText(Integer.toString(result));
       } else if (view == clearButton) {
           tv.setText("");
           et1.getText().clear();
           et2.getText().clear();
       }
    }

    @Override
    public void onClick(View v) {
        // Check for null value and replace it with an int
        String input = et1.getText().toString();
        String input2 = et2.getText().toString();
        int value=0;
        if (!"".equals(input) && !"".equals(input2)) {
            value=Integer.parseInt(input);
            value=Integer.parseInt(input2);
            calculate(v);
        }
    }
}