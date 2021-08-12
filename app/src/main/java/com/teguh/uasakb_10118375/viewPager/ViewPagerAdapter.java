package com.teguh.uasakb_10118375.viewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teguh.uasakb_10118375.R;

import java.util.List;

/*
    Tanggal Pengerjaan  : 8 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder> {

    private List<ViewPagerItem> viewPagerItems;

    public ViewPagerAdapter(List<ViewPagerItem> viewPagerItems) {
        this.viewPagerItems = viewPagerItems;
    }

    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerAdapter.ViewPagerHolder holder, int position) {
        holder.setViewPagerData(viewPagerItems.get(position));
    }

    @Override
    public int getItemCount() {
        return viewPagerItems.size();
    }

    class ViewPagerHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public ViewPagerHolder(@NonNull View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.title_view_pager);
            imageView = itemView.findViewById(R.id.image_view_pager);
        }

        void setViewPagerData(ViewPagerItem viewPagerItem){
            textView.setText(viewPagerItem.getTitle());
            imageView.setImageResource(viewPagerItem.getImage());
        }
    }
}
