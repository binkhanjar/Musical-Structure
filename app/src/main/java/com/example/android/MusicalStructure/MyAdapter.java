package com.example.android.MusicalStructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<Song> {


    public MyAdapter(Activity context, ArrayList<Song> songs ) {
        // هنا ، نقوم بتهيئة التخزين الداخلي لـ ArrayAdapter للسياق والقائمة.
        // يتم استخدام الوسيطة الثانية عندما يتم تعبئة ArrayAdapter في TextView واحد.
        // لأن هذا محول مخصص لاثنين من TextViews و ImageView ، المحول ليس كذلك
        // سنستخدم هذه الحجة الثانية ، لذلك يمكن أن تكون أي قيمة. هنا استخدمنا 0.
        super(context, 0, songs);

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the current view is being reused, or the display is inflated
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        // Get an object located at that position in the list
        Song currentSong = getItem(position);

        // Reference TextView with id xml
        TextView nameSong = listItemView.findViewById(R.id.name_song_xml);

        nameSong.setText(currentSong.getmNameSong());

        // Reference Image View with id xml
        ImageView play = listItemView.findViewById(R.id.iv_play_xml);

        // set this image to the play ImageView
        play.setImageResource(Song.getImagePlay());

        // Reference Image View with id xml
        ImageView imageView = listItemView.findViewById(R.id.image_xml);

        imageView.setImageResource(Song.getmImage());

        return listItemView;
    }
}