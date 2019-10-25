package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class deportes extends AppCompatActivity
{

    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = deportes.this;

    public String Pesacar ="https://media.giphy.com/media/l0MYz0yx7XSYUqnyU/giphy.gif";
    public String Bailar ="https://media.giphy.com/media/3o7TKxibwLT6BOxtcI/giphy.gif";
    public String Billar ="https://media.giphy.com/media/3o7TKIIoQEoWUoRfig/giphy.gif";
    public String Arco  ="https://media.giphy.com/media/l0MYNmJ6Cfy9aU78Q/giphy.gif";
    public String Yoga ="https://media.giphy.com/media/3o7TKMDHh4kTCMYQkU/giphy.gif";
    public String Ping_pong ="https://media.giphy.com/media/3o7TKp1tEZr2bM7WrC/giphy.gif";
    public String Nadar ="https://media.giphy.com/media/3o7TKP5txTagw4uY7e/giphy.gif";
    public String Carreras_de_autos ="https://media.giphy.com/media/l0MYJKrpw0RkipEdy/giphy.gif";
    public String Karate ="https://media.giphy.com/media/l0MYK9UTge8FTDUNG/giphy.gif";
    public String Futbol ="https://media.giphy.com/media/26hitpMUgLeb2vCaQ/giphy.gif";
    public String Baloncesto ="https://media.giphy.com/media/l0MYHFLYJBKCDB3CU/giphy.gif";

    public String[] listadoGiff = {"Pesacar","Bailar","Billar","Arco","Yoga","Ping pong","Nadar","Carreras de autos","Karate","Futbol","Baloncesto"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);
    }
    public void onclick(View view)
    {
        Intent intent = new Intent(contexto, ScrollingActivity.class);
        startActivity(intent);
    }

    public void a_home(View view)
    {
        Intent intent = new Intent(contexto, menusito.class);
        startActivity(intent);
    }

    public void  buscar(View view )
    {
        textoIntroducido = (EditText)findViewById(R.id.editText);
        textoProcesado = textoIntroducido.getText().toString();

        if (!textoProcesado.isEmpty())
        {
            for (int i = 0; i < listadoGiff.length; i++)
            {
                acumulador = listadoGiff[i];
                if (acumulador.equals(textoProcesado))
                {

                    Toast.makeText(contexto, "Palabra encontrada", Toast.LENGTH_SHORT).show();
                    String finality = String.format(acumulador).toString();
                    Toast.makeText(contexto, finality,Toast.LENGTH_SHORT).show();
                    switch (acumulador)
                    {
                        case "Pesacar":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Pesacar).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Bailar":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Bailar).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Billar":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Billar).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Arco":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Arco).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Yoga":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Yoga).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Ping pong":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Ping_pong).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Nadar":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Nadar).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Carreras de autos":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Carreras_de_autos).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Karate":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Karate).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Futbol":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Futbol).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Baloncesto":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Baloncesto).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;

                    }
                    break;

                }


            }
            if (!acumulador.equals(textoProcesado))
            {
                Toast.makeText(contexto, "palabra NO encontrada", Toast.LENGTH_SHORT).show();
                mostrarImagen = (ImageView)findViewById(R.id.imageView);
                Glide.with(contexto).load(R.mipmap.monce).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Escribe una expresion", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.monce).into(mostrarImagen);
        }

    }
}
