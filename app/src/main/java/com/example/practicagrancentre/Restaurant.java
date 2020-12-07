package com.example.practicagrancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Restaurant extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    CardView TODOS[];
    LinearLayout Contendores[];
    Uri webpage[] = {Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d11758096-Reviews-Vinyam-Granollers_Catalonia.html"),
    Uri.parse("https://www.sagales.com/uploads/imagenes/20180706082505_6aba5f717c5e3cebf779eb511db301cab74bca56.pdf"),
    Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d996781-Reviews-Restaurant_El_Trabuc-Granollers_Catalonia.html")};
    String tel[] = {"930 23 28 99","931 58 34 81","938 70 86 57"};
    Uri maps[] = {Uri.parse("https://www.google.com/maps/place/Vinyam/@41.6069,2.2838993,17z/data=!4m12!1m6!3m5!1s0x12a4c7c7be7424dd:0x8ae30585656fdde2!2sVinyam!8m2!3d41.6069444!4d2.2841667!3m4!1s0x12a4c7c7be7424dd:0x8ae30585656fdde2!8m2!3d41.6069444!4d2.2841667"),
    Uri.parse("https://www.google.es/maps/place/Wagaya+Restaurante/@41.6101994,2.288777,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7cfba6d74c5:0x179bfb3cc7202a6a!8m2!3d41.6101954!4d2.2909657"),
    Uri.parse("https://www.google.es/maps/place/Restaurant+El+Trabuc/@41.5908681,2.2825143,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7f317159557:0xd867ef929aaa2a21!8m2!3d41.5908641!4d2.284703")};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ImageView retroceder = findViewById(R.id.retroceder);
        retroceder.setOnClickListener(this);

        Spinner spRestaurantes = findViewById(R.id.spinner);
        spRestaurantes.setOnItemSelectedListener(this);
        CardView TEMP[]={findViewById(R.id.card_view),findViewById(R.id.card_view2),findViewById(R.id.card_view3)};
        Uri webpage[] = {Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d11758096-Reviews-Vinyam-Granollers_Catalonia.html")};


        TODOS = TEMP;

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            //Toast.makeText(this, "Estás en la posición:" + position, Toast.LENGTH_LONG).show();
        int i=0;
        switch(position)
        {

            case 0 :
                i=0;
                while (i < TODOS.length)
                {
                    TODOS[i].setVisibility(view.VISIBLE);
                    i++;
                }
                break;

            case 1 :
                i=0;
                while (i < TODOS.length)
                {


                    if(TODOS[i].getTag().toString().equals("chino")) {
                        TODOS[i].setVisibility(view.VISIBLE);
                        /*FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        LinearLayout contenedor = findViewById(R.id.contenedor1);
                        contenedor.setLayoutParams(params);*/


                    }
                    else
                    {
                        TODOS[i].setVisibility(view.GONE);
                    }

                    i++;
                }
                break;
            case 2 :
                i=0;
                while (i < TODOS.length)
                {
                    if(TODOS[i].getTag().toString().equals("mediterraneo"))
                    {
                        TODOS[i].setVisibility(view.VISIBLE);
                    }
                    else
                    {
                        TODOS[i].setVisibility(view.GONE);

                    }
                    i++;
                }
                break;
            case 3 :
                i=0;
                while (i < TODOS.length)
                {
                    if(TODOS[i].getTag().toString().equals("gastronomiaCatalana"))
                    {

                        TODOS[i].setVisibility(view.VISIBLE);
                    }
                    else
                    {
                        TODOS[i].setVisibility(view.GONE);
                    }
                    i++;
                }
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public void OnclickBotones(View v)
    {
        ImageView img = (ImageView) v;
        Intent intent;


        switch (img.getId()) {

            case R.id.webVinyam:
                intent = new Intent(Intent.ACTION_VIEW, webpage[0]);
                startActivity(intent);
                break;
                case R.id.telvinyam:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+tel[0]));
                startActivity(intent);
                break;
                case R.id.mapsvinyam:

                    intent = new Intent(Intent.ACTION_VIEW, maps[0]);
                    intent.setPackage("com.google.android.apps.maps");
                    startActivity(intent);
                break;

            case R.id.webWagaya:
                intent = new Intent(Intent.ACTION_VIEW, webpage[1]);
                startActivity(intent);
                break;
            case R.id.telWagaya:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+tel[1]));
                startActivity(intent);
                break;
            case R.id.mapsWagaya:

                intent = new Intent(Intent.ACTION_VIEW, maps[1]);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                break;


            case R.id.webTrabuc:
                intent = new Intent(Intent.ACTION_VIEW, webpage[2]);
                startActivity(intent);
                break;
            case R.id.telTrabuc:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+tel[2]));
                startActivity(intent);
                break;
            case R.id.mapsTrabuc:

                intent = new Intent(Intent.ACTION_VIEW, maps[2]);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        //infla el menu xml
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.menuAbout:
                startActivity(new Intent(this, About.class));
                return true;
            case R.id.retroceder:

                startActivity(new Intent(this, MainActivity.class));
                break;

        }
        return true;
    }
}