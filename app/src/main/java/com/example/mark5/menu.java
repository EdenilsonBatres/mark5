package com.example.mark5;//iniciacion de la aplicacion

//librerias de android para el funcionamiento de los elementos de la activity
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

//clase publica que ejecuta los metodos logicos y graficos de la activity
public class menu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
/*
        if (AccessToken.getCurrentAccessToken() == null)
        {
            goLogin();
        }*/

    }

    private void goLogin()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
    }

    public void logout(View view)
    {
        LoginManager.getInstance().logOut();
        goLogin();
    }
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.gesto_voz:
                Intent intent = new Intent(this, gesto_voz.class);
                startActivity(intent);
                break;
            case R.id.gesto_texto:
                Intent a_gesto_texto = new Intent(this, gesto_texto.class);
                startActivity(a_gesto_texto);
                break;
            case R.id.texto_voz:
                Intent a_texto_voz = new Intent(this, texto_voz.class);
                startActivity(a_texto_voz);
                break;
            case R.id.texto_gestos:
                Intent a_texto_gesto = new Intent(this, texto_gesto.class);
                startActivity(a_texto_gesto);
                break;
            case R.id.voz_gestos:
                Intent a_voz_gesto = new Intent(this, voz_gesto.class);
                startActivity(a_voz_gesto);
                break;
            case R.id.voz_texto:
                Intent a_voz_texto = new Intent(this, voz_texto.class);
                startActivity(a_voz_texto);
                break;
            case R.id.diccionario:
                Intent a_diccionario = new Intent(this, diccionario.class);
                startActivity(a_diccionario);
                break;
            case R.id.configuracion:
                Intent a_configuracion = new Intent(this, configuracion.class);
                startActivity(a_configuracion);
                break;
            case R.id.consejos:
                Intent a_consejos = new Intent(this, consejos.class);
                startActivity(a_consejos);
                break;
        }
    }


}
