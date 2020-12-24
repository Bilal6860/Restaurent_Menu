package com.example.mywork2nd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class chickenMenu_class extends RecyclerView.Adapter<chickenMenu_class.ViewHolder> {
    String[] all_chickenNam;
    String[] all_chicenPrice;
    int[] all_chickenImg;
    Context c;

    public chickenMenu_class(Context context, String[] all_chicke, int[] chickenimg,String[]chickenPrices) {
        c = context;
        all_chickenNam = all_chicke;
        all_chickenImg = chickenimg;
        all_chicenPrice=chickenPrices;
    }

    @NonNull
    @Override
    public chickenMenu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.chicken_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull chickenMenu_class.ViewHolder holder, int position) {
        holder.tvchickenmenu.setText(all_chickenNam[position]);
        holder.imageViewchicken.setImageResource(all_chickenImg[position]);
        holder.tvchickenprice.setText(all_chicenPrice[position]);
    }

    @Override
    public int getItemCount() {
        return all_chickenNam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvchickenmenu;
        TextView tvchickenprice;
        ImageView imageViewchicken;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvchickenmenu = itemView.findViewById(R.id.tvchickenNam);
            tvchickenprice = itemView.findViewById(R.id.tvchickenprice);
            imageViewchicken=itemView.findViewById(R.id.imgviewAllchicken);
        }
    }
}
