package com.teste.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList(
                "Gabriel","Rodrigo","Matheus","Cesar"));
        TextView primeiroAluno = findViewById(R.id.textView2);
        TextView segundoAluno = findViewById(R.id.textView3);
        TextView terceiroAluno = findViewById(R.id.textView4);
        TextView quartoAluno = findViewById(R.id.textView);

        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
        quartoAluno.setText(alunos.get(3));
    }
}
