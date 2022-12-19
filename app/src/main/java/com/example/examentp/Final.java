package com.example.examentp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    EditText nom2 , cin2;
    TextView pts1 , pts2 ,pts3 , total , mention;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        nom2=findViewById(R.id.nom2);
        cin2=findViewById(R.id.cin2);
        pts1=findViewById(R.id.pts1);
        pts2=findViewById(R.id.pts2);
        pts3=findViewById(R.id.pts3);
        total=findViewById(R.id.total);
        mention=findViewById(R.id.mention);
        Intent i = getIntent();

        int total = i.getIntExtra("nom",0);

    }
}