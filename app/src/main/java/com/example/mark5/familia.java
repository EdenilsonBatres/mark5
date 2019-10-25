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

public class familia extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = familia.this;

    public String niño ="https://media.giphy.com/media/3o6ZsWZAdmDY4M5W12/giphy.gif";
    public String bebe ="https://media.giphy.com/media/l0HlCuPLK3fVM7urm/giphy.gif";
    public String novia ="https://media.giphy.com/media/l0HlU4CSxhIWzKLdu/giphy.gif";
    public String esposa  ="https://media.giphy.com/media/l0HlV8Jg6Nzx3jp7O/giphy.gif";
    public String esposo ="https://media.giphy.com/media/3o6Zt4DOlGWgEIt8RO/giphy.gif";
    public String hija ="https://media.giphy.com/media/l0HlLz18wGrft14u4/giphy.gif";
    public String hijo = "https://media.giphy.com/media/3o6ZsSYHb0Agx4AIhO/giphy.gif";
    public String hermana ="https://media.giphy.com/media/3o6Ztqnz8kLL7LbRlu/giphy.gif";
    public String hermano ="https://media.giphy.com/media/3o6ZtfHBNoUuaVW4gg/giphy.gif";
    public String tia  ="https://media.giphy.com/media/3o6Ztdukuyn481ZQLC/giphy.gif";
    public String tio  ="https://media.giphy.com/media/3o6ZsVUxWfcT162CyY/giphy.gif";
    public String abuela ="https://media.giphy.com/media/l0HlOTde1r9OHFkfC/giphy.gif";
    public String abuelo ="https://media.giphy.com/media/3o6ZsU83yCtYlFsFIA/giphy.gif";
    public String mama  ="https://media.giphy.com/media/l0HlIhfKLBQ4QgRig/giphy.gif";
    public String papa  ="https://media.giphy.com/media/l0HlNzPBWFE3c2Hao/giphy.gif";
    public String mujer  ="https://media.giphy.com/media/3o6ZtcFC8MooG0b0aI/giphy.gif";
    public String hombre ="https://media.giphy.com/media/3o6Zt4YmcmfrNJBbt6/giphy.gif";
    public String familia = "https://media.giphy.com/media/3o6Zt3FjwPm9LZhKYo/giphy.gif";
    public String[] listadoGiff = {"Hombre","Mujer","Papá","Mamá","Abuelo","Abuela","Tio","Tia","Hermano"," Hermana"," Hijo","Hija","Esposo","Esposa","Novia","Bebé","Niño","Familia"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);
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

                    Toast.makeText(contexto, "Miembro encontrado", Toast.LENGTH_SHORT).show();
                    String finality = String.format(acumulador).toString();
                    Toast.makeText(contexto, finality,Toast.LENGTH_SHORT).show();
                    switch (acumulador)
                    {
                        case "Familia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(familia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hombre":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(hombre).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mujer":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(mujer).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Papá":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(papa).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mamá":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(mama).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Abuelo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(abuelo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Abuela":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(abuela).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tio":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(tio).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(tia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hermano":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(hermano).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hermana":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(hermana ).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hijo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(hijo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hija":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(hija).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Esposo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(esposo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Esposa":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(esposa).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Novia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(novia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Bebé":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(bebe).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Niño":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(niño).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.mdos).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca a un miembro de la familia", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mdos).into(mostrarImagen);
        }

    }

}

