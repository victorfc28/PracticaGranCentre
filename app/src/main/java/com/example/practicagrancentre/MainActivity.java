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

        ImageView transport = findViewById(R.id.transport);
        ImageView restaurant = findViewById(R.id.restaurant);
        ImageView hotel = findViewById(R.id.hotel);
        ImageView event = findViewById(R.id.event);

        transport.setOnClickListener(this);
        restaurant.setOnClickListener(this);
        hotel.setOnClickListener(this);
        event.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView) v;
        Intent intent;
        switch (img.getId()) {

            case R.id.transport:
                intent = new Intent(this, Transport.class);
                startActivity(intent);
                break;

            case R.id.restaurant:
                intent = new Intent(this, Restaurant.class);
                startActivity(intent);
                break;

            case R.id.hotel:
                intent = new Intent(this, Hotel.class);
                startActivity(intent);
                break;

            case R.id.event:
                intent = new Intent(this, Event.class);
                startActivity(intent);
                break;
        }
    }
}