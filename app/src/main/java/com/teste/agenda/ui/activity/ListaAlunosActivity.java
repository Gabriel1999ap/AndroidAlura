package com.teste.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teste.agenda.R;
import com.teste.agenda.dao.AlunoDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);




        setTitle("Lista de Alunos");

        FloatingActionButton botaoNovoAluno = findViewById(R.id.activity_main_fab_novo_aluno);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaAlunosActivity.this,
                        FormularioAlunoActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {

        AlunoDAO dao = new AlunoDAO();

        super.onResume();
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,R.layout.activity_lista_alunos,dao.todos()
        ));
    }
}
