package com.example.android.musicalstructure;

public class Sort {


    //strings that will fill the class from an array

    private String mArtist;

    private String mGenre;

    private String mTitle;

    //create Sort object

    public Sort(String Artist, String Genre, String Title){
        mArtist = Artist;
        mGenre = Genre;
        mTitle = Title;
    }

    //get the information from the array

    public String getArtist(){
        return mArtist;
    }

    public String getGenre(){
        return mGenre;
    }

    public String getTitle(){
        return mTitle;
    }

}
