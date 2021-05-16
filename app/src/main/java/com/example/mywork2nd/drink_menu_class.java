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

public class drink_menu_class extends RecyclerView.Adapter<drink_menu_class.ViewHolder> {
    String[] alldrinkknam;
    String[] alldrinkprice;
    int[] alldrinkimge;
    Context c;

    public drink_menu_class(Context context, String[] alldrinknm, int[] drinkimg, String[] drinkprice) {
        c = context;
        alldrinkknam = alldrinknm;
        alldrinkimge = drinkimg;
        alldrinkprice = drinkprice;
    }

    @NonNull
    @Override
    public drink_menu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.drinks_menu, parent, false);
        return new drink_menu_class.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull drink_menu_class.ViewHolder holder, final int position) {
        holder.tvdrinknam.setText(alldrinkknam[position]);
        holder.imgviewdrink.setImageResource(alldrinkimge[position]);
        holder.layoutdrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c, viewactivity.class);
                intent.putExtra("name", alldrinkknam[position]);
                intent.putExtra("image", alldrinkimge[position]);
                intent.putExtra("price", alldrinkprice[position]);
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return alldrinkknam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvdrinknam;
        ImageView imgviewdrink;
        ConstraintLayout layoutdrinks;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvdrinknam = itemView.findViewById(R.id.tvdrinkNam);
            layoutdrinks=itemView.findViewById(R.id.layoutdrinks);
            imgviewdrink = itemView.findViewById(R.id.imgviewAlldrinks);
        }
    }
}
