package com.technic.transitoquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {

    private Button btnPreferencia, btnPerigo, btnRotatoria, btnAlfandega;
    private int pontuacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btnPreferencia = findViewById(R.id.btnPreferencia);
        btnPerigo = findViewById(R.id.btnPerigo);
        btnRotatoria = findViewById(R.id.btnRotatoria);
        btnAlfandega = findViewById(R.id.btnAlfandega);
    }
    public void botaoPreferencia (View view) {
        pontuacao =1;
        Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
        tela2.putExtra("pontuacao", pontuacao);
        startActivity(tela2);

    }

    public void botaoPerigo (View v2) {
        pontuacao =0;
        Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
        tela2.putExtra("pontuacao", pontuacao);
        startActivity(tela2);

    }

    public void botaoRotatoria (View v3) {
        pontuacao =0;
        Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
        tela2.putExtra("pontuacao", pontuacao);
        startActivity(tela2);

    }

    public void botaoAlfandega (View v4) {
        pontuacao =0;
        Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
        tela2.putExtra("pontuacao", pontuacao);
        startActivity(tela2);

    }
}
