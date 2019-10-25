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

public class emergencia extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = emergencia.this;

    public String Emergencia ="https://media.giphy.com/media/l0MYCbx77mBkQjz8s/giphy.gif";
    public String Incendio ="https://media.giphy.com/media/3o7TKWzdcwbdLeVwDm/giphy.gif";
    public String Ambulancia ="https://media.giphy.com/media/3o7TKM5JpgQwCks55m/giphy.gif";
    public String Policia ="https://media.giphy.com/media/3o7TKHFvJIvjwOuWDS/giphy.gif";
    public String Bombero ="https://media.giphy.com/media/3o7TKFyEQyEmIZNA0E/giphy.gif";
    public String Ayuda ="https://media.giphy.com/media/l0MYQo0iDSTlnRifK/giphy.gif";
    public String Hospital ="https://media.giphy.com/media/3o7TKQZUxQ0rKVz6uI/giphy.gif";
    public String Llamadas ="https://media.giphy.com/media/3o7TKVpHgoqmVEX6so/giphy.gif";
    public String Arma ="https://media.giphy.com/media/3o7TKEfx4e8OFWdJjq/giphy.gif";
    public String Linterna ="https://media.giphy.com/media/26hisRQpED9rjrqbS/giphy.gif";
    public String Seguro ="https://media.giphy.com/media/l0MYM7xrIaPpSM264/giphy.gif";
    public String Peligroso ="https://media.giphy.com/media/l0MYKwdlkgYr5vJXa/giphy.gif";
    public String Tsunami ="https://media.giphy.com/media/3o7TKyNhQwOaJlR0D6/giphy.gif";
    public String Tornado ="https://media.giphy.com/media/l0MYCjpbTDecBWATu/giphy.gif";
    public String Inundacion ="https://media.giphy.com/media/l0MYHA1tyYMiVJvUc/giphy.gif";
    public String Tormenta ="https://media.giphy.com/media/3o7TKAL6TdR9kWPfuU/giphy.gif";
    public String Guerra ="https://media.giphy.com/media/3o7TKwRDOD8MyRm1na/giphy.gif";
    public String Bomba ="https://media.giphy.com/media/l0MYFDX9mUO2jtTHO/giphy.gif";
    public String Enfermo ="https://media.giphy.com/media/3o7TKv85mTmPAZylvG/giphy.gif";
    public String Quemado ="https://media.giphy.com/media/l0MYPH1SwEkwzAlHO/giphy.gif";
    public String Erupcion ="https://media.giphy.com/media/3o7TKSJzHlN4QmLifK/giphy.gif";

    public String[] listadoGiff = {"Emergencia","Incendio","Ambulancia","Policia","Bombero","Ayuda","Hospital","Llamadas","Arma","Linterna","Seguro","Peligroso","Tsunami",
            "Tornado","Inundacion","Tormenta","Guerra","Bomba","Enfermo","Quemado","Erupcion"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
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
        textoProcesado = textoIntroducido.getText().toString().trim();

        if (!textoProcesado.isEmpty())
        {
            for (int i = 0; i < listadoGiff.length; i++)
            {
                acumulador = listadoGiff[i];
                if (acumulador.equalsIgnoreCase(textoProcesado))
                {

                    Toast.makeText(contexto, "Palabra encontrada", Toast.LENGTH_SHORT).show();
                    String finality = String.format(acumulador).toString();
                    Toast.makeText(contexto, finality,Toast.LENGTH_SHORT).show();
                    switch (acumulador)
                    {
                        case "Emergencia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Emergencia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Incendio":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Incendio).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Ambulancia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Ambulancia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Policia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Policia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Bombero":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Bombero).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Ayuda":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Ayuda).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hospital":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Hospital).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Llamadas":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Llamadas).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Arma":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Arma).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Linterna":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Linterna).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Seguro":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Seguro).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Peligroso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Peligroso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tsunami":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Tsunami).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tornado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Tornado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Inundacion":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Inundacion).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tormenta":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Tormenta).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Guerra":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Guerra).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Bomba":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Bomba).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Enfermo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Enfermo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Quemado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Quemado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Erupcion":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Erupcion).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;

                    }
                    break;

                }


            }
            if (!acumulador.equalsIgnoreCase(textoProcesado))
            {
                Toast.makeText(contexto, "palabra NO encontrada", Toast.LENGTH_SHORT).show();
                mostrarImagen = (ImageView)findViewById(R.id.imageView);
                Glide.with(contexto).load(R.mipmap.mquince).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Escribe una Emergencia", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mquince).into(mostrarImagen);
        }

    }
}
