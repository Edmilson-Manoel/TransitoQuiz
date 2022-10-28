package com.technic.transitoquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    private Button btnMina, btnLombada, btnDrepressao, btnIrregular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        btnMina = findViewById(R.id.btnMina);
        btnLombada = findViewById(R.id.btnLombada);
        btnDrepressao = findViewById(R.id.btnDepressao);
        btnIrregular = findViewById(R.id.btnIrregular);

    }
    public void botaoMina(View B1) {

        Intent tela4 = new Intent(getApplicationContext(), Tela4.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela4.putExtra("pontuacao", pontuacao);
        startActivity(tela4);
    }

    public void botaoLombada(View B2) {

        Intent tela4 = new Intent(getApplicationContext(), Tela4.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 1;
        tela4.putExtra("pontuacao", pontuacao);
        startActivity(tela4);
    }
    public void botaoDepressao(View B3) {

        Intent tela4 = new Intent(getApplicationContext(), Tela4.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela4.putExtra("pontuacao", pontuacao);
        startActivity(tela4);
    }
    public void botaoIrregular(View B4) {

        Intent tela4 = new Intent(getApplicationContext(), Tela4.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela4.putExtra("pontuacao", pontuacao);
        startActivity(tela4);
    }
}