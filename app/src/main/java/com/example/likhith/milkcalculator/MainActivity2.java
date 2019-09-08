package com.example.likhith.milkcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2;
    private TextView tvresult,tvresult1,tvresult2,tvresult3;
    private EditText first,second,third;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    public void init()
    {

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        first=(EditText)findViewById(R.id.first);
        second=(EditText)findViewById(R.id.second);
        third=(EditText)findViewById(R.id.third);
        tvresult=(TextView)findViewById(R.id.tvresult);
        tvresult1=(TextView)findViewById(R.id.tvresult1);
        tvresult2=(TextView)findViewById(R.id.tvresult2);
        tvresult3=(TextView)findViewById(R.id.tvresult3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("0");
                second.setText("0");
                third.setText("0");
                tvresult.setText("");
                tvresult1.setText("");
                tvresult2.setText("");
                tvresult3.setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {

        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        String num3 = third.getText().toString();
        if (num1.equals("")){
            num1=first.getHint().toString();
        }if (num2.equals("")){
            num2=second.getHint().toString();
        }if (num3.equals("")){
            num3=third.getHint().toString();
        }
        switch(view.getId())
        {
            case R.id.b1:
                double a = (Double.parseDouble(num1)*37.25)+(Double.parseDouble(num2)*45)+(Double.parseDouble(num3));
                tvresult.setText(String.valueOf(a));
                tvresult1.setText(String.valueOf(Double.parseDouble(num1)*37.25));
                tvresult2.setText(String.valueOf(Double.parseDouble(num2)*45));
                tvresult3.setText(String.valueOf(Double.parseDouble(num3)));
                break;

        }

    }}