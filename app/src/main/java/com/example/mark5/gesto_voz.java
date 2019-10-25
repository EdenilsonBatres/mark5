package com.example.mark5;//inicio de la activity
//librerias de android
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//inicio de la clase gesto voz
public class gesto_voz extends AppCompatActivity
{

    @Override//funcion onCreate que se ejectuta al iniciar la activity gesto-voz
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesto_voz);//enlace con la interfaz xml
    }

    public void siClick(View view)//funcion onClick
    {
        switch (view.getId())//swich para verificar que botones an sido seleccionados
        {
            case R.id.traducir_btn://si se selecciona el boton comenzar mostrara dos mensajes emergentes
                Toast.makeText(this, "Analizando conectividad Bluetooth", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "No se pudo iniciar la conexion por Bluetooth", Toast.LENGTH_LONG).show();
                break;
            case R.id.detener_btn://si se seleciona el boton detener, te enviara al menu principal
                Toast.makeText(this, "Se ha detenido la Interpretacion",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(this, menusito.class);
                startActivity(intent);
                finish();//desactiva el boton regresar
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
                Toast.makeText(this,"El camino a 100 años luz, comienza con el primer paso",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
