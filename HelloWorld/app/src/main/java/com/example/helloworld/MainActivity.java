package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity", "Hello World");
        Log.i("MSG","Information Log");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView	text	=	findViewById(R.id.helloText);
        final Button button	    =	findViewById(R.id.helloButton);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick (View v){

                text.setText("Hello	World!");
            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onstart","In method OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","In method OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","In method onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","In method onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","In method onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart","In method onRestart");
    }
}