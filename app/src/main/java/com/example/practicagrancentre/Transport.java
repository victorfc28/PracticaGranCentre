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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Transport extends AppCompatActivity implements View.OnClickListener {
    Uri webpage[] = {Uri.parse("https://www.sagales.com/uploads/imagenes/20180727084416_874b0d4ba7b45ec3f13713d61424794bc0952323.pdf"),
            Uri.parse("https://www.sagales.com/uploads/imagenes/20180706082505_6aba5f717c5e3cebf779eb511db301cab74bca56.pdf"),
            Uri.parse("https://www.sagales.com/uploads/imagenes/20180703102807_5dba48a627347d77a57d5d85236f8dc05387c482.pdf"),
            Uri.parse("https://www.taxi-granollers.com/es/"),
            Uri.parse("http://rodalies.gencat.cat/es/inici/")};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        Button Linea1 = findViewById(R.id.lineacanoves);
        Linea1.setOnClickListener(this);
        Button Linea2 = findViewById(R.id.lineaTorreta);
        Linea2.setOnClickListener(this);
        Button Linea3 = findViewById(R.id.lineaCorro);
        Linea3.setOnClickListener(this);
        Button Taxis = findViewById(R.id.taxis);
        Taxis.setOnClickListener(this);
        Button Rodalies = findViewById(R.id.rodalies);
        Rodalies.setOnClickListener(this);
        ImageView retroceder = findViewById(R.id.retroceder);
        retroceder.setOnClickListener(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {


            case R.id.lineacanoves:
                intent = new Intent(Intent.ACTION_VIEW, webpage[0]);
                startActivity(intent);
                break;
            case R.id.lineaTorreta:
                intent = new Intent(Intent.ACTION_VIEW, webpage[1]);
                startActivity(intent);
                break;
            case R.id.lineaCorro:
                intent = new Intent(Intent.ACTION_VIEW, webpage[2]);
                startActivity(intent);
                break;
            case R.id.taxis:
                intent = new Intent(Intent.ACTION_VIEW, webpage[3]);
                startActivity(intent);
                break;
            case R.id.rodalies:
                intent = new Intent(Intent.ACTION_VIEW, webpage[4]);
                startActivity(intent);
                break;
            case R.id.retroceder:
                intent = new Intent(this, MainActivity.class);
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

        }
        return true;
    }
}


