package com.example.mark5;

//librerias de android para el funcionamiento de la aplicacion
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.facebook.login.LoginManager;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.Toast;

//clase menusito que contiene las funciones principales de los botones
public class menusito extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //inicio de la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusito);//enlace del la interfaz xml al codigo java
        Toolbar toolbar = findViewById(R.id.toolbar);//incorporacion del toolbar
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);//enlace al archivo xml del menu desplegable
        NavigationView navigationView = findViewById(R.id.nav_view);//enlace al archivo xml del la barra de navegacion
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }
//si no hay sesion iniciada en facebook automaticamente te envia al login
    private void goLogInScreen()
    {
        Intent a_loguin = new Intent(this, login.class);
        startActivity(a_loguin);
        finish();
    }
//condigo que proporciona la funcionalidad al menu desplegable
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
//al seleccionar un vector en el menu desplegable, se ejecutan una de las siguientes acciones
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)//si se preciona algun vector
      {
        // en una variable entera se almacena el id
        int id = item.getItemId();
        //si el id es nav_tutorial ara lo siguiente
        if (id == R.id.nav_tutorial)
        {
            //Toast.makeText(this,"al tutorial", Toast.LENGTH_SHORT).show();//se abrira una activity
            Intent intent = new Intent(this, tutorial.class);
            startActivity(intent);
            finish();
        }
        //si el id es nav_configuracion ara lo siguiente
        else if (id == R.id.nav_configuracion)
        {
            Intent intent = new Intent(this, configuracion.class);
            startActivity(intent);
            finish();
        //aun no definido
        }
        else if (id == R.id.nav_consejos)
        {
            Intent intent = new Intent(this, consejos.class);
            startActivity(intent);
            finish();
            //aun no definido
        }
        else if (id == R.id.nav_sugerencias)
        {
            Intent intentsug = new Intent(this, sugerencias.class);
            startActivity(intentsug);
            finish();
            //aun no definido
        }
        else if (id == R.id.nav_ajustes)
        {
            Intent intentaj = new Intent(this, ajustes.class);
            startActivity(intentaj);
            finish();

        }

        else if (id == R.id.nav_salir)
        {
            LoginManager.getInstance().logOut();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);



          // System.exit(0);//cerrara la aplicacion

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onclick (View view)
    {
        switch (view.getId())//la funcion view que conecta con la vista verifica el id seleccionado
        {
            case R.id.gesto_voz_btn://si el se selecciona el boton de gesto_voz ejecuta lo siguiente
                Intent gesto_voz_btn = new Intent(this, gesto_voz.class);
                startActivity(gesto_voz_btn);//abre la activity gesto-voz
               // finish();
                break;
            case R.id.gesto_texto_btn://si el se selecciona el boton de gesto_texto ejecuta lo siguiente
                Intent gesto_texto_btn = new Intent(this, gesto_texto.class);
                startActivity(gesto_texto_btn);//abre la activity gesto-texto
              //  finish();
                break;
            case R.id.texto_voz_btn://si el se selecciona el boton de texto-voz ejecuta lo siguiente
                Intent texto_voz_btn = new Intent(this, texto_voz.class);
                startActivity(texto_voz_btn);//abre la activity texto-voz
              //  finish();
                break;
            case R.id.texto_gestos_btn://si el se selecciona el boton de texto-gestos ejecuta lo siguiente
                Intent texto_gestos_btn = new Intent(this, ScrollingActivity.class);
                startActivity(texto_gestos_btn);//abre la activity texto-gestos
             //   finish();
                break;
            case R.id.vos_gesto_btn://si el se selecciona el boton de vos_gesto ejecuta lo siguiente
                Intent voz_gesto_btn = new Intent(this, voz_gestos.class);
                startActivity(voz_gesto_btn);//abre la activity vos_gesto
             //   finish();
                break;
            case R.id.voz_texto_btn://si el se selecciona el boton de gesto_voz_texto lo siguiente
                Intent voz_texto_btn = new Intent(this, voz_texto.class);
                startActivity(voz_texto_btn);//abre la activity voz_texto
              //  finish();
                break;
            case R.id.configuracion_btn://si el se selecciona el boton de configuracion ejecuta lo siguiente
                Intent configiracion_btn= new Intent(this, configuracion.class);
                startActivity(configiracion_btn);//abre la activity configuracion
               // finish();
                break;
            case R.id.consejos_btn://si el se selecciona el boton de .consejos ejecuta lo siguiente
                Intent consejos_btn= new Intent(this, consejos.class);
                startActivity(consejos_btn);//abre la activity consejos
                finish();
                break;
            case R.id.diccionario_btn://si el se selecciona el boton de .diccionario ejecuta lo siguiente
                Intent diccionario_btn= new Intent(this, diccionario.class);
                startActivity(diccionario_btn);//abre la activity consejos
         //       finish();
                break;

        }
    }

    @Override
    protected void onDestroy()
    {
        LoginManager.getInstance().logOut();
        super.onDestroy();
        finish();
    }
}
