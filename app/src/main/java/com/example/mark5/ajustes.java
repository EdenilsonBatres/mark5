package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class ajustes extends AppCompatActivity
{
    EditText txtNombreUsuario;
    EditText txtCorreoUsuario;
    Button btnGuardar;
    DatabaseReference myRootReference;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        myRootReference = FirebaseDatabase.getInstance().getReference();
        txtNombreUsuario = (EditText) findViewById(R.id.nombreUsuario);
        txtCorreoUsuario = (EditText) findViewById(R.id.correoUsuario);
        btnGuardar = (Button)findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String nombreString = txtNombreUsuario.getText().toString();
                String correoString = txtCorreoUsuario.getText().toString();
                Toast.makeText(getApplicationContext(), "registrado",Toast.LENGTH_LONG).show();
                txtNombreUsuario.setText(" ");
                txtCorreoUsuario.setText(" ");


                Map<String, Object> Datos = new HashMap<>();
                Datos.put("nombre",nombreString);
                Datos.put("correo",correoString);

                myRootReference.child("usuario").push().setValue(Datos);
            }
        });

    }

    public void clik(View view)
    {
        switch (view.getId())
        {
            case R.id.imageButton3:
                Intent intentConsejos = new Intent(this, consejos.class);
                startActivity(intentConsejos);
                finish();
                break;
            case R.id.imageButton2:
                Intent intentconfiguracion = new Intent(this, configuracion.class);
                startActivity(intentconfiguracion);
                finish();
                break;
            case R.id.imageButton4:
                Intent intentsugerencias = new Intent(this, sugerencias.class);
                startActivity(intentsugerencias);
                finish();
                break;
        }
    }
}
