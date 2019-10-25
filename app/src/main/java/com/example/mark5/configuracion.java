package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

    }

    public void click(View view)
    {
        Toast.makeText(this,"NO SE PUEDE ACTIVAR EL BLUETOOTH", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
        finish();
    }
    public void cklic(View view)
    {
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
        finish();
    }
}
