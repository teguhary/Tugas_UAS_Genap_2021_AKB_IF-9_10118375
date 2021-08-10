package com.example.uasakb_10118375.menu;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uasakb_10118375.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/*
    Tanggal Pengerjaan  : 8 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class MapsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Initialize view
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        //Initialize map fragment
        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_maps);

        //Async map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng bandung = new LatLng(-6.9073453, 107.6154304);
                LatLng gedung_sate = new LatLng(-6.9032787, 107.6186783);
                LatLng museum_geologi = new LatLng(-6.900578, 107.621689);
                LatLng alun_alun = new LatLng(-6.9218592, 107.6070959);
                LatLng braga = new LatLng(-6.9176537, 107.6088288);
                LatLng asia_afrika = new LatLng(-6.9211744, 107.6088635);

                googleMap.addMarker(new MarkerOptions().position(gedung_sate).title("Gedung Sate"));
                googleMap.addMarker(new MarkerOptions().position(museum_geologi).title("Museum Geologi Bandung"));
                googleMap.addMarker(new MarkerOptions().position(alun_alun).title("Alun-Alun Kota Bandung"));
                googleMap.addMarker(new MarkerOptions().position(braga).title("JL. Braga"));
                googleMap.addMarker(new MarkerOptions().position(asia_afrika).title("JL. Asia Afrika"));

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bandung,13));
            }
        });

        return view;
    }
}