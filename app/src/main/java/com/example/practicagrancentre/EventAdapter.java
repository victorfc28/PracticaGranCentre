package com.example.practicagrancentre;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private String events [][];

    public EventAdapter(Context context, int layout, String events [][]){
        this.context = context;
        this.layout = layout;
        this.events = events;
    }

    @Override
    public int getCount() {
        return this.events.length;
    }

    @Override
    public Object getItem(int position) {
        return this.events[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        // Se infla la vista con el propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        String imagen = events[position][0];
        String url = events[position][1];
        String categoria = events[position][1];
        String evento  = events[position][3];
        String lugar  = events[position][4];
        String horario  = events[position][5];

        // Valor actual según la posición
        v = layoutInflater.inflate(R.layout.list_item_events, null);

        ImageView iv_imagen = (ImageView) v.findViewById(R.id.imagen);

        // Imagen
        int id = this.context.getResources().getIdentifier(imagen, "drawable", context.getPackageName());
        iv_imagen.setImageResource(id);

        // Evento
        TextView tv_evento = (TextView) v.findViewById(R.id.evento);
        tv_evento.setText(evento);

        // Lugar
        TextView tv_lugar = (TextView) v.findViewById(R.id.lugar);
        tv_lugar.setText(lugar);

        // Horario
        TextView tv_horario = (TextView) v.findViewById(R.id.horario);
        tv_horario.setText(horario);

        return v;
    }
}
