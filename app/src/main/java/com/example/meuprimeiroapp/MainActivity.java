package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("AppDoAlex", "Seja Bem-Vindo");
        Button botao = findViewById(R.id.meuBotao);
        TextView texto = findViewById(R.id.meuTexto);


        //texto.setText("App do Alex Engel");


        botao.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                if (x == 1) {
                    botao.setBackgroundColor(Color.parseColor("#00ff00"));
                    texto.setText("Clicou!");
                    x = 0;
                } else {
                    botao.setBackgroundColor(Color.parseColor("#FF000000"));
                    texto.setText("Clicou2");
                    x = 1;
                }
            }


        });
    }


}

