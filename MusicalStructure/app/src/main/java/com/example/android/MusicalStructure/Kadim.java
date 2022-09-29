package com.example.android.MusicalStructure;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Kadim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        // back to MainActivity
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.drawable.kazem,"song1",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song2",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song3",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song4",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song5",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song6",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song7",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song8",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song9",R.drawable.ic_baseline_play_circle));
        songs.add(new Song(R.drawable.kazem,"song10",R.drawable.ic_baseline_play_circle));


        MyAdapter adapter  = new MyAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
