package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class gesto_voz extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesto_voz);
    }

    public void siClick(View view)
    {
        switch (view.getId())
        {
            case R.id.comenzar_btn:
                Toast.makeText(this, "Analizando conectividad Bluetooth", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "No se pudo iniciar la conexion por Bluetooth", Toast.LENGTH_LONG).show();
                break;
            case R.id.detener_btn:
                Toast.makeText(this, "Se ha detenido la Interpretacion",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(this, menusito.class);
                startActivity(intent);
                finish();
                break;
            case R.id.volver_btn:
                Toast.makeText(this, "Regresando al menu", Toast.LENGTH_SHORT).show();
                Intent volver = new Intent(this, menusito.class);
                startActivity(volver);
                break;
            case R.id.icon_btn:
                Toast.makeText(this, "Volviendo",Toast.LENGTH_SHORT).show();
                Intent regresar = new Intent(this, menusito.class);
                startActivity(regresar);
                break;
            case R.id.icono_mano:
                Toast.makeText(this,"Puto el que lo Lea",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
