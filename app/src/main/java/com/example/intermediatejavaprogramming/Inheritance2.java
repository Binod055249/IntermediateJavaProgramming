package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inheritance2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance2);

        TextView txtVehicle=findViewById(R.id.txtVehicle);
        TextView txtCar=findViewById(R.id.txtCar);
        TextView txtMotorCycle=findViewById(R.id.txtMotorCycle);
        final TextView txtResult=findViewById(R.id.txtResult);
        Button btnGo= findViewById(R.id.btnGo);


        VehicleI2 myVehicle=new VehicleI2(45,true,4);
        myVehicle.ride();
          txtVehicle.setText(myVehicle.toString());

          CarI2 myCar=new CarI2(90,true,4);
          myCar.ride();
          txtCar.setText(myCar.toString());

          MotorCycleI2 myMOtorCycle=new MotorCycleI2(500,true,2);
          myMOtorCycle.ride();
          txtMotorCycle.setText(myMOtorCycle.toString());

          btnGo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  txtResult.setText("Button is Clicked");
              }
          });
    }
}