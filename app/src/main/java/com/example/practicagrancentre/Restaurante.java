package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Restaurante extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        ImageView retroceder = findViewById(R.id.retroceder);
        retroceder.setOnClickListener(this);



        /////////////////////////////spinner////////////////////



    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView) v;
        Intent intent;

        switch (img.getId()) {

            case R.id.retroceder:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}