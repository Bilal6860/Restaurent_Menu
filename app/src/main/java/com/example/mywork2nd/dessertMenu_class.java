package com.example.mywork2nd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
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
    public void onBindViewHolder(@NonNull dessertMenu_class.ViewHolder holder, final int position) {
        holder.tvdessertmenu.setText(all_dessertNam[position]);
        holder.imgviewdessert.setImageResource(all_dessertImg[position]);
        holder.layoutdessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c, viewactivity.class);
                intent.putExtra("name", all_dessertNam[position]);
                intent.putExtra("image", all_dessertImg[position]);
                intent.putExtra("price", all_dessertPrice[position]);
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return all_dessertNam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvdessertmenu;
        ImageView imgviewdessert;
        ConstraintLayout layoutdessert;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvdessertmenu = itemView.findViewById(R.id.tvdessertNam);
            layoutdessert = itemView.findViewById(R.id.layoutdessert);
            imgviewdessert = itemView.findViewById(R.id.imgviewAlldessert);
        }
    }
}
