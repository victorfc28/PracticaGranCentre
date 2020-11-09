package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView negocios = findViewById(R.id.negocios);
        ImageView cartelera = findViewById(R.id.cartelera);
        ImageView transporte = findViewById(R.id.transporte);
        ImageView restaurantes = findViewById(R.id.restaurantes);
        ImageView hoteles = findViewById(R.id.hoteles);
        ImageView eventos = findViewById(R.id.eventos);

        negocios.setOnClickListener(this);
        cartelera.setOnClickListener(this);
        transporte.setOnClickListener(this);
        restaurantes.setOnClickListener(this);
        hoteles.setOnClickListener(this);
        eventos.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView) v;
        Intent intent;
        switch (img.getId()) {

            case R.id.negocios:

                break;
            case R.id.cartelera:

                break;
            case R.id.transporte:
                intent = new Intent(this, Transport.class);
                startActivity(intent);
                break;
            case R.id.restaurantes:
                intent = new Intent(this, Restaurante.class);
                startActivity(intent);
                break;
            case R.id.hoteles:

                break;
            case R.id.eventos:

                break;


        }
    }
}