package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;



public class SortingAdapter extends ArrayAdapter<Sort>{

    private static final String LOG_TAG = SortingAdapter.class.getSimpleName();

    public SortingAdapter(Activity context, ArrayList<Sort> sorts){
        super(context, 0, sorts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.sort_layout, Parent, false);
        }
        Sort currentSong = getItem( position );

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.Artist);
        artistTextView.setText( currentSong.getArtist() );

        TextView genreTextView = (TextView) listItemView.findViewById(R.id.Genre);
        genreTextView.setText( currentSong.getGenre() );

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.Title);
        titleTextView.setText( currentSong.getTitle() );

        return listItemView;
    }

}
