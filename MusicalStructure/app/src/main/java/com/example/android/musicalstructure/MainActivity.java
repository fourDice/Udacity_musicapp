package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //Create an ArrayList
        ArrayList<Sort> sortings = new ArrayList<>();
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));
        sortings.add(new Sort( "AC/DC", "Rock", "Hells Bells" ));

        SortingAdapter SortingAdapter = new SortingAdapter(this, Sort);

        ListView listView = (ListView) findViewById( R.id.listview_Sort);
        listView.setAdapter(SortingAdapter);
    }
}

