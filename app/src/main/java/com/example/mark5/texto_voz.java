package com.example.mark5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class texto_voz extends AppCompatActivity
{
    private Button hablarAhora ;
    private EditText editText;
    TTSManager ttsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_voz);
        ttsManager = new TTSManager();
        ttsManager.init(this);
        editText = findViewById(R.id.editText3);
        hablarAhora = findViewById(R.id.button3);

        hablarAhora.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    public void clickando(View view)
    {
        Intent intent = new Intent(this, menusito.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        ttsManager.shutDown();
    }
}
