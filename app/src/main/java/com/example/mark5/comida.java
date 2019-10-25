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

public class comida extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = comida.this;

    public String Papas_fritas ="https://media.giphy.com/media/l0MYwewrA4waPHOM0/giphy.gif";
    public String Helado  ="https://media.giphy.com/media/l0MYJ3jh1doY2WMNi/giphy.gif";
    public String Galleta  ="https://media.giphy.com/media/3o7TKyQxBh1gLDLAR2/giphy.gif";
    public String Pastel  ="https://media.giphy.com/media/3o7TKKlp6yu9jol9pm/giphy.gif";
    public String Jugo  ="https://media.giphy.com/media/l0MYHseBTAveR2Gti/giphy.gif";
    public String Leche ="https://media.giphy.com/media/3o7TKIeb4GHExS3atG/giphy.gif";
    public String Te  ="https://media.giphy.com/media/3o7TKFMNtTiXlPxazm/giphy.gif";
    public String Cafe ="https://media.giphy.com/media/l0MYuUY4KvA3ojpeM/giphy.gif";
    public String Huevos ="https://media.giphy.com/media/3o7TKGv2bWTwSsU20U/giphy.gif";
    public String Limonada ="https://media.giphy.com/media/3o7TKuHQnZxncf4vsI/giphy.gif";
    public String Cerveza  ="https://media.giphy.com/media/l0MYt8ThzltEMVkYM/giphy.gif";
    public String Vino  ="https://media.giphy.com/media/3o7TKP3HhbTcDH6oes/giphy.gif";
    public String Pasta ="https://media.giphy.com/media/3o7TKGfQD21mJlkVNK/giphy.gif";
    public String Arroz ="https://media.giphy.com/media/3o7TKRRlAAXLn2uili/giphy.gif";
    public String Pizza  ="https://media.giphy.com/media/l0MYw5E38UdfG5IqI/giphy.gif";
    public String Pan  ="https://media.giphy.com/media/l0MYQ98VjXVUzm2Mo/giphy.gif";
    public String Tocino ="https://media.giphy.com/media/3o7TKEHe4gHSLe0N56/giphy.gif";
    public String Jamon ="https://media.giphy.com/media/3o7TKBMLUq1XhO4vmg/giphy.gif";
    public String Queso  ="https://media.giphy.com/media/3o7TKnFQ1d9dfrvflm/giphy.gif";
    public String Carne  ="https://media.giphy.com/media/l0MYylsiF4xU6GYEg/giphy.gif";
    public String Hamburguesa ="https://media.giphy.com/media/3o7TKG3dsaROlQCyxa/giphy.gif";
    public String Ensalada ="https://media.giphy.com/media/l0MYQ22x8lMK0wuQM/giphy.gif";

    public String[] listadoGiff = {"Papas_fritas","Helado","Galleta","Pastel","Jugo","Leche","Te","Cafe","Huevos"
            ,"Limonada","Cerveza","Vino","Pasta","Arroz","Pizza","Pan","Tocino","Jamon","Queso","Carne","Hamburguesa","Ensalada"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
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
                        case "Papas_fritas":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Papas_fritas).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Helado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Helado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Galleta":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Galleta).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pastel":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Pastel).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Jugo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Jugo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Leche":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Leche).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Te":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Te).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Cafe":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Cafe).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Huevos":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Huevos).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Limonada":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Limonada).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Cerveza":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Cerveza).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Vino":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Vino).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pasta":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Pasta).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Arroz":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Arroz).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pan":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Pan).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Tocino":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Tocino).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Jamon":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Jamon).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Queso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Queso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Carne":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Carne).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Hamburguesa":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Hamburguesa).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Ensalada":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Ensalada).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                    }
                    break;

                }


            }
            if (!acumulador.equalsIgnoreCase(textoProcesado))
            {
                Toast.makeText(contexto, "palabra NO encontrada", Toast.LENGTH_SHORT).show();
                mostrarImagen = (ImageView)findViewById(R.id.imageView);
                Glide.with(contexto).load(R.mipmap.mdoce).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca un Alimento", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mdoce).into(mostrarImagen);
        }

    }
}
