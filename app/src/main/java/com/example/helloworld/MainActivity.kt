package com.example.helloworld

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val text = findViewById(R.id.textView) as TextView
    val button: Button = findViewById(R.id.boton) as Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        final TextView	text	=	(TextView)findViewById(R.id.textView);
        final Button	button	=	(Button)findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view) {
                text.setText("Hello	World!");
            }
        }