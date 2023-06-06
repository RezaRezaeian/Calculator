package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtusername=findViewById(R.id.txtusername);
        TextView txttrueAnswer=findViewById(R.id.txttrueAnswer);
        TextView btnback=findViewById(R.id.btnback);
        Intent answer =getIntent();
        double rez = answer.getDoubleExtra("Result",0);
        String name = answer.getStringExtra("name");
        txtusername.setText(String.valueOf(name)+" عزیز جواب شما :");
        txttrueAnswer.setText(String.valueOf(rez));
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back =new Intent (MainActivity2.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}