package com.example.semana6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ingreso (View v) {

        String usuario = ((EditText)findViewById(R.id.IDUSUARIO)) .getText().toString();
        String Clave  = ((EditText)findViewById(R.id.IDCLAVE)).getText().toString();

        if (usuario.equals("Luis")&&Clave.equals("est.uisrael.2019")){

            Intent Encuesta = new Intent(MainActivity.this, Encuesta.class);

            startActivity(Encuesta);

        }

        else  {
            Toast.makeText(getApplicationContext(),"usuario o clave erronea",Toast.LENGTH_LONG).show();


        }
    }


}
