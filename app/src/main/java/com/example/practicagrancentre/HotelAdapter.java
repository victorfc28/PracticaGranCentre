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

        String img = hotels[position][0];
        String hotel = hotels[position][1];
        String stars = hotels[position][2];
        String price = hotels[position][3];
        String description = hotels[position][4];
        String address = hotels[position][5];

        // Valor actual según la posición
        v = layoutInflater.inflate(R.layout.list_item_hotels, null);

        ImageView iv_imagen = (ImageView) v.findViewById(R.id.img);

        // Imagen
        int id = this.context.getResources().getIdentifier(img, "drawable", context.getPackageName());
        iv_imagen.setImageResource(id);

        // Hotel
        TextView tv_hotel = (TextView) v.findViewById(R.id.hotel);
        tv_hotel.setText(hotel);

        // Description
        TextView tv_description = (TextView) v.findViewById(R.id.description);
        tv_description.setText(description);

        switch (stars) {
            case "1":
                ImageView tv_stars2 = (ImageView) v.findViewById(R.id.stars2);
                tv_stars2.setVisibility(View.INVISIBLE);
            case "2":
                ImageView tv_stars3 = (ImageView) v.findViewById(R.id.stars3);
                tv_stars3.setVisibility(View.INVISIBLE);
            case "3":
                ImageView tv_stars4 = (ImageView) v.findViewById(R.id.stars4);
                tv_stars4.setVisibility(View.INVISIBLE);
            case "4":
                ImageView tv_stars5 = (ImageView) v.findViewById(R.id.stars5);
                tv_stars5.setVisibility(View.INVISIBLE);
            default:
                break;
        }

        // Price
        TextView tv_price = (TextView) v.findViewById(R.id.price);
        tv_price.setText("desde " + price + "/per.");

        return v;
    }
}
