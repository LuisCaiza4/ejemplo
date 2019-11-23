package com.example.semana6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
    }
    public void resultado (View v) {

        Intent Encuesta = new Intent(Encuesta.this, Resultado.class);

        startActivity(Encuesta);
        }
    }

