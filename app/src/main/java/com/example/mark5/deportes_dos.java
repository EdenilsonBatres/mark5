package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Locale;

public class deportes_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = deportes_dos.this;

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

    public String[] listadoGiff = {"Pescar","Bailar","Billar","Arco","Yoga","Ping pong","Nadar","Carreras de autos","Karate","fútbol","Baloncesto"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes_dos);
        mEntradaDeVoz = findViewById(R.id.textView2);
        mBotonHablar = findViewById(R.id.mBotonHablar);
        mBotonHablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarEntradaVoz();
            }
        });
    }

    private void iniciarEntradaVoz()
    {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hola, Dime lo que quieres traducir");
        try
        {
            startActivityForResult(intent, REC_CODE_SPEEDSH_INPUT);
        }
        catch (ActivityNotFoundException e)
        {

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        switch (requestCode){
            case REC_CODE_SPEEDSH_INPUT:
            {
                if (resultCode == RESULT_OK && null != data)
                {
                    ArrayList<String> result= data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mEntradaDeVoz.setText(result.get(0));
                    String finality ;
                    finality = String.format(mEntradaDeVoz.getText().toString());
                    // Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                    //String finalityMinuscula = finality.toLowerCase();

                    for (int i = 0; i < listadoGiff.length; i++)
                    {
                        acumulador = listadoGiff[i];
                        if (acumulador.equalsIgnoreCase(finality))
                        {
                            Toast.makeText(contexto, "Palabra escuchada", Toast.LENGTH_SHORT).show();
                            switch (acumulador)
                            {
                                case "Pesacar":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pesacar).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Bailar":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Bailar).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Billar":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Billar).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Arco":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Arco).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Yoga":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Yoga).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Ping pong":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Ping_pong).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Nadar":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Nadar).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Carreras de autos":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Carreras_de_autos).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Karate":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Karate).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "fútbol":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Futbol).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Baloncesto":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Baloncesto).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;

                            }
                            break;

                        }

                    }
                    if (!acumulador.equalsIgnoreCase(finality))
                    {
                        Toast.makeText(contexto,"palabra no encontrada",Toast.LENGTH_SHORT).show();
                        mostrarImagen = (ImageView) findViewById(R.id.imageView);
                        Glide.with(contexto).load(R.mipmap.monce).into(mostrarImagen);
                    }

                }
                break;
            }
        }
    }
    public void ir_menuVosGestos(View view)
    {
        Intent intent = new Intent(this, voz_gestos.class);
        startActivity(intent);
    }

    public void irMenuPrincipal(View view)
    {
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
    }
}
