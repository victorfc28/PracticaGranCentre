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

        ImageView business = findViewById(R.id.business);
        ImageView movies = findViewById(R.id.movies);
        ImageView transporte = findViewById(R.id.transporte);
        ImageView restaurantes = findViewById(R.id.restaurantes);
        ImageView hoteles = findViewById(R.id.hoteles);
        ImageView eventos = findViewById(R.id.eventos);

        business.setOnClickListener(this);
        movies.setOnClickListener(this);
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

            case R.id.business:
                intent = new Intent(this, Business.class);
                startActivity(intent);
                break;

            case R.id.movies:
                intent = new Intent(this, Movies.class);
                startActivity(intent);
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