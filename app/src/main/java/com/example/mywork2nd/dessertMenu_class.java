package com.example.mywork2nd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class dessertMenu_class extends RecyclerView.Adapter<dessertMenu_class.ViewHolder> {
    String[] all_dessertNam;
    String[] all_dessertPrice;
    int[] all_dessertImg;
    Context c;

    public dessertMenu_class(Context context, String[] all_dessert, int[] dessertimg, String[] dessertprice) {
        c = context;
        all_dessertNam = all_dessert;
        all_dessertImg = dessertimg;
        all_dessertPrice = dessertprice;
    }

    @NonNull
    @Override
    public dessertMenu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.dessert_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dessertMenu_class.ViewHolder holder, int position) {
        holder.tvdessertmenu.setText(all_dessertNam[position]);
        holder.imgviewdessert.setImageResource(all_dessertImg[position]);
        holder.tvdessertprice.setText(all_dessertPrice[position]);
    }

    @Override
    public int getItemCount() {
        return all_dessertNam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvdessertmenu;
        TextView tvdessertprice;
        ImageView imgviewdessert;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvdessertmenu = itemView.findViewById(R.id.tvdessertNam);
            tvdessertprice = itemView.findViewById(R.id.tvdessertprice);
            imgviewdessert = itemView.findViewById(R.id.imgviewAlldessert);
        }
    }
}
