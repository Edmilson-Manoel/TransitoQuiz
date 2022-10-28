package com.technic.transitoquizz;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {

    private Button btnSentido, btnCruzamento, btnMao, btnSiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnCruzamento = findViewById(R.id.btnCruzamento);
        btnSentido = findViewById(R.id.btnSentido);
        btnMao = findViewById(R.id.btnMao);
        btnSiga = findViewById(R.id.btnSiga);

    }

    public void botaoSentido(View A1) {

        Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela3.putExtra("pontuacao", pontuacao);
        startActivity(tela3);
    }

    public void botaoCruzamentp(View A2) {

        Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela3.putExtra("pontuacao", pontuacao);
        startActivity(tela3);
    }
    public void botaoMao(View A3) {

        Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 1;
        tela3.putExtra("pontuacao", pontuacao);
        startActivity(tela3);
    }
    public void botaoSiga(View A4) {

        Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        pontuacao= pontuacao + 0;
        tela3.putExtra("pontuacao", pontuacao);
        startActivity(tela3);
    }
}