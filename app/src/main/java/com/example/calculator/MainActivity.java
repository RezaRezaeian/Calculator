package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Button btnjam = findViewById(R.id.btnjam);
        Button btnmenha = findViewById(R.id.btnmenha);
        Button btnzarb = findViewById(R.id.btnzarb);
        Button btntaqsim = findViewById(R.id.btntaqsim);
        Button btnmosavi = findViewById(R.id.btnmosavi);
        Button btnnoqte = findViewById(R.id.btnnoqte);
        EditText txtname = findViewById(R.id.txtName);
        EditText txtnum1 = findViewById(R.id.txtNum1);
        EditText txtnum2 = findViewById(R.id.txtNum2);
    }
}