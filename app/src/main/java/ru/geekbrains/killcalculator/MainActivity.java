package ru.geekbrains.killcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAC, btnDel, btnAddition, btnDivision, btnSubtraction, btnMultiplication, btnEqual, btnDot;
    private String curr, res;
    private EditText calculation, result;
    private boolean dot_inserted, operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        curr ="";
        res ="";
        dot_inserted =false;
        operator_inserted =false;
        initButton();

        public void initButton(){
            calculation = findViewById(R.id.calculation);
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
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "0";
                displayOne();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "1";
                displayOne();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "2";
                displayOne();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "3";
                displayOne();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "4";
                displayOne();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "5";
                displayOne();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "6";
                displayOne();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "7";
                displayOne();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "8";
                displayOne();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "9";
                displayOne();
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (curr.isEmpty()) {
                    curr = "0.";
                    dot_inserted = true;
                }
                if (dot_inserted == false) {
                    curr = curr + ".";
                    dot_inserted = true;
                }
                displayOne();
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                displayOne();
                displayTwo();
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                displayOne();
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.startsWith(".", curr.length() - 1)) {
                        backspace();
                    }
                    if (operator_inserted = false) {
                        curr = curr + "÷";
                        operator_inserted = true;
                    }
                    displayOne();
                }
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.startsWith(".", curr.length() - 1)) {
                        backspace();
                    }
                    if (operator_inserted = false) {
                        curr = curr + "×";
                        operator_inserted = true;
                    }
                    displayOne();
                }
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.startsWith(".", curr.length() - 1)) {
                        backspace();
                    }
                    if (operator_inserted = false) {
                        curr = curr + "-";
                        operator_inserted = true;
                    }
                    displayOne();
                }
            }
        });
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_inserted = false;
                if (!curr.isEmpty()) {
                    if (curr.startsWith(".", curr.length() - 1)) {
                        backspace();
                    }
                    if (operator_inserted = false) {
                        curr = curr + " + ";
                        operator_inserted = true;
                    }
                    displayOne();
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operator_inserted == true && !curr.startsWith(" ", curr.length() - 1)) {
                    String[] tokens = curr.split(" ");
                    switch (tokens[1].charAt(0)) {
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '×':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '÷':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
    }

    public void displayOne() {
        calculation.setText(curr);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        curr = " ";
        res = " ";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void backspace() {
        if (!curr.isEmpty()) {
            if (curr.startsWith(".", curr.length() - 1)) {
                dot_inserted = false;
            }
            if (curr.startsWith(" ", curr.length() - 1)) {
                curr = curr.substring(0, curr.length() - 3);
                operator_inserted = false;
            } else {
                curr = curr.substring(0, curr.length() - 1);
            }
        }
    }

    @Override
    public void onClick(View view) {

    }
}
