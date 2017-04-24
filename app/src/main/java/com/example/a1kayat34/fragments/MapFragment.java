package com.example.a1kayat34.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 1kayat34 on 24/04/2017.
 */
public class MapFragment extends Fragment {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Activity activity = getActivity();
    }
    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.mapfrag, parent);
    }
}
