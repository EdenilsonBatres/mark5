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

public class animales_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = animales_dos.this;

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

    public String[] listadoGiff = {"Araña","mosca","oso","búho","insecto","gallina","pollo","pato","cerdo","ganso","vaca","toro","buey","caballo",
            "cabra","perro","gato","pescado","pájaro","conejo","perico","elefante","León","tigre","jirafa","cebra","gorila","cocodrilo","Flamenco","tiburón","pulpo",
            "tortuga","pingüino","lobo","rana","mosquito","mono"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_dos);
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

                    //String finalityMinuscula = finality.toLowerCase();

                    for (int i = 0; i < listadoGiff.length; i++)
                    {
                        acumulador = listadoGiff[i];
                        if (acumulador.equals(finality))
                        {

                            Toast.makeText(contexto, "Palabra escuchada", Toast.LENGTH_SHORT).show();
                            //                   String finality = String.format(acumulador).toString();
                            //                   Toast.makeText(contexto, finality,Toast.LENGTH_SHORT).show();
                            switch (acumulador)
                            {
                                case "Araña":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(araña).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                  //                  textoMostrar = (TextView)findViewById(R.id.textView);
                 //                   textoMostrar.setText(finality);
                                    break;
                                case "mosca":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(mosca).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                  //                  textoMostrar = (TextView)findViewById(R.id.textView);
                  //                  textoMostrar.setText(finality);
                                    break;
                                case "oso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(oso).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                  //                  textoMostrar = (TextView)findViewById(R.id.textView);
                  //                  textoMostrar.setText(finality);
                                    break;
                                case "búho":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(buo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                   //                 textoMostrar = (TextView)findViewById(R.id.textView);
                  //                  textoMostrar.setText(finality);
                                    break;
                                case "insecto":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(insecto).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                  //                  textoMostrar = (TextView)findViewById(R.id.textView);
                   //                 textoMostrar.setText(finality);
                                    break;
                                case "gallina":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(gallina).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                   //                 textoMostrar = (TextView)findViewById(R.id.textView);
                   //                 textoMostrar.setText(finality);
                                    break;
                                case "pollo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pollo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                   //                 textoMostrar = (TextView)findViewById(R.id.textView);
                   //                 textoMostrar.setText(finality);
                                    break;
                                case "pato":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pato).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                    //                textoMostrar = (TextView)findViewById(R.id.textView);
                    //                textoMostrar.setText(finality);
                                    break;
                                case "cerdo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(cerdo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                     //               textoMostrar.setText(finality);
                                    break;
                                case "ganso":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(ganso).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                     //               textoMostrar.setText(finality);
                                    break;
                                case "vaca":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(vaca).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "toro":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(toro).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "buey":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(buey).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "caballo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(caballo).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "cabra":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(cabra).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "perro":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(perro).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "gato":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(gato).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "pescado":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pescado).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                       //             textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "pájaro":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pajaro).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "perico":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(perico).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "conejo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(conejo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "elefante":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(elefante).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                     //               textoMostrar.setText(finality);
                                    break;
                                case "León":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(leon).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "tigre":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(tigre).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                       //             textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "jirafa":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(jirafa).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                       //             textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "cebra":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(zebra).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "gorila":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(gorila).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "cocdrilo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(cocodrilo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "Flamenco":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(flamenco).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "tiburón":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(tiburon).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "pulpo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pulpo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                    //                textoMostrar = (TextView)findViewById(R.id.textView);
                     //               textoMostrar.setText(finality);
                                    break;
                                case "tortuga":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(tortuga).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "pingüino":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(pinguino).into(mostrarImagen);
                                    Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "lobo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(lobo).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                       //             textoMostrar.setText(finality);
                                    break;
                                case "rana":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(rana).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                      //              textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "mosquito":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(mosquito).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                case "mono":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(mono).into(mostrarImagen);
                                     Toast.makeText(this, finality,Toast.LENGTH_SHORT).show();
                     //               textoMostrar = (TextView)findViewById(R.id.textView);
                      //              textoMostrar.setText(finality);
                                    break;
                                default:
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(R.drawable.tenor).into(mostrarImagen);
                                    break;

                            }
                            break;
                        }


                    }
                    if (!acumulador.equals(finality))
                    {
                        Toast.makeText(contexto,"animal no encontrado",Toast.LENGTH_SHORT).show();
                        mostrarImagen = (ImageView) findViewById(R.id.imageView);
                        Glide.with(contexto).load(R.mipmap.muno).into(mostrarImagen);
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
