package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connect xml with java

        EditText qz = findViewById(R.id.qz1);
        EditText hw = findViewById(R.id.hw1);
        EditText mid = findViewById(R.id.mid1);
        EditText fin = findViewById(R.id.fin1);
        Button cal = findViewById(R.id.cal1);
        Button reset = findViewById(R.id.clr);
        TextView res = findViewById(R.id.res1);




        cal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mark();

            }
            public void mark(){

                double qiz ;
                double how ;
                double fi;
                double mit;



                //String qz1string = qz.getText().toString();
                //String hw1string = hw.getText().toString();
                //String mid1string = mid.getText().toString();
                //String fin1string = fin.getText().toString();


                qiz = Integer.parseInt(qz.getText().toString());
                how = Integer.parseInt(hw.getText().toString());
                fi = Integer.parseInt(fin.getText().toString());
                mit = Integer.parseInt(mid.getText().toString());



                double sum = qiz + mit + how + fi;


                if (sum > 90 && sum < 100)
                {
                    res.setText("A");
                }
                else if (sum > 80 && sum < 89)
                {
                    res.setText("B");
                }
                else if (sum > 70 && sum < 79)
                {
                    res.setText("C");
                }
                else if (sum > 60 && sum < 69)
                {
                    res.setText("D");
                }
                else if (sum < 60) {
                    res.setText("F");
                }

            }
        });

        reset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                qz.setText("");
                hw.setText("");
                mid.setText("");
                fin.setText("");
                reset.requestFocus();
            }


        });






    }
        }


