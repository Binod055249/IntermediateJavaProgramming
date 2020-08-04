package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt1= findViewById(R.id.txt1);
        TextView txt2=findViewById(R.id.txt2);
        TextView txt3=findViewById(R.id.txt3);

         txt1.setText("my own text..");

        String str1="Some Value";
        StringTokenizer stringObject1=new StringTokenizer(str1);

        txt1.setText(stringObject1.nextToken());
        txt2.setText(stringObject1.nextToken());
/*
     String str2="This is another text@This is your text@This is my text";
        StringTokenizer strObject2=new StringTokenizer(str2,"@");

        txt1.setText(strObject2.nextToken());
        txt2.setText(strObject2.nextToken());
        txt3.setText(strObject2.nextToken()+" Fine");
*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}