package com.example.examentp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button but1;
    RadioButton radio7;
     EditText remplir1 , remplir2 , cin , nom;
    CheckBox coche1 , coche2 , coche3;
    int total;
    int res1 , res2 , res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = findViewById(R.id.but1);
        radio7=findViewById(R.id.radio7);
        remplir1=findViewById(R.id.remplir1);
        remplir1=findViewById(R.id.remplir2);
        remplir1=findViewById(R.id.cin);
        remplir1=findViewById(R.id.nom);
        coche1=findViewById(R.id.coche1);
        coche2=findViewById(R.id.coche2);
        coche3=findViewById(R.id.coche3);
        but1.setOnClickListener(this);


        int res1;
        if (coche1.isChecked()){
            res1 = 1;
        }
        else if (coche3.isChecked()) res1 = 2;


        int res2;

        if (remplir1.getText().toString().equals("automatique")){
             res2 = 2;
        }
        else if (remplir1.getText().toString().equals("informations")){
            res2=2;
        }

        int res3;
        if(radio7.isChecked())
        {
            res3=3;
        }
        else
        {
            res3=0;
        }


    }

    @Override
    public void onClick(View view) {
        total = res1+res2+res3;
        Intent i = new Intent(getApplicationContext(),Final.class);
        i.putExtra("nom", (CharSequence) remplir1);
        i.putExtra("res1",res1);
        i.putExtra("res2",res2);
        i.putExtra("res3",res3);
        i.putExtra("total",total);
        startActivity(i);






    }
}