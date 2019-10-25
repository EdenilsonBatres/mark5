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

public class emociones_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = emociones_dos.this;

    public String Aliviado  =  "https://media.giphy.com/media/3o7TKxpBrN3Y6nfuwg/giphy.gif";
    public String Aturdido  =  "https://media.giphy.com/media/3o7TKxPBLnq1sOQQRq/giphy.gif";
    public String Conmovido  =  "https://media.giphy.com/media/3o7TKDVhbjjmvECGkg/giphy.gif";
    public String Arrepentido  =  "https://media.giphy.com/media/3o7TKTqYFJuMOIXK6I/giphy.gif";
    public String Timido  =  "https://media.giphy.com/media/3o7TKDU7dUkGWTA7m0/giphy.gif";
    public String Hermoso =   "https://media.giphy.com/media/3o7TKHLPjJixdNn2Fi/giphy.gif";
    public String Exaltado =   "https://media.giphy.com/media/3o7TKtktk5vx4EAEjC/giphy.gif";
    public String Feliz  =  "https://media.giphy.com/media/3o7TKFpahYpUp4g0N2/giphy.gif";
    public String Esperanzado =   "https://media.giphy.com/media/l0MYNZJ1VuTMRrSF2/giphy.gif";
    public String Inspirado  =  "https://media.giphy.com/media/3o7TKArwYEVSqn6Fuo/giphy.gif";
    public String Orgullozo  =  "https://media.giphy.com/media/3o7TKw7vWi1sWxSdSo/giphy.gif";
    public String Travieso  =  "https://media.giphy.com/media/l0MYJPUbBFbq1skqQ/giphy.gif";
    public String Amoroso =   "https://media.giphy.com/media/26hiuhblBOTf7z5Ic/giphy.gif";
    public String Asustado =   "https://media.giphy.com/media/26hitQpmOdzHCHFuM/giphy.gif";
    public String Intimidado =   "https://media.giphy.com/media/l0MYxIBZ850FW2dAA/giphy.gif";
    public String Nervioso  =  "https://media.giphy.com/media/3o7TKPtsbDsWhrs9zO/giphy.gif";
    public String Peresoso  =  "https://media.giphy.com/media/l0MYtTptyL8h88UHm/giphy.gif";
    public String Indefenso =   "https://media.giphy.com/media/3o7TKLJB9twPjkda2A/giphy.gif";
    public String Malo  =  "https://media.giphy.com/media/l0MYL34CVEqLK27yU/giphy.gif";
    public String Feo  =  "https://media.giphy.com/media/3o7TKwYKFhC7ckPC24/giphy.gif";
    public String Miserable =   "https://media.giphy.com/media/l0MYs9JubayxXOMQE/giphy.gif";
    public String Triste =   "https://media.giphy.com/media/3o7TKVhsMTczdAzMB2/giphy.gif";
    public String Solitario =   "https://media.giphy.com/media/l0MYPLdbQFsgalhdu/giphy.gif";
    public String Odio =   "https://media.giphy.com/media/l0MYPiNw8l2LAPJXW/giphy.gif";
    public String Metiroso =   "https://media.giphy.com/media/l0MYBYf0kLdkwe2BO/giphy.gif";
    public String Agresivo =   "https://media.giphy.com/media/3o7TKHXKObQ1OkIVlC/giphy.gif";

    public String[] listadoGiff = {"Solitario","Odio","Metiroso","Agresivo","Triste","Miserable","Feo","Malo","Indefenso","Peresoso","Nervioso","Intimidado","Asustado",
            "Amoroso","Travieso","Orgullozo","Inspirado","Esperanzado","Feliz","Exaltado","Hermoso","Timido","Arrepentido","Conmovido","Aturdido","Aliviado"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emociones_dos);
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
                                case "Solitario":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Solitario).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Odio":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Odio).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Metiroso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Metiroso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Agresivo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Agresivo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Triste":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Triste).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Miserable":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Miserable).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Feo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Feo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Malo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Malo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Indefenso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Indefenso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Peresoso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Peresoso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Nervioso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Nervioso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Intimidado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Intimidado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Asustado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Asustado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Amoroso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Amoroso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Travieso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Travieso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Orgullozo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Orgullozo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Inspirado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Inspirado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Esperanzado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Esperanzado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Feliz":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Feliz).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Exaltado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Exaltado).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Hermoso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Hermoso).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Timido":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Timido).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Arrepentido":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Arrepentido).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Conmovido":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Conmovido).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Aturdido":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Aturdido).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Aliviado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(Aliviado).into(mostrarImagen);
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
                        Glide.with(contexto).load(R.mipmap.mcinco).into(mostrarImagen);
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
