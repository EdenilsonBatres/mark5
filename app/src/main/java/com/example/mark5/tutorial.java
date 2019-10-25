package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        Toast.makeText(this, "Problemas no se puede conectar con el video",Toast.LENGTH_SHORT).show();

    }
    public void clic(View view)
    {
        Toast.makeText(this,"No se puede mostrar el video",Toast.LENGTH_SHORT).show();

    }

    public void irMenu(View view)
    {
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
        finish();
    }
}
