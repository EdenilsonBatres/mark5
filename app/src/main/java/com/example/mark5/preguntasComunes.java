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

public class preguntasComunes extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = preguntasComunes.this;

    public String Como_estas  ="https://media.giphy.com/media/26FLgm33ve3iUexZC/giphy.gif";
    public String Que_estas_haciendo ="https://media.giphy.com/media/l4Jz3qhJJyN08hFtu/giphy.gif";
    public String Por_favor_repitelo ="https://media.giphy.com/media/l4JyS41E9OFXw7ixi/giphy.gif";
    public String Que_esta_mal ="https://media.giphy.com/media/26FLexfKeBtKiMTTO/giphy.gif";
    public String Esta_frío_aquí ="https://media.giphy.com/media/26FL5Y32Wjoxg0nu0/giphy.gif";
    public String Hace_calor_aquí ="https://media.giphy.com/media/l4JyQYnXVoaCF21fq/giphy.gif";

    public String[] listadoGiff = {"Como estas","Que estas haciendo","Por favor repitelo","Que esta mal","Esta frío aquí","Hace calor aquí"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_comunes);
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
                        case "Como estas":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Como_estas).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Que estas haciendo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Que_estas_haciendo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Por favor repitelo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Por_favor_repitelo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Que esta mal":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Que_esta_mal).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Esta frío aquí":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Esta_frío_aquí).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hace calor aquí":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Hace_calor_aquí).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.mdiez).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Escribe una expresion", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mdiez).into(mostrarImagen);
        }

    }
}
