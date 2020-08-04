package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StringFunctions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_functions);

        TextView txt1=findViewById(R.id.txt1);
        TextView txt2=findViewById(R.id.txt2);
        TextView txt3=findViewById(R.id.txt3);
        TextView txt4=findViewById(R.id.txt4);
        TextView txt5=findViewById(R.id.txt5);

     /*   String myStringValue="Android Programming is Fun!";

        txt1.setText(myStringValue);

        txt2.setText(myStringValue.charAt(0)+"");

        txt3.setText(myStringValue.substring(7));
        txt4.setText(myStringValue.substring(2,5));
        txt5.setText(myStringValue.indexOf("Programming" )+"");
    */

     //Casting
        byte smallIntValue=25; //-128 .... +127
        int intValue= smallIntValue;
        float floatValue=7.8f;
        int mynumber = (int) floatValue;

        txt1.setText(floatValue+"");//7.8
        txt2.setText(mynumber+"");//7
        txt3.setText(intValue+"");//25

        float myFirstFloatValue=3.9f;
        float mySecondFloatValue=15.8f;

        int result=(int) (myFirstFloatValue*mySecondFloatValue);
        txt4.setText(result+"");//61

        int myvalue= (int) (2.7f*5);
        txt5.setText(myvalue+"");//13

        int firstNum=10;
        int secondNum=20;
        float floatNumber=firstNum*secondNum;
        txt5.setText(floatNumber+"");//200.0

        float floatv=3;
        txt5.setText(floatv+"");//3.0



    }

}