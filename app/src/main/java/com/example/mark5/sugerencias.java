package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sugerencias extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugerencias);
    }

    public void click(View view)
    {
        Intent intent = new Intent(this, ajustes.class);
        startActivity(intent);
    }
}
