package br.com.bossini.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(MainActivity.NOME);
        String ra = intent.getStringExtra(MainActivity.RA);
        String idade = intent.getStringExtra(MainActivity.IDADE);
        String curso = intent.getStringExtra(MainActivity.CURSO);
        String semestre = intent.getStringExtra(MainActivity.SEMESTRE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        String frase = "Olá, " +  nome + ", com RA: " + ra + ". Você tem " + idade + " anos de idade e está cursando o " + semestre + " do curso de " + curso;
        textView.setText(frase);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}