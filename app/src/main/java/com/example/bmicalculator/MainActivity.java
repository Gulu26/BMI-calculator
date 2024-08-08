package com.example.bmicalculator;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edweigth, edheigth, edinch;
        Button btncal;
        TextView txt1;


        edweigth = findViewById(R.id.edweigth);
        edheigth = findViewById(R.id.edheight);
        edinch = findViewById(R.id.edinch);
        btncal = findViewById(R.id.btncal);
        txt1 = findViewById(R.id.txt1);

        btncal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               int wt =  Integer.parseInt(edweigth.getText().toString()) ;//here int is typecasting
               int ht = Integer.parseInt(edheigth.getText().toString());
               int inch = Integer.parseInt(edinch.getText().toString());



               int  totalIn = ht*12 + inch;
               double totalCm = totalIn*2.53;

               double totalM = totalCm/100;

               double BMI = wt/(totalM*totalM);

               if( BMI > 25){
                   txt1.setText("you are overweigth");
               } else if (BMI <18) {
                   txt1.setText(" you re underweigth");

               }else{
                   txt1.setText(" You are healthy");
               }



            }
        });






    }
}