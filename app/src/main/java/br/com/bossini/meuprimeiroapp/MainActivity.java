package br.com.bossini.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String NOME = "br.usjt.meuprimeiroapp.NOME";
    public final static String RA = "br.usjt.meuprimeiroapp.RA";
    public final static String IDADE = "br.usjt.meuprimeiroapp.IDADE";
    public final static String CURSO = "br.usjt.meuprimeiroapp.CURSO";
    public final static String SEMESTRE = "br.usjt.meuprimeiroapp.SEMESTRE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editTextNome = (EditText) findViewById(R.id.nome);
        EditText editTextRa = (EditText) findViewById(R.id.ra);
        EditText editTextIdade = (EditText) findViewById(R.id.idade);
        EditText editTextCurso = (EditText) findViewById(R.id.curso);
        EditText editTextSemestre = (EditText) findViewById(R.id.semestre);
        String nome = editTextNome.getText().toString();
        String ra = editTextRa.getText().toString();
        String idade = editTextIdade.getText().toString();
        String semestre = editTextSemestre.getText().toString();
        String curso = editTextCurso.getText().toString();
        intent.putExtra(NOME, nome);
        intent.putExtra(RA, ra);
        intent.putExtra(IDADE, idade);
        intent.putExtra(SEMESTRE, semestre);
        intent.putExtra(CURSO, curso);
        startActivity(intent);
    }
}