package com.teguh.uasakb_10118375;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.teguh.uasakb_10118375.menu.HomeFragment;
import com.teguh.uasakb_10118375.menu.MapsFragment;
import com.teguh.uasakb_10118375.menu.PersonFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/*
    Tanggal Pengerjaan  : 8 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnItemSelectedListener navigation = new BottomNavigationView.OnItemSelectedListener(){
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new HomeFragment();
                    break;
                case R.id.menu_maps:
                    f = new MapsFragment();
                    break;
                case R.id.menu_person:
                    f = new PersonFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.body_container, f).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.menu_home);
        bottomNavigationView.setOnItemSelectedListener(navigation);

    }
}