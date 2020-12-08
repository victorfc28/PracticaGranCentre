package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class Hotel extends AppCompatActivity {

    ImageButton index;

    private ListView lv;
    private String hotels[][] = {
            {"https://hotelh.es/", "+34666111111", "hotels_hotelh", "Hotel H", "4", "40.50€", "El Hotel H se encuentra junto a la autopista E15, a las afueras de Granollers y a 20 minutos en coche del centro de Barcelona.", "Carretera del Masnou km 14, 08400 Granollers, España"},
            {"https://www.hotelgranollers.com/", "+34666222222", "hotels_granollers", "Hotel Granollers", "1", "39.59€", "Este hotel elegante está en el centro de Granollers, a 30 minutos de Barcelona, y dispone de sauna, gimnasio, solárium, bar de cócteles y restaurante selecto. La conexión WiFi es gratuita.", "Avenida Francesc Macià, 300, 08401 Granollers, España"},
            {"https://www.aparthotelateneavalles.com/", "+34666333333", "hotels_atenea", "Aparthotel Atenea Vallès", "2", "45.99€", "El Aparthotel Atenea Vallés está situado en el centro de Granollers, a 300 metros de la estación de trenes de Granollers Centro. Cuenta con gimnasio, spa y conexión Wi-Fi gratuita.", "Aragón, 49, 08400 Granollers, España"},
            {"https://hotelfondaeuropa.com/", "+34666444444", "hotels_fonda_europa", "Fonda Europa", "3", "59.65€", "El Casa Fonda Europa lleva abierto más de 300 años y está situado en el centro histórico de Granollers.", "Anselm Clave, 1, 08402 Granollers, España"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        index = (ImageButton) findViewById(R.id.index);

        index.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Hotel.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        );

        lv = (ListView) findViewById(R.id.lvhotel);

        HotelAdapter myAdapter = new HotelAdapter(this, R.layout.list_item_hotels, hotels);
        lv.setAdapter(myAdapter);
    }


}