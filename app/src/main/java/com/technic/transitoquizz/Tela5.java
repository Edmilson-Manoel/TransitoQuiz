package com.technic.transitoquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Tela5 extends AppCompatActivity {

    private EditText edtPontos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        edtPontos= findViewById(R.id.edtPontos);
        int pontuacao = getIntent().getIntExtra("pontuacao", 0);
        edtPontos.setText(String.valueOf(pontuacao));
    }
}