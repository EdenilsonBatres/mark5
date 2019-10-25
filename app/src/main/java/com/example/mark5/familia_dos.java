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

public class familia_dos extends AppCompatActivity
{
    private static final int REC_CODE_SPEEDSH_INPUT = 100;
    private TextView mEntradaDeVoz ;
    private ImageButton mBotonHablar ;
    private Context contexto = familia_dos.this;

    public String niño ="https://media.giphy.com/media/3o6ZsWZAdmDY4M5W12/giphy.gif";
    public String bebe ="https://media.giphy.com/media/l0HlCuPLK3fVM7urm/giphy.gif";
    public String novia ="https://media.giphy.com/media/l0HlU4CSxhIWzKLdu/giphy.gif";
    public String esposa  ="https://media.giphy.com/media/l0HlV8Jg6Nzx3jp7O/giphy.gif";
    public String esposo ="https://media.giphy.com/media/3o6Zt4DOlGWgEIt8RO/giphy.gif";
    public String hija ="https://media.giphy.com/media/l0HlLz18wGrft14u4/giphy.gif";
    public String hijo = "https://media.giphy.com/media/3o6ZsSYHb0Agx4AIhO/giphy.gif";
    public String hermana ="https://media.giphy.com/media/3o6Ztqnz8kLL7LbRlu/giphy.gif";
    public String hermano ="https://media.giphy.com/media/3o6ZtfHBNoUuaVW4gg/giphy.gif";
    public String tia  ="https://media.giphy.com/media/3o6Ztdukuyn481ZQLC/giphy.gif";
    public String tio  ="https://media.giphy.com/media/3o6ZsVUxWfcT162CyY/giphy.gif";
    public String abuela ="https://media.giphy.com/media/l0HlOTde1r9OHFkfC/giphy.gif";
    public String abuelo ="https://media.giphy.com/media/3o6ZsU83yCtYlFsFIA/giphy.gif";
    public String mama  ="https://media.giphy.com/media/l0HlIhfKLBQ4QgRig/giphy.gif";
    public String papa  ="https://media.giphy.com/media/l0HlNzPBWFE3c2Hao/giphy.gif";
    public String mujer  ="https://media.giphy.com/media/3o6ZtcFC8MooG0b0aI/giphy.gif";
    public String hombre ="https://media.giphy.com/media/3o6Zt4YmcmfrNJBbt6/giphy.gif";
    public String familia = "https://media.giphy.com/media/3o6Zt3FjwPm9LZhKYo/giphy.gif";
    public String[] listadoGiff = {"Hombre","Mujer","papá","mamá","Abuelo","Abuela","tío","tía","Hermano"," Hermana"," Hijo","Hija","Esposo","Esposa","Novia","bebé","Niño","Familia"};
    public String textoProcesado;
    public String acumulador;
    private ImageView mostrarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_dos);
        mEntradaDeVoz = findViewById(R.id.textView);
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
                   //

                    for (int i = 0; i < listadoGiff.length; i++)
                    {
                        acumulador = listadoGiff[i];
                        if (acumulador.equalsIgnoreCase(finality))
                        {
                            Toast.makeText(contexto, "Palabra escuchada", Toast.LENGTH_SHORT).show();
                            switch (acumulador)
                            {
                                case "Familia":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(familia).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Hombre":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(hombre).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Mujer":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(mujer).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "papá":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(papa).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "mamá":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(mama).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Abuelo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(abuelo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Abuela":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(abuela).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Tio":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(tio).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Tia":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(tia).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Hermano":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(hermano).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Hermana":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(hermana ).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case " Hijo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(hijo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Hija":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(hija).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Esposo":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(esposo).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Esposa":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(esposa).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Novia":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(novia).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Bebe":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(bebe).into(mostrarImagen);
                                    Toast.makeText(contexto, "Palabra Encontrada", Toast.LENGTH_SHORT).show();
                                    break;
                                case "Niño":
                                    mostrarImagen = (ImageView) findViewById(R.id.imageView);
                                    Glide.with(contexto).load(niño).into(mostrarImagen);
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
                        Glide.with(contexto).load(R.mipmap.mdos).into(mostrarImagen);
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
