package com.example.android.MusicalStructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // open ummKulthum activity
        CardView ummKulthum = findViewById(R.id.cv_UmmKulthum_xml);
        ummKulthum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ummKulthumIntent = new Intent(MainActivity.this, UmmKulthum.class);
                startActivity(ummKulthumIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // open halim activity
        CardView halim = findViewById(R.id.cv_halim_xml);
        halim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent halimIntent = new Intent(MainActivity.this, Halim.class);
                startActivity(halimIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // open fairouz activity
        CardView fairouz = findViewById(R.id.cv_firoz_xml);
        fairouz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fairouzIntent = new Intent(MainActivity.this, Fairouz.class);
                startActivity(fairouzIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // open michael activity
        CardView michael = findViewById(R.id.cv_michel_xml);
        michael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent michaelIntent = new Intent(MainActivity.this, Michael.class);
                startActivity(michaelIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // open abdu activity
        CardView abdu = findViewById(R.id.cv_abdu_xml);
        abdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abduIntent = new Intent(MainActivity.this, Abdu.class);
                startActivity(abduIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        // open kadim activity
        CardView kadim = findViewById(R.id.cv_kadim_xml);
        kadim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kadimIntent = new Intent(MainActivity.this, Kadim.class);
                startActivity(kadimIntent);
                Toast toast = makeText(getApplicationContext(), "To listen to the song, press Play ", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

}