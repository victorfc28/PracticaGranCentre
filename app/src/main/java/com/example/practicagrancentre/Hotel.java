package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Hotel extends AppCompatActivity {

    private ListView lv;
    private String hotels[][] = {
            {"hotels_hotelh", "Hotel H", "4", "40.50€", "El Hotel H se encuentra junto a la autopista E15, a las afueras de Granollers y a 20 minutos en coche del centro de Barcelona.", "Carretera del Masnou km 14, 08400 Granollers, España"},
            {"hotels_granollers", "Hotel Granollers", "1", "39.59€", "Este hotel elegante está en el centro de Granollers, a 30 minutos de Barcelona, y dispone de sauna, gimnasio, solárium, bar de cócteles y restaurante selecto. La conexión WiFi es gratuita.", "Avenida Francesc Macià, 300, 08401 Granollers, España"},
            {"hotels_atenea", "Aparthotel Atenea Vallès", "2", "45.99€", "El Aparthotel Atenea Vallés está situado en el centro de Granollers, a 300 metros de la estación de trenes de Granollers Centro. Cuenta con gimnasio, spa y conexión Wi-Fi gratuita.", "Aragón, 49, 08400 Granollers, España"},
            {"hotels_fonda_europa", "Fonda Europa", "3", "59.65€", "El Casa Fonda Europa lleva abierto más de 300 años y está situado en el centro histórico de Granollers.", "Anselm Clave, 1, 08402 Granollers, España"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        lv = (ListView) findViewById(R.id.lvhotel);

        HotelAdapter myAdapter = new HotelAdapter(this, R.layout.list_item_hotels, hotels);
        lv.setAdapter(myAdapter);
    }
}