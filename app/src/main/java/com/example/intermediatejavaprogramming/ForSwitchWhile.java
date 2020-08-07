package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ForSwitchWhile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_switch_while);

        final TextView txtStart=findViewById(R.id.txtStart);
       final TextView txtI=findViewById(R.id.txtI);
        Button btnLoop=findViewById(R.id.btnLoop);

        final TextView txtSwitch=findViewById(R.id.txtSwitch);
        Button btnSwitch=findViewById(R.id.btnSwitch);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = 0;
              /*  for(i=0;i<=10;i++){
                    txtStart.setText(i+"");
                }*/
              
             /* while(i<=10){

                  txtStart.setText(i+"");
                  i++;
              }*/
           /*  do{
                txtStart.setText(i+"");
                i++;
             }while(i<=15);
             txtI.setText(i+"");*/
           for(i=0;i<30;i++){

               if(i==10) {
                   continue;
               }
               Log.i("TAG",i+"");
           }

            }

        });
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name="Animal name";

                switch(name){

                    case "Animal name":
                        txtSwitch.setText(name);
                         break;
                    case "Lion":
                        txtSwitch.setText("our animal name is Lion");
                            break;
                        default:
                        txtSwitch.setText("The name of our animal is something else");
                        break;
                }
            }
        });
    }
}