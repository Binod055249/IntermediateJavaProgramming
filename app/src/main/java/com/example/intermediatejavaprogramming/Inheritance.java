package com.example.intermediatejavaprogramming;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inheritance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        TextView txtAnimal=findViewById(R.id.txtAnimal);
        TextView txtCat=findViewById(R.id.txtCat);
        TextView txtLion=findViewById(R.id.txtLion);
        TextView txtLeopard=findViewById(R.id.txtLeopard);
        TextView txtBird=findViewById(R.id.txtBird);

        Animal animal1=new Animal("Tiger","Orange",60,80);
        txtAnimal.setText(animal1.toString());

        Cat cat1=new Cat("My Cat","White",40,30,4,true);
        txtCat.setText(cat1.toString()+"");

        Lion lion1=new Lion("My Lion","Black",50,60,4,true,true);
        txtLion.setText(lion1.toString());

        Leopard leopard1=new Leopard("My Leopard","Brown",60,70,4,true,"Sharp");
       txtLeopard.setText(leopard1.toString());

       Bird bird1=new Bird("My Bird","white",70,40,true,2,2);
       txtBird.setText(bird1.toString());

    }
}