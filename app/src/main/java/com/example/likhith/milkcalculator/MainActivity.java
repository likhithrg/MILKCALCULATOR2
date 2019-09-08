package com.example.likhith.milkcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3;
    private TextView tvresult,tvresult1,tvresult2,tvresult3,tvresult4,tvresult5,tvresult6,tvresult7,tvresult8,tvresult9,tvresult10;
    private EditText first,second,third,four,five,six,seven,eight,nine,ten;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();

            }
        });
        init();
    }

    private void OpenActivity2() {

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void init()
    {
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        first=(EditText)findViewById(R.id.first);
        second=(EditText)findViewById(R.id.second);
        third=(EditText)findViewById(R.id.third);
        four=(EditText)findViewById(R.id.four);
        five=(EditText)findViewById(R.id.five);
       // six=(EditText)findViewById(R.id.six);
        seven=(EditText)findViewById(R.id.seven);
        eight=(EditText)findViewById(R.id.eight);
        nine=(EditText)findViewById(R.id.nine);
        ten=(EditText)findViewById(R.id.ten);
        tvresult=(TextView)findViewById(R.id.tvresult);
        tvresult1=(TextView)findViewById(R.id.tvresult1);
        tvresult2=(TextView)findViewById(R.id.tvresult2);
        tvresult3=(TextView)findViewById(R.id.tvresult3);
        tvresult4=(TextView)findViewById(R.id.tvresult4);
        tvresult5=(TextView)findViewById(R.id.tvresult5);
        //tvresult6=(TextView)findViewById(R.id.tvresult6);
        tvresult7=(TextView)findViewById(R.id.tvresult7);
        tvresult8=(TextView)findViewById(R.id.tvresult8);
        tvresult9=(TextView)findViewById(R.id.tvresult9);
        tvresult10=(TextView)findViewById(R.id.tvresult10);
        b1.setOnClickListener(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                first.setText("0");
//                second.setText("0");
//                third.setText("0");
//                four.setText("0");
//                five.setText("0");
//                //six.setText("0");
//                seven.setText("0");
//                eight.setText("0");
//                nine.setText("0");
//                ten.setText("0");

                first.setText("");
                second.setText("");
                third.setText("");
                four.setText("");
                five.setText("");
                //six.setText("0");
                seven.setText("");
                eight.setText("");
                nine.setText("");
                ten.setText("");

//                first.setHint("0");
//                second.setHint("0");
//                third.setHint("0");
//                four.setHint("0");
//                five.setHint("0");
//                //six.setText("0");
//                seven.setHint("0");
//                eight.setHint("0");
//                nine.setHint("0");
//                ten.setHint("0");
                tvresult.setText("");
                tvresult1.setText("");
                tvresult2.setText("");
                tvresult3.setText("");
                tvresult4.setText("");
                tvresult5.setText("");
                //tvresult6.setText("");
                tvresult7.setText("");
                tvresult8.setText("");
                tvresult9.setText("");
                tvresult10.setText("");

            }
        });
    }

    @Override
    public void onClick(View view) {
        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        String num3 = third.getText().toString();
        String num4 = four.getText().toString();
        String num5 = five.getText().toString();
       // String num6 = six.getText().toString();
        String num7 = seven.getText().toString();
        String num8 = eight.getText().toString();
        String num9 = nine.getText().toString();
        String num10 = ten.getText().toString();

        if (num1.equals("")){
            num1=first.getHint().toString();
        }if (num2.equals("")){
            num2=second.getHint().toString();
        }if (num3.equals("")){
            num3=third.getHint().toString();
        } if (num4.equals("")){
            num4=four.getHint().toString();
        }if (num5.equals("")){
            num5=five.getHint().toString();
        }if (num7.equals("")){
            num7=seven.getHint().toString();
        } if (num8.equals("")){
            num8=eight.getHint().toString();
        }if (num9.equals("")){
            num9=nine.getHint().toString();
        }if (num10.equals("")){
            num10=ten.getHint().toString();
        }
        switch(view.getId())
        {
            case R.id.b1:
                double a = (Double.parseDouble(num1)*36)+(Double.parseDouble(num2)*42)+(Double.parseDouble(num3)*40)+(Double.parseDouble(num4)*39)+(Double.parseDouble(num5)*21)+(Double.parseDouble(num7)*24)+(Double.parseDouble(num8)*9)+(Double.parseDouble(num10)*50)+(Double.parseDouble(num9));
                tvresult.setText(String.valueOf(a));
                tvresult1.setText(String.valueOf(Double.parseDouble(num1)*36));
                tvresult2.setText(String.valueOf(Double.parseDouble(num2)*42));
                tvresult3.setText(String.valueOf(Double.parseDouble(num3)*40));
                tvresult4.setText(String.valueOf(Double.parseDouble(num4)*39));
                tvresult5.setText(String.valueOf(Double.parseDouble(num5)*21));
               // tvresult6.setText(String.valueOf(Double.parseDouble(num6)*10));
                tvresult7.setText(String.valueOf(Double.parseDouble(num7)*24));
                tvresult8.setText(String.valueOf(Double.parseDouble(num8)*9));
                tvresult9.setText(String.valueOf(Double.parseDouble(num9)));
                tvresult10.setText(String.valueOf(Double.parseDouble(num10)*50));

                break;

        }

    }}