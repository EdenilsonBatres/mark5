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

public class expresionComun extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = expresionComun.this;

    public String Me_gusta  ="https://media.giphy.com/media/26FLetDV4MHaixWHm/giphy.gif";
    public String No_me_gusta ="https://media.giphy.com/media/l4Jzdp8TJ2DDxeVna/giphy.gif";
    public String Como_estas  ="https://media.giphy.com/media/26FLgm33ve3iUexZC/giphy.gif";
    public String Quiero  ="https://media.giphy.com/media/26FKXlsvBJoMuyE0g/giphy.gif";
    public String Que_estas_haciendo ="https://media.giphy.com/media/l4Jz3qhJJyN08hFtu/giphy.gif";
    public String No_lo_se  ="https://media.giphy.com/media/26FLfRk8VOFZOem9G/giphy.gif";
    public String Lo_se  ="https://media.giphy.com/media/l4JzhcsNiEKmhekhO/giphy.gif";
    public String No_entiendo ="https://media.giphy.com/media/26FL0X4d3Epuecpj2/giphy.gif";
    public String Entiendo  ="https://media.giphy.com/media/l4Jz6lkydXsNEfuWk/giphy.gif";
    public String Por_favor_repitelo ="https://media.giphy.com/media/l4JyS41E9OFXw7ixi/giphy.gif";
    public String Tal_vez ="https://media.giphy.com/media/l4Jzdw22eZ8QEKCKQ/giphy.gif";
    public String Estoy_bien ="https://media.giphy.com/media/l4Jzd71ci3msO66ac/giphy.gif";
    public String No ="https://media.giphy.com/media/l4Jz4faxuS1FiSEV2/giphy.gif";
    public String Te_ayudare ="https://media.giphy.com/media/26FKWxLSlHTGeIdlS/giphy.gif";
    public String Buenos_dias ="https://media.giphy.com/media/26FLchGgqamznV64E/giphy.gif";
    public String Buenas_tardes ="https://media.giphy.com/media/l4JzaRsX52k8glIFa/giphy.gif";
    public String Buenas_noches ="https://media.giphy.com/media/l4JzdrbDeU2lMMrde/giphy.gif";
    public String Hola  ="https://media.giphy.com/media/26FLfptF4bbszv9ss/giphy.gif";

    public String[] listadoGiff = {"Me gusta","No me gusta","Como estas","Quiero","Que estas haciendo","No lo se","Lo se","No entiendo","Entiendo","Por favor repitelo",
            "Tal vez","Estoy bien","No","Te ayudare","Buenos dias","Buenas tardes","Buenas noches","Hola"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expresion_comun);
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
                        case "Me gusta":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Me_gusta).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "No me gusta":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(No_me_gusta).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Como estas":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Como_estas).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Quiero":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Quiero).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Que estas haciendo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Que_estas_haciendo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "No lo se":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(No_lo_se).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Lo se":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Lo_se).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "No entiendo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(No_entiendo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Entiendo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Entiendo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Por favor repitelo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Por_favor_repitelo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Tal vez":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Tal_vez).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Estoy bien":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Estoy_bien).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "No":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(No).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Te ayudare":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Te_ayudare).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Buenos dias":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Buenos_dias).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Buenas tardes":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Buenas_tardes).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Buenas noches":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Buenas_noches).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                        case "Hola":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Hola).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                    }
                    break;

                }


            }
            if (!acumulador.equals(textoProcesado))
            {
                Toast.makeText(contexto, "palabra NO encontrada", Toast.LENGTH_SHORT).show();
                mostrarImagen = (ImageView)findViewById(R.id.imageView);
                Glide.with(contexto).load(R.mipmap.mnueve).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Escribe una expresion", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mnueve).into(mostrarImagen);
        }

    }
}
