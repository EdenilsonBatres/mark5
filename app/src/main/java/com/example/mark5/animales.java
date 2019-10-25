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

public class animales extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = animales.this;
    public String araña ="https://media.giphy.com/media/l0HlAg0JM91OyJK8w/giphy.gif";
    public String mosca  ="https://media.giphy.com/media/3o6ZtmfPknXwGsRWUM/giphy.gif";
    public String oso ="https://media.giphy.com/media/l0HlMEDoIaALWCKbe/giphy.gif";
    public String buo  ="https://media.giphy.com/media/l0HlHbz0FSpGVkJXi/giphy.gif";
    public String insecto ="https://media.giphy.com/media/3o6ZtqnbzvERZX3Vkc/giphy.gif";
    public String gallina="https://media.giphy.com/media/3o6ZsZ6BwLxy0wvtv2/giphy.gif";
    public String  pollo ="https://media.giphy.com/media/3o6ZsUk1QPekg7BKNy/giphy.gif";
    public String pato = "https://media.giphy.com/media/26gJAuQPIXUPECqFW/giphy.gif";
    public String cerdo ="https://media.giphy.com/media/3o6ZsU5Hsa3xmnfDa0/giphy.gif";
    public String ganso ="https://media.giphy.com/media/l0HlK68p7v5czto8E/giphy.gif";
    public String vaca  ="https://media.giphy.com/media/d1FKRi6bNTt5l2YE/giphy.gif";
    public String toro  ="https://media.giphy.com/media/3o6Zt54Ojqo6MRsuLS/giphy.gif";
    public String buey ="https://media.giphy.com/media/3o6Zt7T5hpR9f3jrS8/giphy.gif";
    public String caballo ="https://media.giphy.com/media/l0HlM5HffraiQaHUk/giphy.gif";
    public String cabra  ="https://media.giphy.com/media/l0HlBRwnyPrrCTJQI/giphy.gif";
    public String perro  ="https://media.giphy.com/media/l0HlBGjKUV8KJxDoc/giphy.gif";
    public String gato  ="https://media.giphy.com/media/l0HlNRE6HWecN7tzW/giphy.gif";
    public String pescado ="https://media.giphy.com/media/l0HlyD0aUlEMEqaQg/giphy.gif";
    public String pajaro  ="https://media.giphy.com/media/3o6Zt8dU5n0SPNFeAE/giphy.gif";
    public String conejo ="https://media.giphy.com/media/3o6ZsUwmai7jgqgh9K/giphy.gif";
    public String perico  ="https://media.giphy.com/media/l0HlSoFBnnqrVeo7K/giphy.gif";
    public String elefante ="https://media.giphy.com/media/26gJzLY13fo24rp3W/giphy.gif";
    public String leon  ="https://media.giphy.com/media/3o6Zt0dvGeYPMzu73G/giphy.gif";
    public String tigre  ="https://media.giphy.com/media/l0HlwogU35Lxf97tm/giphy.gif";
    public String jirafa ="https://media.giphy.com/media/3o6ZsWz3YsIUTPhqZa/giphy.gif";
    public String zebra  ="https://media.giphy.com/media/l0HlUYg8AG0osMv9m/giphy.gif";
    public String gorila ="https://media.giphy.com/media/l0HlFFKUavkWXni6c/giphy.gif";
    public String cocodrilo ="https://media.giphy.com/media/l0HlCNQyb7Gy1NFS0/giphy.gif";
    public String flamenco ="https://media.giphy.com/media/l0HlOvu12taI172rm/giphy.gif";
    public String tiburon  ="https://media.giphy.com/media/26gJApLBuoQf2Yj5u/giphy.gif";
    public String pulpo  ="https://media.giphy.com/media/3o6ZsVLGHKwPWpuhzy/giphy.gif";
    public String tortuga ="https://media.giphy.com/media/3o6ZtiSXuiIZB1aD8k/giphy.gif";
    public String pinguino ="https://media.giphy.com/media/l0HlTb8iaeVAdjPy0/giphy.gif";
    public String lobo  ="https://media.giphy.com/media/3o6ZsTMwAZzO22YDPa/giphy.gif";
    public String rana  ="https://media.giphy.com/media/l0HlKl64lIvTjZ7QA/giphy.gif";
    public String mosquito ="https://media.giphy.com/media/3o6ZsXp6rkyli4qYUg/giphy.gif";
    public String mono ="https://media.giphy.com/media/3o6ZtoejOuT1f7hWlW/giphy.gif";

    public String[] listadoGiff = {"Araña","Mosca","Oso","búho","insecto","Gallina","Pollo","Pato","Cerdo","Ganso","Vaca","Toro","Buey","Caballo",
    "Cabra","Perro","Gato","Pescado","pájaro","Conejo","Perico","Elefante","León","Tigre","Jirafa","Zebra","Gorila","Cocodrilo","Flamenco","tiburón","Pulpo",
    "Tortuga","pingüino","Lobo","Rana","Mosquito","Mono"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
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

                    Toast.makeText(contexto, "Animal encontrado", Toast.LENGTH_SHORT).show();
                    String finality = String.format(acumulador).toString();
                    Toast.makeText(contexto, finality,Toast.LENGTH_SHORT).show();
                    switch (acumulador)
                    {
                        case "Araña":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(araña).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mosca":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(mosca).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Oso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(oso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "búho":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(buo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Insecto":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(insecto).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Gallina":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(gallina).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pollo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pollo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pato":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pato).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Cerdo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(cerdo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Ganso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(ganso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Vaca":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(vaca).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Toro":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(toro).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Buey":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(buey).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Caballo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(caballo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Cabra":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(cabra).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Perro":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(perro).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Gato":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(gato).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pescado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pescado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "pájaro":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pajaro).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Perico":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(perico).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Conejo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(conejo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Elefante":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(elefante).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "León":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(leon).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tigre":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(tigre).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Jirafa":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(jirafa).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Zebra":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(zebra).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Gorila":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(gorila).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Cocdrilo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(cocodrilo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Flamenco":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(flamenco).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "tiburón":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(tiburon).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pulpo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pulpo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tortuga":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(tortuga).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "pingüino":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(pinguino).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Lobo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(lobo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Rana":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(rana).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mosquito":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(mosquito).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mono":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(mono).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.muno).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca a un animal", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.muno).into(mostrarImagen);
        }

    }
}
