package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class consejos extends AppCompatActivity
{
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);
    }
    public void clic(View view)
    {
        String consejo = "Procura realizar cada uno de los ejercicios prente a un espejo";
        mostrar = findViewById(R.id.textView8);
        mostrar.setText(consejo);
    }
    public void aL_home(View view)
    {
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
    }

}
