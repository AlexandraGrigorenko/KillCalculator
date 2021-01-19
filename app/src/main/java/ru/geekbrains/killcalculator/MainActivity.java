package ru.geekbrains.killcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAC, btnDel, btnAddition, btnDivision, btnSubtraction, btnMultiplication, btnEqual, btnDot;
    EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEqual.setOnClickListener(this);


    }

    private void initButton() {
        result = findViewById(R.id.result);
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnAC = findViewById(R.id.btnAC);
        Button btnDel = findViewById(R.id.btnDel);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnAddition = findViewById(R.id.btnAddition);
        Button btnMultiplication = findViewById(R.id.btnMultiplication);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnSubtraction = findViewById(R.id.btnSubtraction);
        Button btnEqual = findViewById(R.id.btnEqual);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn0) {
            result.setText(result.getText() + "0");
        } else if (view.getId() == R.id.btn1) {
            result.setText(result.getText() + "1");
        } else if (view.getId() == R.id.btn2) {
            result.setText(result.getText() + "2");
        } else if (view.getId() == R.id.btn3) {
            result.setText(result.getText() + "3");
        } else if (view.getId() == R.id.btn4) {
            result.setText(result.getText() + "4");
        } else if (view.getId() == R.id.btn5) {
            result.setText(result.getText() + "5");
        } else if (view.getId() == R.id.btn6) {
            result.setText(result.getText() + "6");
        } else if (view.getId() == R.id.btn7) {
            result.setText(result.getText() + "7");
        } else if (view.getId() == R.id.btn8) {
            result.setText(result.getText() + "8");
        } else if (view.getId() == R.id.btn9) {
            result.setText(result.getText() + "9");
        } else if (view.getId() == R.id.btnDot) {
            result.setText(result.getText() + ".");
        }
    }
}
