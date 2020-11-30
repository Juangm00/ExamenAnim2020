package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }
        //lo que pasa al pulsar el botón TOAST
        public void showToast(View view) {
            Context context = getApplicationContext();
            //creamos el toast
            Toast toast = Toast.makeText(context, R.string.toast_mensaje, Toast.LENGTH_SHORT);
            //enseñamos el toast por pantalla
            toast.show();
        }

        //Método para sumar al contador
        public void Suma(View view) {
            int mSuma = 0;
            TextView mContador = (TextView) findViewById(R.id.Contador);
            mSuma++;
            if (mContador != null)
                mContador.setText(Integer.toString(mSuma));
        }
}