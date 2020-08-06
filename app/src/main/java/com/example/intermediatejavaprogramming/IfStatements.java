package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IfStatements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_statements);

         final EditText edtNumber=findViewById(R.id.edtNumber);
         final TextView txtResult=findViewById(R.id.txtResult);
        Button btnResult=findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textField=edtNumber.getText().toString();
                String result="";
try{
                    int intValue = Integer.parseInt(textField);


    if(intValue>90){
        result="Great you have grade A\n and\n your marks is: "+intValue;
    }else if(intValue>80){
        result="Your Grade is B\n\tand\nyour marks is:"+intValue;
    }else if(intValue>70){
        result="Your Grade is C\n\tand\nyour marks is:"+intValue;
    }else{
        result="You doesn't have sufficient marks\n\tand\nyour marks is:"+intValue;
    }
                }catch (Exception e){
    e.printStackTrace();
    result="please enter a number not character";
}


                /*if(textField.contains("51")) {
                    //txtResult.setText(textField+"Great");
                        result=textField+"Great";
                }else{
                    //txtResult.setText("The value is not 51\nAnd the value is:"+textField);
                result="The value is not 51\nAnd the value is:"+textField;
                }*/

                /*if(textField.contains("90")){
                    result="Great your Grade is A\n\tand\nyour marks is:"+textField;
                }else if(textField.contains("80")){
                    result="Your Grade is B\n\tand\nyour marks is:"+textField;
                }else if(textField.contains("70")){
                    result="Your Grade is C\n\tand\nyour marks is:"+textField;
                }else{
                    result="You doesn't have sufficient marks\n\tand\nyour marks is:"+textField;
                }*/

                txtResult.setText(result);
            }
        });
    }
}