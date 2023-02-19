 package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Msj1(View view){
        Toast.makeText(this, "Este es el mensaje 1", Toast.LENGTH_SHORT).show();
    }

     public void Msj2(View view){
         Toast.makeText(this, "Este es el mensaje 2", Toast.LENGTH_SHORT).show();
     }

     public void Msj3(View view){
         Toast.makeText(this, "Este es el mensaje 3", Toast.LENGTH_SHORT).show();
     }

     public void Msj4(View view){
         Toast.makeText(this, "Este es el mensaje 4", Toast.LENGTH_SHORT).show();
     }
     public void Msj5(View view){
         Toast.makeText(this, "Este es el mensaje 5", Toast.LENGTH_SHORT).show();
     }

     public void Msj6(View view){
         Toast.makeText(this, "Este es el mensaje 6", Toast.LENGTH_SHORT).show();
     }

     public void Msj7(View view){
         Toast.makeText(this, "Este es el mensaje 7", Toast.LENGTH_SHORT).show();
     }

     public void Msj8(View view){
         Toast.makeText(this, "Este es el mensaje 8", Toast.LENGTH_SHORT).show();
     }
}