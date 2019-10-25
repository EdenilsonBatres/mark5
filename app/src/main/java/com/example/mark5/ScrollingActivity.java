package com.example.mark5;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    //funcion para los botones
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.Manimales:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent animales = new Intent(this, animales.class);
                startActivity(animales);
                break;
            case R.id.Mfamilia:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent familia = new Intent(this, familia.class);
                startActivity(familia);
                break;
            case R.id.Mfrutas:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent frutas = new Intent(this, frutas.class);
                startActivity(frutas);
                break;
            case R.id.Mestaciones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent estaciones= new Intent(this, estaciones.class);
                startActivity(estaciones);
                break;
            case R.id.Memociones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent emociones= new Intent(this, emociones.class);
                startActivity(emociones);
                break;
            case R.id.Mpersonas:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent personas = new Intent(this, personas.class);
                startActivity(personas);
                break;
            case R.id.Mprofeciones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent profeciones = new Intent(this, profesiones.class);
                startActivity(profeciones);
                break;
            case R.id.Mropa:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent ropa= new Intent(this, ropa.class);
                startActivity(ropa);
                break;
            case R.id.Mexprecioncomun:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent exprecion = new Intent(this, expresionComun.class);
                startActivity(exprecion);
                break;
            case R.id.MpreguntasComunes:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent preguntas = new Intent(this, preguntasComunes.class);
                startActivity(preguntas);
                break;
            case R.id.Mdeportes:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent deportes= new Intent(this, deportes.class);
                startActivity(deportes);
                break;
            case R.id.Mcomida:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent comida = new Intent(this, com.example.mark5.comida.class);
                startActivity(comida);
                break;
            case R.id.Msaludos:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent saludos = new Intent(this, saludos.class);
                startActivity(saludos);
                break;
            case R.id.Memergencia:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet", Toast.LENGTH_SHORT).show();
                Intent emergencia = new Intent(this, emergencia.class);
                startActivity(emergencia);
                break;

        }
    }
}
