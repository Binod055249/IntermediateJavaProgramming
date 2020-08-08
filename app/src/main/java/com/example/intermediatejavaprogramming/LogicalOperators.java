package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogicalOperators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical_operators);

        TextView txtHealthy=findViewById(R.id.txtHealthy);
        final CheckBox chxHealthyYes=findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo=findViewById(R.id.chxHealthyNo);

        //True And True
        TextView txtTrueAndTrue=findViewById(R.id.txtTrueAndTrue);
         CheckBox chxTrueAndTrueYes=findViewById(R.id.chxTrueAndTrueYes);
         CheckBox chxTrueAndTrueNo=findViewById(R.id.chxTrueAndTrueNo);

         //True And False
        TextView txtTrueAndFalse=findViewById(R.id.txtTrueAndFalse);
        CheckBox chxTrueAndFalseYes=findViewById(R.id.chxTrueAndFalseYes);
        CheckBox chxTrueAndFalseNo=findViewById(R.id.chxTrueAndFalseNo);

        //False And True
        CheckBox chxFalseAndTrueYes=findViewById(R.id.chxFalseAndTrueYes);
        CheckBox chxFalseAndTrueNo=findViewById(R.id.chxFalseAndTrueNo);

        //False And False
        CheckBox chxFalseAndFalseYes=findViewById(R.id.chxFalseAndFalseYes);
        CheckBox chxFalseAndFalseNo=findViewById(R.id.chxFalseAndFalseNo);

        //True Or True
        CheckBox chxTrueOrTrueYes=findViewById(R.id.chxTrueOrTrueYes);
        CheckBox chxTrueOrTrueNo=findViewById(R.id.chxTrueOrTrueNo);

        //True Or False
        CheckBox chxTrueOrFalseYes=findViewById(R.id.chxTrueOrFalseYes);
        CheckBox chxTrueOrFalseNo=findViewById(R.id.chxTrueOrFalseNo);

        //False Or True
        CheckBox chxFalseOrTrueYes=findViewById(R.id.chxFalseOrTrueYes);
        CheckBox chxFalseOrTrueNo=findViewById(R.id.chxFalseOrTrueNo);

        //False Or False
        CheckBox chxFalseOrFalseYes=findViewById(R.id.chxFalseOrFalseYes);
        CheckBox chxFalseOrFalseNo=findViewById(R.id.chxFalseOrFalseNo);

        //True ^ True
        CheckBox chxTrueCaretTrueYes=findViewById(R.id.chxTrueCaretTrueYes);
        CheckBox chxTrueCaretTrueNo=findViewById(R.id.chxTrueCaretTrueNo);

        //True ^ False
        CheckBox chxTrueCaretFalseYes=findViewById(R.id.chxTrueCaretFalseYes);
        CheckBox chxTrueCaretFalseNo=findViewById(R.id.chxTrueCaretFalseNo);

        //False ^ True
        CheckBox chxFalseCaretTrueYes=findViewById(R.id.chxFalseCaretTrueYes);
        CheckBox chxFalseCaretTrueNo=findViewById(R.id.chxFalseCaretTrueNo);

        //False ^ False
         CheckBox chxFalseCaretFalseYes=findViewById(R.id.chxFalseCaretFalseYes);
         CheckBox chxFalseCaretFalseNO=findViewById(R.id.chxFalseCaretFalseNo);


        chxHealthyYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyYes.isChecked()){

                    chxHealthyNo.setChecked(false);
                }
            }
        });
        chxHealthyNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chxHealthyNo.isChecked()){

                    chxHealthyYes.setChecked(false);
                }
            }
        });

        boolean amIHealthy=false;
        int power=70;
     /*   if(amIHealthy){

            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){

            chxHealthyNo.setChecked(true);
        }
        */
        /*amIHealthy=(power>70);
        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }*/
  /*      amIHealthy=(power > 70 ? true : false);
        if(amIHealthy){
            chxHealthyYes.setChecked(true);
        }else if(!amIHealthy){
            chxHealthyNo.setChecked(true);
        }
    */
          /*chxHealthyYes.setChecked((power>80?true:false));
          chxHealthyNo.setChecked((power>80?true:false));*/

         amIHealthy=(power>70);
         chxHealthyYes.setChecked((amIHealthy ? true : false));
         chxHealthyNo.setChecked(!amIHealthy?true:false);

         //True And True
        boolean trueAndTrue=(true && true);
      /*  if(trueAndTrue){

            chxTrueAndTrueYes.setChecked(true);
        }else if(!trueAndTrue){

            chxTrueAndTrueNo.setChecked(false);
        }*/

      chxTrueAndTrueYes.setChecked((trueAndTrue ? true:false));
      chxTrueAndTrueNo.setChecked((!trueAndTrue ? true:false));

      //True And False
        boolean trueAndFalse=(true&&false);
       /* if(trueAndFalse){
            chxTrueAndFalseYes.setChecked(true);
        }else if(!trueAndFalse){
            chxTrueAndFalseNo.setChecked(true);
        }*/
       chxTrueAndFalseYes.setChecked((trueAndFalse?true:false));
       chxTrueAndFalseNo.setChecked((!trueAndFalse?true:false));

       //False And True
        boolean falseAndTrue=(false && true);

       /* if(falseAndTrue){

            chxFalseAndTrueYes.setChecked(true);
        }else if(!falseAndTrue){

            chxFalseAndTrueNo.setChecked(true);
        }*/

       chxFalseAndTrueYes.setChecked(falseAndTrue?true:false);
       chxFalseAndTrueNo.setChecked(!falseAndTrue?true:false);

       //False And False
        boolean falseAndFalse=(false && false);
       /* if(falseAndFalse){

            chxFalseAndFalseYes.setChecked(true);
        }else if(!falseAndFalse){
            chxFalseAndFalseNo.setChecked(true);
        }*/

       chxFalseAndFalseYes.setChecked((falseAndFalse?true:false));
        chxFalseAndFalseNo.setChecked((!falseAndFalse?true:false));

        //True Or True
        boolean trueOrTrue=(true || true);
        if(trueOrTrue){

           chxTrueOrTrueYes.setChecked(true);
        }else if(!trueOrTrue){
            chxTrueOrTrueNo.setChecked(true);

        }

       // chxTrueOrTrueYes.setChecked((trueOrTrue?true:false));
        //chxTrueOrTrueNo.setChecked((!trueOrTrue)?true:false);

        //True Or False
        boolean trueOrFalse=(true||false);
       if(trueOrFalse){

chxTrueOrFalseYes.setChecked(true);
       }else if(!trueOrFalse){
chxTrueOrFalseNo.setChecked(true);

       }
       //chxTrueOrFalseYes.setChecked((trueOrFalse?true:false));
       //chxTrueOrFalseNo.setChecked((!trueOrFalse?true:false));


        //False Or True
        boolean falseOrTrue=(false||true);
       if(falseOrTrue){

            chxFalseOrTrueYes.setChecked(true);
       }else if(!falseOrTrue){
chxFalseOrTrueNo.setChecked(true);

       }
       //chxFalseOrTrueYes.setChecked((falseOrTrue?true:false));
       // chxFalseOrTrueNo.setChecked((!falseOrTrue?true:false));


        //False Or False
        boolean falseOrFalse=(false||false);
       if(falseOrFalse) {

chxFalseOrFalseYes.setChecked(true);
       }else if(!falseOrFalse){
chxFalseOrFalseNo.setChecked(true);

       }
      // chxFalseOrFalseYes.setChecked((falseOrFalse?true:false));
    //   chxFalseOrFalseNo.setChecked((!falseOrFalse?true:false));

        //True ^ True
        boolean trueCaretTrue=(true^true);
       if(trueCaretTrue){

           chxTrueCaretTrueYes.setChecked(true);

       }else if(!trueCaretTrue){

           chxTrueCaretTrueNo.setChecked(true);

       }
//       chxTrueCaretTrueYes.setChecked((trueCaretTrue?true:false));
//       chxTrueCaretTrueNo.setChecked((!trueCaretTrue?true:false));

        //True ^ False
        boolean trueCaretFalse=(true^false);
        if(trueCaretFalse){

            chxTrueCaretFalseYes.setChecked(true);

        }else if(!trueCaretFalse){

            chxTrueCaretFalseNo.setChecked(true);
        }
//        chxTrueCaretFalseYes.setChecked((trueCaretFalse?true:false));
//        chxTrueCaretFalseNo.setChecked((!trueCaretFalse?true:false));

        //False ^ True
       boolean falseCaretTrue=(false^true);
       if(falseCaretTrue){

           chxFalseCaretTrueYes.setChecked(true);

       }else if(!falseCaretTrue){

           chxFalseCaretTrueNo.setChecked(true);

       }

//       chxFalseCaretTrueYes.setChecked((falseCaretTrue?true:false));
//       chxFalseCaretTrueNo.setChecked((!falseCaretTrue?true:false));

        //False ^ False
       boolean falseCaretFalse=(false^false);
        if(falseCaretFalse){

            chxFalseCaretFalseYes.setChecked(true);

        }else if(!falseCaretFalse){

            chxFalseCaretFalseNO.setChecked(true);
        }

//        chxFalseCaretFalseYes.setChecked((falseCaretFalse?true:false));
//        chxFalseCaretFalseNO.setChecked((!falseCaretFalse?true:false));

    }
}