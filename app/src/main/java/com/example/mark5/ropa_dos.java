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

public class ropa_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = ropa_dos.this;

    public String Chaketa ="https://media.giphy.com/media/3o7TKAsfxrZ77u8bEA/giphy.gif";
    public String Camisa  ="https://media.giphy.com/media/3o7TKrBjJbwIHVEpfa/giphy.gif";
    public String  Sueter  ="https://media.giphy.com/media/3o7TKHKANxLwelLitq/giphy.gif";
    public String Vestido ="https://media.giphy.com/media/l0MYt4q78Jz7r4zmM/giphy.gif";
    public String Short  ="https://media.giphy.com/media/3o7TKScPS2UNoGctcA/giphy.gif";
    public String Pantalones ="https://media.giphy.com/media/l0MYH30jO8lLRwcWk/giphy.gif";
    public String Sombrero  ="https://media.giphy.com/media/d1JfkaQRIMgqCBB6/giphy.gif";
    public String Gorra  ="https://media.giphy.com/media/3o7TKAaGOhMTtVTYBy/giphy.gif";
    public String Falda ="https://media.giphy.com/media/l0MYB5hgHW3jpGQiQ/giphy.gif";
    public String Camiseta ="https://media.giphy.com/media/3o7TKMggJXrt95qbvO/giphy.gif";
    public String Pijama  ="https://media.giphy.com/media/3o7TKtx8zcbSuipg8U/giphy.gif";
    public String Zapatos ="https://media.giphy.com/media/3o7TKUkzdNMdjOa5y0/giphy.gif";
    public String Calcetines ="https://media.giphy.com/media/3o7TKWApKmiWLpA1sA/giphy.gif";
    public String Corbata  ="https://media.giphy.com/media/l0MYw0630mMK2i9W0/giphy.gif";
    public String Moda  ="https://media.giphy.com/media/l0MYGExx01Wvf0WNG/giphy.gif";

    public String[] listadoGiff = {"Chaketa","Camisa","Sueter","Vestido","Short","Pantalones","Sombrero","Gorra","Falda","Camiseta","Pijama","Zapatos","Calcetines","Corbata","Moda"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ropa_dos);
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
                                case "Chaketa":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Chaketa).into(mostrarImagen);

                                    break;
                                case "Camisa":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Camisa).into(mostrarImagen);

                                    break;
                                case "Sueter":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Sueter).into(mostrarImagen);

                                    break;
                                case "Vestido":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Vestido).into(mostrarImagen);

                                    break;
                                case "Short":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Short).into(mostrarImagen);
                                    break;
                                case "Pantalones":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pantalones).into(mostrarImagen);

                                    break;
                                case "Sombrero":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Sombrero).into(mostrarImagen);

                                    break;
                                case "Gorra":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Gorra).into(mostrarImagen);

                                    break;
                                case "Falda":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Falda).into(mostrarImagen);

                                    break;
                                case "Camiseta":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Camiseta).into(mostrarImagen);

                                    break;
                                case "Pijama":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pijama).into(mostrarImagen);

                                    break;
                                case "Zapatos":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Zapatos).into(mostrarImagen);

                                    break;
                                case "Calcetines":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Calcetines).into(mostrarImagen);

                                    break;
                                case "Corbata":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Corbata).into(mostrarImagen);

                                    break;
                                case "Moda":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Moda).into(mostrarImagen);

                                    break;

                            }
                            break;

                        }

                    }
                    if (!acumulador.equalsIgnoreCase(finality))
                    {
                        Toast.makeText(contexto,"palabra no encontrada",Toast.LENGTH_SHORT).show();
                        mostrarImagen = (ImageView) findViewById(R.id.imageView);
                        Glide.with(contexto).load(R.mipmap.mocho).into(mostrarImagen);
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
