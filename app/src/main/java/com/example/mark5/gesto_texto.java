package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class gesto_texto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesto_texto);
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
                Toast.makeText(this, "Se ha detenido la traduccion",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(this, menusito.class);
                startActivity(intent);
                finish();
                break;
            case R.id.volver_btn:
                Toast.makeText(this, "Regresando al menu", Toast.LENGTH_SHORT).show();
                Intent volver = new Intent(this, menusito.class);
                startActivity(volver);
                finish();
                break;
            case R.id.icon_btn:
                Toast.makeText(this, "Volviendo",Toast.LENGTH_SHORT).show();
                Intent regresar = new Intent(this, menusito.class);
                startActivity(regresar);
                finish();
                break;
            case R.id.icono_mano:
                Toast.makeText(this,"Puto el que lo Lea",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_bluetooth:
                Toast.makeText(this,"Reintentando la conexion Bluetooth",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"conexion Bluetooth fallida, Guante no encontrado",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_zinc:
                Toast.makeText(this,"No permitido, Bluetooth no operativo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_data:
                Toast.makeText(this,"No permitido, Bluetooth no operativo",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
