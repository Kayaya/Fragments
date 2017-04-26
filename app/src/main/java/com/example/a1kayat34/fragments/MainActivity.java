package com.example.a1kayat34.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;;import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    //MapView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapFragmentID);

        if(item.getItemId() == R.id.london){
            mapFragment.getNewLocation(51.51, -0.1);
            return true;
        }
        if(item.getItemId() == R.id.paris){
            mapFragment.getNewLocation(48.85, 2.34);
            return true;
        }
        if(item.getItemId() == R.id.new_york){
            mapFragment.getNewLocation(40.75, -74);
            return true;
        }
        return false;
    }
}
