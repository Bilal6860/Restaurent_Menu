package com.example.mywork2nd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class burgerMenu_class extends RecyclerView.Adapter<burgerMenu_class.ViewHolder> {
    String[] all_burgersNam;
    String[] all_burgerPrices;
    int[] all_burgersImg;
    Context c;

    public burgerMenu_class(Context context, String[] all_burgers, int[] burgersImges,String[]burgerPrices) {
        c = context;
        all_burgersNam = all_burgers;
        all_burgersImg = burgersImges;
        all_burgerPrices=burgerPrices;
    }

    @NonNull
    @Override
    public burgerMenu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.burger_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull burgerMenu_class.ViewHolder holder, int position) {
        holder.tvburgerMenu.setText(all_burgersNam[position]);
        holder.imageViewBurgers.setImageResource(all_burgersImg[position]);
        holder.tvburgerprice.setText(all_burgerPrices[position]);
    }

    @Override
    public int getItemCount() {
        return all_burgersNam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvburgerMenu;
        TextView tvburgerprice;
        ImageView imageViewBurgers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvburgerMenu = itemView.findViewById(R.id.tvburgerName);
            tvburgerprice = itemView.findViewById(R.id.tv_burgerPrice);
            imageViewBurgers=itemView.findViewById(R.id.imgviewAllBurgers);
        }
    }
}
