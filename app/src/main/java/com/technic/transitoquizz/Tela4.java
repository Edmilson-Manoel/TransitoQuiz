package com.technic.transitoquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {

    private Button btnEntrada, btnVire, btnPassagem, btnConservese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        btnEntrada = findViewById(R.id.btnEntrada);
        btnVire = findViewById(R.id.btnVire);
        btnPassagem = findViewById(R.id.btnPassagem);
        btnConservese = findViewById(R.id.btnConservese);
    }
    public void botaoEntrada(View C1) {

        Intent tela5 = new Intent(getApplicationContext(), Tela5.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela5.putExtra("pontuacao", pontuacao);
        startActivity(tela5);
    }

    public void botaoVire(View C2) {

        Intent tela5 = new Intent(getApplicationContext(), Tela5.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela5.putExtra("pontuacao", pontuacao);
        startActivity(tela5);
    }
    public void botaoPassagem(View C3) {

        Intent tela5 = new Intent(getApplicationContext(), Tela5.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela5.putExtra("pontuacao", pontuacao);
        startActivity(tela5);
    }
    public void botaoConservese(View C4) {

        Intent tela5 = new Intent(getApplicationContext(), Tela5.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 1;
        tela5.putExtra("pontuacao", pontuacao);
        startActivity(tela5);
    }
}
