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

public class emociones extends AppCompatActivity
{
    private EditText textoIntroducido;
    private TextView textoMostrar;
    private Context contexto = emociones.this;

    public String Aliviado  =  "https://media.giphy.com/media/3o7TKxpBrN3Y6nfuwg/giphy.gif";
    public String Aturdido  =  "https://media.giphy.com/media/3o7TKxPBLnq1sOQQRq/giphy.gif";
    public String Conmovido  =  "https://media.giphy.com/media/3o7TKDVhbjjmvECGkg/giphy.gif";
    public String Arrepentido  =  "https://media.giphy.com/media/3o7TKTqYFJuMOIXK6I/giphy.gif";
    public String Timido  =  "https://media.giphy.com/media/3o7TKDU7dUkGWTA7m0/giphy.gif";
    public String Hermoso =   "https://media.giphy.com/media/3o7TKHLPjJixdNn2Fi/giphy.gif";
    public String  Exaltado =   "https://media.giphy.com/media/3o7TKtktk5vx4EAEjC/giphy.gif";
    public String Feliz  =  "https://media.giphy.com/media/3o7TKFpahYpUp4g0N2/giphy.gif";
    public String Esperanzado =   "https://media.giphy.com/media/l0MYNZJ1VuTMRrSF2/giphy.gif";
    public String Inspirado  =  "https://media.giphy.com/media/3o7TKArwYEVSqn6Fuo/giphy.gif";
    public String Orgullozo  =  "https://media.giphy.com/media/3o7TKw7vWi1sWxSdSo/giphy.gif";
    public String Travieso  =  "https://media.giphy.com/media/l0MYJPUbBFbq1skqQ/giphy.gif";
    public String Amoroso =   "https://media.giphy.com/media/26hiuhblBOTf7z5Ic/giphy.gif";
    public String Asustado =   "https://media.giphy.com/media/26hitQpmOdzHCHFuM/giphy.gif";
    public String Intimidado =   "https://media.giphy.com/media/l0MYxIBZ850FW2dAA/giphy.gif";
    public String Nervioso  =  "https://media.giphy.com/media/3o7TKPtsbDsWhrs9zO/giphy.gif";
    public String  Peresoso  =  "https://media.giphy.com/media/l0MYtTptyL8h88UHm/giphy.gif";
    public String  Indefenso =   "https://media.giphy.com/media/3o7TKLJB9twPjkda2A/giphy.gif";
    public String  Malo  =  "https://media.giphy.com/media/l0MYL34CVEqLK27yU/giphy.gif";
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
        setContentView(R.layout.activity_emociones);
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
                        case "Solitario":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Solitario).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Odio":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Odio).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Metiroso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Metiroso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Agresivo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Agresivo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Triste":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Triste).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Miserable":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Miserable).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Feo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Feo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Malo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Malo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Indefenso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Indefenso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Peresoso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Peresoso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Nervioso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Nervioso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Intimidado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Intimidado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Asustado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Asustado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Amoroso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Amoroso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Travieso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Travieso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Orgullozo":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Orgullozo).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Inspirado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Inspirado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Esperanzado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Esperanzado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Feliz":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Feliz).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Exaltado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Exaltado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Hermoso":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Hermoso).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Timido":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Timido).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Arrepentido":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Arrepentido).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Conmovido":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Conmovido).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Aturdido":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Aturdido).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        case "Aliviado":
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(Aliviado).into(mostrarImagen);
                            textoMostrar = (TextView)findViewById(R.id.textView);
                            textoMostrar.setText(finality);
                            break;
                        default:
                            mostrarImagen = (ImageView) findViewById(R.id.imageView);
                            Glide.with(contexto).load(R.drawable.tenor).into(mostrarImagen);
                            break;

                    }
                    break;

                }


            }
            if (!acumulador.equalsIgnoreCase(textoProcesado))
            {
                Toast.makeText(contexto, "palabra NO encontrada", Toast.LENGTH_SHORT).show();
                mostrarImagen = (ImageView)findViewById(R.id.imageView);
                Glide.with(contexto).load(R.mipmap.mcinco).into(mostrarImagen);
            }

        }
        else
        {
            Toast.makeText(contexto, "Busca una palabra", Toast.LENGTH_SHORT).show();
            mostrarImagen = (ImageView) findViewById(R.id.imageView);
            Glide.with(contexto).load(R.mipmap.mcinco).into(mostrarImagen);
        }

    }

}
