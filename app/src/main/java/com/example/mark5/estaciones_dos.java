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

public class estaciones_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = estaciones_dos.this;

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
        setContentView(R.layout.activity_estaciones_dos);
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
                                case "Verano":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Verano).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Primavera":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Primavera).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Invierno":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Frio).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Humedo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Humedo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Caluroso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Caluroso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Soleado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Soleado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Nublado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Nublado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Viento":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Viento).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Lluvioso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Lluvioso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                default:
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(R.drawable.tenor).into(mostrarImagen);
                                    break;

                            }
                            break;

                        }

                    }
                    if (!acumulador.equalsIgnoreCase(finality))
                    {
                        Toast.makeText(contexto,"palabra no encontrada",Toast.LENGTH_SHORT).show();
                        mostrarImagen = (ImageView) findViewById(R.id.imageView);
                        Glide.with(contexto).load(R.mipmap.mcuatro).into(mostrarImagen);
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
