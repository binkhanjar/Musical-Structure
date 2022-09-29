package com.example.android.MusicalStructure;

public class Song {

    private String mNameSong;
    private static int imagePlay;
    private static int mImage;

    public Song(int Image, String NameSong, int ImagePlay) {

        mNameSong = NameSong;
        imagePlay = ImagePlay;
        mImage = Image;
    }

    public String getmNameSong() {
        return mNameSong;
    }

    public static int getImagePlay() {
        return imagePlay;
    }

    public static int getmImage() {
        return mImage;
    }
}
