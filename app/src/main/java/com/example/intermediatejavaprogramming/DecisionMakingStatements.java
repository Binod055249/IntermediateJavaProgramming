package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.security.SecureRandom;

public class DecisionMakingStatements extends AppCompatActivity {

    private boolean firstTime=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision_making_statements);

        final EditText edtNum1=findViewById(R.id.edtNum1);
        final EditText edtNum2=findViewById(R.id.edtNum2);
        final EditText edtNum3=findViewById(R.id.edtNum3);
        final TextView txtResult=findViewById(R.id.txtResult);
        Button btnGetMaximumValue=findViewById(R.id.btnGetMaximumValue);
        final TextView txtSecureRandomNumbers=findViewById(R.id.txtSecureRandomNumbers);
        final Button btnSecureRandomNumbers=findViewById(R.id.btnSecureRandomNumbers);

        btnGetMaximumValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1=Double.parseDouble(edtNum1.getText().toString());
                double num2= Double.parseDouble(edtNum2.getText().toString());
                double num3=Double.parseDouble(edtNum3.getText().toString());

                double result=getTheMaximum(num1,num2,num3);

                txtResult.setText(result+"");
            }
        });

        btnSecureRandomNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstTime){
                    txtSecureRandomNumbers.setText("");
                    firstTime=false;
                }
                SecureRandom secureRandomNumber=new SecureRandom();
                String oldTxtSecureRandomNubervalue=txtSecureRandomNumbers.getText().toString();


                if(txtSecureRandomNumbers.getText().toString().length()>=9){

                   btnSecureRandomNumbers.setVisibility(View.INVISIBLE);
                }
                int randomSecureNumber=1+secureRandomNumber.nextInt(5);
               Log.i("Log",randomSecureNumber+"");
                txtSecureRandomNumbers.setText(oldTxtSecureRandomNubervalue+randomSecureNumber+"");
            }
        });
    }

    public double getTheMaximum(double num1,double num2,double num3){

        double theMaximumValue=num1;
        if(num2>theMaximumValue){
            theMaximumValue=num2;
        }
        if(num3>theMaximumValue){
            theMaximumValue=num3;
        }
        return theMaximumValue;
    }
}