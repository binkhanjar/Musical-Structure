package com.example.android.MusicalStructure;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.Toast.makeText;

public class Abdu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        // back to MainActivity
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Array list
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.drawable.abdo,"song1",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song2",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song3",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song4",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song5",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song6",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song7",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song8",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song9",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.abdo,"song10",R.drawable.ic_baseline_play_circle));

        // adapter array list
        MyAdapter adapter  = new MyAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
