package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.function.ToDoubleBiFunction;

public class MainActivity extends AppCompatActivity {
    double num1,num2,Result = 0;
    String name,text1,text2 = "";
    boolean click;

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
        Button btndel = findViewById(R.id.btndel);
        EditText txtname = findViewById(R.id.txtName);
        EditText txtnum1 = findViewById(R.id.txtNum1);
        EditText txtnum2 = findViewById(R.id.txtNum2);
        txtnum1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    btndel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        txtnum1.setText("");
                        }
                    });
                    txtnum1.setInputType(InputType.TYPE_NULL);
                    txtnum1.setFocusable(true);
                    btn0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "0");
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "1");
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "2");
                        }
                    });
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "3");
                        }
                    });
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "4");
                        }
                    });
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "5");
                        }
                    });
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "6");
                        }
                    });
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "7");
                        }
                    });
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "8");
                        }
                    });
                    btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + "9");
                        }
                    });
                    btnnoqte.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum1.setText(txtnum1.getText() + ".");
                        }
                    });
                }
            }
        });

        txtnum2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    btndel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText("");
                        }
                    });
                    txtnum2.setInputType(InputType.TYPE_NULL);
                    txtnum2.setFocusable(true);
                    btn0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "0");
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "1");
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "2");
                        }
                    });
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "3");
                        }
                    });
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "4");
                        }
                    });
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "5");
                        }
                    });
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "6");
                        }
                    });
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "7");
                        }
                    });
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "8");
                        }
                    });
                    btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + "9");
                        }
                    });
                    btnnoqte.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtnum2.setText(txtnum2.getText() + ".");
                        }
                    });
                }
            }
        });
        txtname.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    btndel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtname.setText("");
                        }
                    });
                    btn0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                    btnnoqte.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        }
                    });
                }
            }
        });
        btnjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtnum1.length() == 0) && !(txtnum2.length() == 0)){
                    click = true;
                }
                if (txtnum1.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد اول را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else if (txtnum2.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد دوم را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else {
                    text1 = txtnum1.getText().toString();
                    num1 = Double.parseDouble(text1);
                    text2 = txtnum2.getText().toString();
                    num2 = Double.parseDouble(text2);
                    Result = num1 + num2;
                }
            }
        });
        btnmenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtnum1.length() == 0) && !(txtnum2.length() == 0)){
                    click = true;
                }
                if (txtnum1.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد اول را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else if (txtnum2.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد دوم را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else {
                    text1 = txtnum1.getText().toString();
                    num1 = Double.parseDouble(text1);
                    text2 = txtnum2.getText().toString();
                    num2 = Double.parseDouble(text2);
                    Result = num1 - num2;
                }
            }
        });
        btnzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtnum1.length() == 0) && !(txtnum2.length() == 0)){
                    click = true;
                }
                if (txtnum1.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد اول را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else if (txtnum2.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد دوم را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else {
                    text1 = txtnum1.getText().toString();
                    num1 = Double.parseDouble(text1);
                    text2 = txtnum2.getText().toString();
                    num2 = Double.parseDouble(text2);
                    Result = num1 * num2;
                }
            }
        });
        btntaqsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtnum1.length() == 0) && !(txtnum2.length() == 0)){
                    click = true;
                }
                if (txtnum1.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد اول را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else if (txtnum2.length() == 0) {
                    Toast.makeText(MainActivity.this, "عدد دوم را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else {
                    text1 = txtnum1.getText().toString();
                    num1 = Double.parseDouble(text1);
                    text2 = txtnum2.getText().toString();
                    num2 = Double.parseDouble(text2);
                    Result = num1 / num2;
                }
            }
        });
        btnmosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtname.length()==0){
                    Toast.makeText(MainActivity.this, "نام خود را وارد نمایید", Toast.LENGTH_SHORT).show();
                }else if (txtnum1.length()==0){
                    Toast.makeText(MainActivity.this, "عدد اول را وارد نمایید", Toast.LENGTH_SHORT).show();
                } else if (txtnum2.length()==0) {
                    Toast.makeText(MainActivity.this, "عدد دوم را وارد نمایید", Toast.LENGTH_SHORT).show();
                }else if (click == false) {
                    Toast.makeText(MainActivity.this, "عملگر خود را انتخاب کنید", Toast.LENGTH_SHORT).show();
                } else {
                    name = txtname.getText().toString();
                    Intent intent =new Intent (MainActivity.this,MainActivity2.class);
                    intent.putExtra("Result",Result);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });
    }
}