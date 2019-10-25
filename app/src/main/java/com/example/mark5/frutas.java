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

public class frutas extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = frutas.this;

    public String Cereza ="https://media.giphy.com/media/3o6ZtrgHzsDDRzBwVa/giphy.gif";
    public String Aguacate =" https://media.giphy.com/media/3o6ZtdKipT2w87B1vO/giphy.gif";
    public String Piña  ="https://media.giphy.com/media/l0HlMmcFLJRp96yac/giphy.gif";
    public String Sandia =" https://media.giphy.com/media/3o6Ztgfi49Gjisu5LW/giphy.gif";
    public String Limon ="https://media.giphy.com/media/l0HlHBKelRu308Owo/giphy.gif";
    public String Fresa ="https://media.giphy.com/media/3o6Zt4egdCBSvXRra0/giphy.gif";
    public String Pera ="https://media.giphy.com/media/3o6ZsY2HqqL8vVhxEA/giphy.gif";
    public String Naranja=" https://media.giphy.com/media/l0HlA4qMTtcEsVeOQ/giphy.gif";
    public String Banano =" https://media.giphy.com/media/3o6Zt6tOaFxXVjTxg4/giphy.gif";
    public String Coco ="https://media.giphy.com/media/l0HlCCWKLpsElDn4k/giphy.gif";
    public String Manzana=" https://media.giphy.com/media/l0HlHb4dtZZiMYEA8/giphy.gif";
    public String Lima  ="https://media.giphy.com/media/l0HlD1fIOP61yzpzW/giphy.gif";
    public String Mango =" https://media.giphy.com/media/3o6ZsW9G0KwiVKomOc/giphy.gif";

    public String[] listadoGiff = {"Cereza","Aguacate","Piña", "Sandia","Limon","Fresa","Pera","Naranja","Banano","Coco","Manzana","Lima","Mango"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
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
                        case "Cereza":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Cereza).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Aguacate":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Aguacate).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Piña":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Piña).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Sandia":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Sandia).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Limon":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Limon).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Fresa":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Fresa).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Pera":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Pera).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Naranja":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Naranja).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Banano":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Banano).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Coco":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Coco).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Manzana":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Manzana).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Lima":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Lima).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Mango":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Mango).into(mostrarImagen);
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
                Glide.with(contexto).load(R.mipmap.mtres).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca una fruta", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mtres).into(mostrarImagen);
        }

    }
}
