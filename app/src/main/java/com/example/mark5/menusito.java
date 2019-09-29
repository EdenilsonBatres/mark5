package com.example.mark5;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.Toast;

public class menusito extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusito);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.home);*/

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        /*if (AccessToken.getCurrentAccessToken() == null)
        {
            goLogInScreen();
        }*/
    }

    private void goLogInScreen()
    {
        Intent a_loguin = new Intent(this, login.class);
        startActivity(a_loguin);
        finish();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_tutorial)
        {
            Toast.makeText(this,"al tutorial", Toast.LENGTH_SHORT).show();
            // Handle the camera action
        }
        else if (id == R.id.nav_configuracion)
        {

        }
        else if (id == R.id.nav_consejos)
        {

        }
        else if (id == R.id.nav_sugerencias)
        {

        }
        else if (id == R.id.nav_ajustes)
        {

        }
        else if (id == R.id.nav_salir)
        {
            //LoginManager.getInstance().logOut();
           System.exit(0);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onclick (View view)
    {
        switch (view.getId())
        {
            case R.id.gesto_voz_btn:
                Intent gesto_voz_btn = new Intent(this, gesto_voz.class);
                startActivity(gesto_voz_btn);
                break;
            case R.id.gesto_texto_btn:
                Intent gesto_texto_btn = new Intent(this, gesto_texto.class);
                startActivity(gesto_texto_btn);
                break;
            case R.id.texto_voz_btn:
                Intent texto_voz_btn = new Intent(this, texto_voz.class);
                startActivity(texto_voz_btn);
                break;
            case R.id.texto_gestos_btn:
                Intent texto_gestos_btn = new Intent(this, texto_gesto.class);
                startActivity(texto_gestos_btn);
                break;
            case R.id.vos_gesto_btn:
                Intent voz_gesto_btn = new Intent(this, voz_gesto.class);
                startActivity(voz_gesto_btn);
                break;
            case R.id.voz_texto_btn:
                Intent voz_texto_btn = new Intent(this, voz_texto.class);
                startActivity(voz_texto_btn);
                break;
            case R.id.configuracion_btn:
                Intent configiracion_btn= new Intent(this, configuracion.class);
                startActivity(configiracion_btn);
                break;
            case R.id.consejos_btn:
                Intent consejos_btn= new Intent(this, consejos.class);
                startActivity(consejos_btn);
                break;

        }
    }
}
