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

public class Restaurant extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ImageView retroceder = findViewById(R.id.retroceder);
        retroceder.setOnClickListener(this);



        /////////////////////////////spinner////////////////////
        /*
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"uno","dos","tres","cuatro","cinco","seis", "siete", "ocho"};
        spinner.setAdapter(new ArrayAdapter<CharSequence>(this, android.R.layout.activity_list_item, valores));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }});*/

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