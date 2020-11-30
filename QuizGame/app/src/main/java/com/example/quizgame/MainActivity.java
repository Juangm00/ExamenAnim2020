package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    Question q1 = new Question("¿Los delfines son mamíferos?", true);

    public void setQ1(Question q1) {
        this.q1 = q1;
        lista.add(q1);
    }

    ArrayList<Question> lista = new ArrayList<Question>();

    Button BotonTrue = findViewById(R.id.BotonTrue);

    private void MostrarPregunta(Question){
        TextView PreguntaView = findViewById(R.id.PreguntaView);
        PreguntaView.setText(String.format(q1.getPregunta());
    }










}