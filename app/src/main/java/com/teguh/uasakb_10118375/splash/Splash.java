package com.teguh.uasakb_10118375.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.teguh.uasakb_10118375.R;
import com.teguh.uasakb_10118375.viewPager.ViewPager;

/*
    Tanggal Pengerjaan  : 8 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(Splash.this, ViewPager.class);
                startActivity(panggil);
                finish();
            }
        }, 5000);
    }
}