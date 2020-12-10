package com.example.examenframgentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class PrimerFragmento extends Fragment {
    private EditText et_Fragmento1;
    private Button  boton;
    private TextView textView;
    private SeekBar barra1;




    public PrimerFragmento() {
        // Required empty public constructor
    }








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View main = inflater.inflate(R.layout.fragment_primer_fragmento, container, false);
        et_Fragmento1 = (EditText) main.findViewById(R.id.TVFragmento1);
        boton = (Button) main.findViewById(R.id.btnCambiarTexto);
        barra1 = (SeekBar) main.findViewById(R.id.BarraF1) ;



        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) getActivity().findViewById(R.id.TextoF2);
                textView.setText(et_Fragmento1.getText().toString());


            }
        });
        return main;
    }






}