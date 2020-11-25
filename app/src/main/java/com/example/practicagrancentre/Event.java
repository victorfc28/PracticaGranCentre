package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Event extends AppCompatActivity {

    private ListView lv;
    private String events[][] = {
            {"events_ciutat_bombardejada", "https://www.granollers.cat/agenda/sala-de-premsa/itinerari-de-ciutat-granollers-ciutat-bombardejada", "Ciutat", "ANUL·LAT Itinerari de ciutat: Granollers, ciutat bombardejada", "Museu de Granollers", "15 nov. 2020 - 11:00h"},
            {"events_las_muertes_chiquitas", "https://www.granollers.cat/agenda/cultura/exposici%C3%B3-%C2%ABlas-muertes-chiquitas%C2%BB-de-mireia-sallar%C3%A9s-16", "Art", "Exposició: «Las muertes chiquitas» de Mireia Sallarés", "Espai d'Arts", "15 nov. 2020 - 11:00h"},
            {"events_tu_investigues", "https://www.granollers.cat/agenda/cultura/visita-guiada-lexposici%C3%B3-tu-investigues-13", "Ciències Naturals", "ANUL·LAT Visita guiada a l'exposició \"Tu investigues!\"", "Museu de Granollers - Ciències Naturals", "15 nov. 2020 - 11:00h"},
            {"events_que_mengem_avui", "https://www.granollers.cat/agenda/cultura/visita-guiada-lexposici%C3%B3-qu%C3%A8-mengem-avui-9", "Alimentació", "ANUL·LAT Visita guiada a l'exposició \"Què mengem avui?\"", "Museu de Granollers - Ciències Naturals", "15 nov. 2020 - 11:15h"},
            {"events_silver_drops", "https://www.granollers.cat/agenda/cultura/dansa-silver-drops", "Art", "ANUL·LAT Dansa \"Silver Drops\"", "Teatre Auditori de Granollers", "15 nov. 2020 - 18:00h"},
            {"events_microteatre", "https://www.granollers.cat/agenda/cultura/microteatre-5", "Teatre", "POSPOSAT Teatre \"Microteatre\" (3a funció)", "Roca Umbert. Fàbrica de les Arts", "15 nov. 2020 - 18:00h"},
            {"events_cultura_maker", "https://www.granollers.cat/agenda/cultura/cultura-maker", "Formació", "Cultura maker", "Roca Umbert. Fàbrica de les Arts", "16 nov. 2020 - 15:00h"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        lv = (ListView) findViewById(R.id.lv);

        EventAdapter myAdapter = new EventAdapter(this, R.layout.list_item_events, events);
        lv.setAdapter(myAdapter);
    }
}