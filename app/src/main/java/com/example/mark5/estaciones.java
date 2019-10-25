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

public class estaciones extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = estaciones.this;

    public String Verano  = " https://media.giphy.com/media/3o6ZsZ8y1437VxVhXa/giphy.gif";
    public String Primavera ="https://media.giphy.com/media/l0HlAjpuqppORFSrm/giphy.gif ";
    public String Frio  =" https://media.giphy.com/media/l0HlxlL6ZfBOHWgi4/giphy.gif";
    public String Humedo ="https://media.giphy.com/media/3o6Zt0VZIMzTtjVcjK/giphy.gif ";
    public String Caluroso ="https://media.giphy.com/media/3o6Zt99k5aDok347bG/giphy.gif ";
    public String Soleado  ="https://media.giphy.com/media/3o6Zt7merN2zxEtNRK/giphy.gif ";
    public String Nublado ="https://media.giphy.com/media/l0HlTUu50ieMsicFO/giphy.gif ";
    public String Viento  = "https://media.giphy.com/media/3o6ZtbRG6gfZj7B6Gk/giphy.gif ";
    public String Lluvioso ="https://media.giphy.com/media/l0HlCwNUbyfu7VKDK/giphy.gif ";

    public String[] listadoGiff = {"Verano","Primavera","Frio","Humedo","Caluroso","Soleado"," Nublado","Viento","Lluvioso"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones);
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
                        case "Verano":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Verano).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Primavera":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Primavera).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Invierno":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Frio).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Humedo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Humedo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Caluroso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Caluroso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Soleado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Soleado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Nublado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Nublado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Viento":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Viento).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Lluvioso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Lluvioso).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.mcuatro).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca una estacion del año", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mcuatro).into(mostrarImagen);
        }

    }


}


