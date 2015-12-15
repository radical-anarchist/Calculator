package com.example.tusharmishra.calculator;

import android.os.Bundle;
import android.widget.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Ass extends AppCompatActivity implements View.OnClickListener{
private Button btnAdd,btnSubtract,btnMultiply,btnDivide;
    private TextView theResult;
    private EditText etfirst,etsecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass);
    init();

    }
private void init()
{
btnAdd=(Button)findViewById(R.id.btnAdd);
btnSubtract=(Button)findViewById(R.id.btnSubtract);
    btnDivide=(Button)findViewById(R.id.btnDivide);
    btnMultiply=(Button)findViewById(R.id.btnMultiply);
    etfirst=(EditText)findViewById(R.id.etFirstNumber);
    etsecond=(EditText)findViewById(R.id.etSecondNumber);
    theResult=(TextView)findViewById(R.id.theResult);
    btnAdd.setOnClickListener(this);
    btnSubtract.setOnClickListener(this);
    btnMultiply.setOnClickListener(this);
    btnDivide.setOnClickListener(this);
}
    @Override
    public void onClick(View view) {
        String num1=etfirst.getText().toString();
        String num2=etsecond.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int add=Integer.parseInt(num1)+Integer.parseInt(num2);
                theResult.setText(String.valueOf(add));
                break;
            case R.id.btnSubtract:
                int sub=Integer.parseInt(num1)-Integer.parseInt(num2);
                theResult.setText(String.valueOf(sub));
                break;
            case R.id.btnMultiply:
                int mul=Integer.parseInt(num1)*Integer.parseInt(num2);
                theResult.setText(String.valueOf(mul));
                break;
            case R.id.btnDivide:
                try{
                    double div=Double.parseDouble(num1)/Double.parseDouble(num2);
                    theResult.setText(String.valueOf(div));
                }catch(Exception e){
                    theResult.setText("Cannot Divide");
                }
                break;

        }

    }
}


