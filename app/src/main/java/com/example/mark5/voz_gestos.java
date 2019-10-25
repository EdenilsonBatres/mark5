package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class voz_gestos extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz_gestos);
    }

    public void a_menuprincipal(View view)
    {
        Intent intent= new Intent(this, menusito.class);
        startActivity(intent);
    }
    public void onClick (View view)
    {
        switch (view.getId())
        {
            case R.id.B_familia:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, familia_dos.class);
                startActivity(intent);
                break;
            case R.id.B_animales:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentAnim = new Intent(this, animales_dos.class);
                startActivity(intentAnim);
                break;
            case R.id.B_frutas:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentFrut = new Intent(this, frutas_dos.class);
                startActivity(intentFrut);
                break;
            case R.id.B_estaciones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentEst = new Intent(this, estaciones_dos.class);
                startActivity(intentEst);
                break;
            case R.id.B_emociones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentEmo = new Intent(this, emociones_dos.class);
                startActivity(intentEmo);
                break;
            case R.id.B_saludos:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentS = new Intent(this, saludos_dos.class);
                startActivity(intentS);
                break;
            case R.id.B_profeciones:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentP = new Intent(this, profesiones_dos.class);
                startActivity(intentP);
                break;
            case R.id.B_ropa:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentRop = new Intent(this, ropa_dos.class);
                startActivity(intentRop);
                break;
            case R.id.B_preguntasFrecuentes:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentPf = new Intent(this, preguntasComunes_dos.class);
                startActivity(intentPf);
                break;
            case R.id.B_deportes:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentDep = new Intent(this, deportes_dos.class);
                startActivity(intentDep);
                break;
            case R.id.B_comida:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentCom = new Intent(this, comida_dos.class);
                startActivity(intentCom);
                break;
            case R.id.B_exprecionesFrecuentes:
                Toast.makeText(this, "La busqueda esta sujeta a tu conexion de internet",Toast.LENGTH_SHORT).show();
                Intent intentEf = new Intent(this, expresionComun_dos.class);
                startActivity(intentEf);
                break;

        }
    }
}
