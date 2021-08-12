package com.teguh.uasakb_10118375.viewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.teguh.uasakb_10118375.MainActivity;
import com.teguh.uasakb_10118375.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

/*
    Tanggal Pengerjaan  : 8 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class ViewPager extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private LinearLayout layoutViewPager;
    private MaterialButton buttonViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        getSupportActionBar().hide();

        layoutViewPager = findViewById(R.id.layout_view_pager);
        buttonViewPager = findViewById(R.id.btn_view_pager);

        setupViewPagerItems();

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(viewPagerAdapter);

        setupViewPagerIndicator();
        setCurrentIndicator(0);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicator(position);
            }
        });

        buttonViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void setupViewPagerItems(){
        List<ViewPagerItem> viewPagerItems = new ArrayList<>();

        ViewPagerItem first = new ViewPagerItem();
        //first.setTitle("Test");
        first.setImage(R.drawable.ic_plane);

        ViewPagerItem second = new ViewPagerItem();
        //second.setTitle("Test");
        second.setImage(R.drawable.ic_beach_chair);

        ViewPagerItem third = new ViewPagerItem();
        //third.setTitle("Test");
        third.setImage(R.drawable.ic_beach);

        viewPagerItems.add(first);
        viewPagerItems.add(second);
        viewPagerItems.add(third);

        viewPagerAdapter = new ViewPagerAdapter(viewPagerItems);
    }

    private void setupViewPagerIndicator(){
        ImageView[] indicators = new ImageView[viewPagerAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for(int i = 0; i < indicators.length; i++){
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layoutViewPager.addView(indicators[i]);
        }
    }

    private void setCurrentIndicator(int index){
        int childCount = layoutViewPager.getChildCount();
        for(int i = 0; i < childCount; i++){
            ImageView imageView = (ImageView) layoutViewPager.getChildAt(i);
            if(i == index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active)
                );
            }else {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive)
                );
            }
        }
        buttonViewPager.setText("Home");
    }
}