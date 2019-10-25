package com.example.mark5;//inicio de la activity
//librerias de android
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//inicio de la clase gesto voz
public class gesto_texto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)//funcion onCreate que se ejectuta al iniciar la activity gesto-voz
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesto_texto);//enlace con la interfaz xml
    }

    public void siClick(View view)//funcion onClick
    {
        switch (view.getId())//swich para verificar que botones an sido seleccionados
        {
            case R.id.traducir_btn://si se selecciona el boton traducir mostrara dos mensajes emergentes
                Toast.makeText(this, "Analizando conectividad Bluetooth", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "No se pudo iniciar la conexion por Bluetooth", Toast.LENGTH_LONG).show();
                break;
            case R.id.detener_btn://si se seleciona el boton detener, te enviara al menu principal
                Toast.makeText(this, "Se ha detenido la traduccion",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(this, menusito.class);
                startActivity(intent);
                finish();
                break;
            case R.id.volver_btn://si se seleciona el boton volver, te enviara al menu principal
                Toast.makeText(this, "Regresando al menu", Toast.LENGTH_SHORT).show();
                Intent volver = new Intent(this, menusito.class);
                startActivity(volver);
                finish();
                break;
            case R.id.icon_btn://si se seleciona el icono de regresar, te enviara al menu principal
                Toast.makeText(this, "Volviendo",Toast.LENGTH_SHORT).show();
                Intent regresar = new Intent(this, menusito.class);
                startActivity(regresar);
                finish();
                break;
            case R.id.icono_mano://si se preciona el icono de la manita te mostrara un mensaje
                Toast.makeText(this,"Los sueños rigen tu destino",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_bluetooth://si se preciona el icono de bluetooth mostrara un mensaje
                Toast.makeText(this,"Reintentando la conexion Bluetooth",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"conexion Bluetooth fallida, Guante no encontrado",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_zinc://si se preciona el icono de zinc mostrara un mensaje
                Toast.makeText(this,"No permitido, Bluetooth no operativo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.icono_data://si se preciona el icono de data mostrara un mensaje
                Toast.makeText(this,"No permitido, Bluetooth no operativo",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
