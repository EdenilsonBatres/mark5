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

public class profesiones extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = profesiones.this;

    public String Mecanico  ="https://media.giphy.com/media/26gJAwn7dkRu1dgHK/giphy.gif";
    public String Fontanero ="https://media.giphy.com/media/3o6Zt6rnfShaWHxYM8/giphy.gif";
    public String Diseñador ="https://media.giphy.com/media/3o6ZsXpfYqKoCszknS/giphy.gif";
    public String Programador ="https://media.giphy.com/media/26gJAhYZeQ36s3HUs/giphy.gif";
    public String Electricista  ="https://media.giphy.com/media/l0HlyFs17D7wKizIY/giphy.gif";
    public String Ingeniero ="https://media.giphy.com/media/l0HlIYqnrw4UtTdzW/giphy.gif";
    public String Psicologo ="https://media.giphy.com/media/3o6Zt1TRkXxTWr4BVe/giphy.gif";
    public String Soldado ="https://media.giphy.com/media/3o6ZtmpZ8EZcXR3kXe/giphy.gif";
    public String Contador ="https://media.giphy.com/media/3o6ZsZUV2s8tKNEWEo/giphy.gif";
    public String Vendedor ="https://media.giphy.com/media/26gJAKd8Xz1jpKQUw/giphy.gif";
    public String Chef  ="https://media.giphy.com/media/3o6ZsXdPRGuxKywWPu/giphy.gif";
    public String Dentista ="https://media.giphy.com/media/l0HlTtyWv7EcMyseY/giphy.gif";
    public String Abogado  ="https://media.giphy.com/media/l0HlFNqO9G9pGgyOs/giphy.gif";
    public String  Enfermera ="https://media.giphy.com/media/l0HlG4Q7WBvbP9Gve/giphy.gif";
    public String Doctor  ="https://media.giphy.com/media/3o6ZsUsBNzwQtp5hF6/giphy.gif";
    public String Bombero ="https://media.giphy.com/media/3o6Ztp3DqBPzvawLpS/giphy.gif";
    public String Policia  ="https://media.giphy.com/media/l0HlKCu9GpgWbg6TC/giphy.gif";

    public String[] listadoGiff = {"Mecanico","Fontanero","Diseñador","Programador","Electricista","Ingeniero","Psicologo","Soldado"
            ,"Contador","Vendedor","Chef","Dentista","Abogado","Enfermera","Doctor","Bombero","Policia"};

    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesiones);

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
                        case "Mecanico":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Mecanico).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Fontanero":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Fontanero).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Diseñador":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Diseñador).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Programador":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Programador).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Electricista":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Electricista).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Ingeniero":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Ingeniero).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Psicologo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Psicologo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Soldado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Soldado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Contador":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Contador).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Vendedor":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Vendedor).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Chef":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Chef).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Abogado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Abogado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Enfermera":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Enfermera).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Doctor":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Doctor).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Dentista":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Dentista).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Bombero":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Bombero).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Policia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Policia).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.msiete).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca una profecion", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.msiete).into(mostrarImagen);
        }

    }
}
