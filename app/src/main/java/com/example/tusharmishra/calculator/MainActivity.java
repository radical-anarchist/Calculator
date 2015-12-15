package com.example.tusharmishra.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by prateek on 15/12/15.
 */
public class MainActivity extends Activity implements View.OnClickListener{
    Button add1,sub1,mult1,div1;
    EditText first,second,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        add1=(Button)findViewById(R.id.add);
        sub1=(Button)findViewById(R.id.sub);
        mult1=(Button)findViewById(R.id.mult);
        div1=(Button)findViewById(R.id.div);

        add1.setOnClickListener(this);
        sub1.setOnClickListener(this);
        mult1.setOnClickListener(this);
        div1.setOnClickListener(this);

        first=(EditText)findViewById(R.id.firstval);
        second=(EditText)findViewById(R.id.secondval);
        result =(EditText)findViewById(R.id.res);

    }

    @Override
    public void onClick(View v) {
        float x = Float.valueOf(first.getText().toString());
        float y =Float.valueOf(second.getText().toString());
        switch (v.getId()) {

            case R.id.add :
                result.setText(""+x+y);
                break;

            case R.id.sub :
                result.setText(""+(x-y));
                break;

            case R.id.mult :
                result.setText(""+(x*y));
                break;

            case R.id.div :
                result.setText(""+(x/y));
                break;


        }
    }
}

