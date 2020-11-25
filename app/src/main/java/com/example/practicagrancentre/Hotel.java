package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Hotel extends AppCompatActivity {

    private ListView lv;
    private String events[][] = {
            {"ciutat_bombardejada", "https://www.granollers.cat/agenda/sala-de-premsa/itinerari-de-ciutat-granollers-ciutat-bombardejada", "Ciutat", "15 nov. 2020 - 11:00h", "ANUL·LAT Itinerari de ciutat: Granollers, ciutat bombardejada", "Museu de Granollers"},
            {"las_muertes_chiquitas", "https://www.granollers.cat/agenda/cultura/exposici%C3%B3-%C2%ABlas-muertes-chiquitas%C2%BB-de-mireia-sallar%C3%A9s-16", "Art", "15 nov. 2020 - 11:00h", "Exposició: «Las muertes chiquitas» de Mireia Sallarés", "Espai d'Arts"},
            {"tu_investigues", "https://www.granollers.cat/agenda/cultura/visita-guiada-lexposici%C3%B3-tu-investigues-13", "Ciències Naturals", "15 nov. 2020 - 11:00h", "ANUL·LAT Visita guiada a l'exposició \"Tu investigues!\"", "Museu de Granollers - Ciències Naturals"},
            {"que_mengem_avui", "https://www.granollers.cat/agenda/cultura/visita-guiada-lexposici%C3%B3-qu%C3%A8-mengem-avui-9", "Alimentació", "15 nov. 2020 - 11:15h", "ANUL·LAT Visita guiada a l'exposició \"Què mengem avui?\"", "Museu de Granollers - Ciències Naturals"},
            {"silver_drops", "https://www.granollers.cat/agenda/cultura/dansa-silver-drops", "Art", "15 nov. 2020 - 18:00h", "ANUL·LAT Dansa \"Silver Drops\"", "Teatre Auditori de Granollers"},
            {"microteatre", "https://www.granollers.cat/agenda/cultura/microteatre-5", "Teatre", "15 nov. 2020 - 18:00h", "POSPOSAT Teatre \"Microteatre\" (3a funció)", "Roca Umbert. Fàbrica de les Arts"},
            {"cultura_maker", "https://www.granollers.cat/agenda/cultura/cultura-maker", "Formació", "16 nov. 2020 - 15:00h", "Cultura maker", "Cultura maker"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }
}