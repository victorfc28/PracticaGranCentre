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

public class HotelAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private String hotels [][];

    public HotelAdapter(Context context, int layout, String hotels [][]){
        this.context = context;
        this.layout = layout;
        this.hotels = hotels;
    }

    @Override
    public int getCount() {
        return this.hotels.length;
    }

    @Override
    public Object getItem(int position) {
        return this.hotels[position];
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

        String imagen = hotels[position][0];
        String url = hotels[position][1];
        String stars = hotels[position][2];
        String hotel  = hotels[position][3];
        String direccion  = hotels[position][4];

        // Valor actual según la posición
        v = layoutInflater.inflate(R.layout.list_item_hotels, null);

        ImageView iv_imagen = (ImageView) v.findViewById(R.id.imagen);

        // Imagen
        int id = this.context.getResources().getIdentifier(imagen, "drawable", context.getPackageName());
        iv_imagen.setImageResource(id);

        // Horario
        TextView tv_horario = (TextView) v.findViewById(R.id.horario);
        tv_horario.setText(horario);

        // Evento
        TextView tv_evento = (TextView) v.findViewById(R.id.evento);
        tv_evento.setText(evento);

        // Lugar
        TextView tv_lugar = (TextView) v.findViewById(R.id.lugar);
        tv_lugar.setText(lugar);

        return v;
    }
}
