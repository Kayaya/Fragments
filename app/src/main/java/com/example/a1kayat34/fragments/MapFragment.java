package com.example.a1kayat34.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/**
 * Created by 1kayat34 on 24/04/2017.
 */
public class MapFragment extends Fragment {

    MapView map;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Activity activity = getActivity();
    }
    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.mapfrag, parent);
    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Activity activity = getActivity();

        Configuration.getInstance().load(activity, PreferenceManager.getDefaultSharedPreferences(activity));

        map = (MapView) getView().findViewById(R.id.map1);
        map.setBuiltInZoomControls(true);
        map.getController().setZoom(13);
        map.getController().setCenter(new GeoPoint(40.1,22.5));

        // Now you have an activity, you can create the map as before...
    }

    public void getNewLocation(double latitude, double longitude){
        GeoPoint ll = new GeoPoint(latitude, longitude);
        map.getController().setCenter(ll);
    }


}
