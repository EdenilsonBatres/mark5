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

public class comida_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = comida_dos.this;

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

    public String[] listadoGiff = {"Papas fritas","Helado","Galleta","Pastel","jugó","Leche","té","café","Huevos"
            ,"Limonada","Cerveza","Vino","Pasta","Arroz","Pizza","Pan","Tocino","jamón","Queso","Carne","Hamburguesa","Ensalada"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_dos);
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
                                case "Papas fritas":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Papas_fritas).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Helado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Helado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Galleta":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Galleta).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Pastel":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pastel).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "jugó":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Jugo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Leche":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Leche).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "té":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Te).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "café":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Cafe).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Huevos":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Huevos).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Limonada":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Limonada).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Cerveza":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Cerveza).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                case "Vino":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Vino).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Pasta":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pasta).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Arroz":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Arroz).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Pan":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Pan).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                case "Tocino":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Tocino).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();


                                case "jamón":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Jamon).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();

                                case "Queso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Queso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();

                                case "Carne":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Carne).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();

                                case "Hamburguesa":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Hamburguesa).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();

                                case "Ensalada":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Ensalada).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();

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
                        Glide.with(contexto).load(R.mipmap.mdoce).into(mostrarImagen);
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
