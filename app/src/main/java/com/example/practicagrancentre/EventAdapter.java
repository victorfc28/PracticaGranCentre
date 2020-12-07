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

        String img = events[position][0];
        String url = events[position][1];
        String category = events[position][1];
        String event  = events[position][3];
        String place  = events[position][4];
        String datetime  = events[position][5];

        // Valor actual según la posición
        v = layoutInflater.inflate(R.layout.list_item_events, null);

        ImageView iv_img = (ImageView) v.findViewById(R.id.img);

        // Imagen
        int id = this.context.getResources().getIdentifier(img, "drawable", context.getPackageName());
        iv_img.setImageResource(id);

        // Evento
        TextView tv_event = (TextView) v.findViewById(R.id.event);
        tv_event.setText(event);

        // Lugar
        TextView tv_place = (TextView) v.findViewById(R.id.place);
        tv_place.setText(place);

        // Horario
        TextView tv_datetime = (TextView) v.findViewById(R.id.datetime);
        tv_datetime.setText(datetime);

        return v;
    }
}
