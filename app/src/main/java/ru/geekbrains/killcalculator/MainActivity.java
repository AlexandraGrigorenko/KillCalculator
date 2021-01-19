package ru.geekbrains.killcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String oldNumber="";
    String op = "+";
    boolean isNewOp=true;
    boolean dot_inserted =false;
    EditText ed1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }
       /* Button btn0 = findViewById(R.id.btn0);
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
        Button btnEqual = findViewById(R.id.btnEqual);*/

    public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
        isNewOp=false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.btn1:
                number += "1";
                break;
            case R.id.btn2:
                number += "2";
                break;
            case R.id.btn3:
                number += "3";
                break;
            case R.id.btn4:
                number += "4";
                break;
            case R.id.btn5:
                number += "5";
                break;
            case R.id.btn6:
                number += "6";
                break;
            case R.id.btn7:
                number += "7";
                break;
            case R.id.btn8:
                number += "8";
                break;
            case R.id.btn9:
                number += "9";
                break;
            case R.id.btn0:
                number += "0";
                break;
            case R.id.btnDot:
                /*if (number.isEmpty()) {
                    number = "0.";
                    dot_inserted = true;
                }
                if (!dot_inserted) {
                    number = number + ".";
                    dot_inserted = true;
                }*/
                 number += ".";
                break;
        }ed1.setText(number);
    }

    public void opEvent(View view) {
        isNewOp=true;
        oldNumber=ed1.getText().toString();
        switch (view.getId()){
            case R.id.btnDivision: op = "÷"; break;
            case R.id.btnAddition: op = "+"; break;
            case R.id.btnMultiplication: op = "×"; break;
            case R.id.btnSubtraction: op = "-"; break;
            case R.id.btnDel: /*if (view.getId() == R.id.btnDel) {

                if (!ed1.getText().toString().equals("")) {

                    oldNumber = ed1.getText().toString();

                    if (oldNumber.length() > 0) {

                        oldNumber = oldNumber.substring(0, oldNumber.length() - 1);

                        ed1.setText(oldNumber);

                    }*/
                op = "";
                break;
            }
        }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result=Double.parseDouble(oldNumber)+ Double.parseDouble(newNumber);
                break;
            case "-":
                result=Double.parseDouble(oldNumber)- Double.parseDouble(newNumber);
                break;
            case "×":
                result=Double.parseDouble(oldNumber)* Double.parseDouble(newNumber);
                break;
            case "÷":
                result=Double.parseDouble(oldNumber)/ Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }



    public void acEvent(View view) {
        ed1.setText("0");
        isNewOp=true;
    }

    public void backspace(View view) {

        if (!oldNumber.isEmpty()) {

            if (oldNumber.startsWith(".", oldNumber.length() - 1)) {

                dot_inserted = false;

            }

            if (oldNumber.startsWith(" ", oldNumber.length() - 1)) {

                oldNumber = oldNumber.substring(0, oldNumber.length() - 3);

                isNewOp = false;

            } else {

                oldNumber = oldNumber.substring(0, oldNumber.length() - 1);

            }

        }

    }

}

