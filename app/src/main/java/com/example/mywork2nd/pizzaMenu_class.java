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

public class pizzaMenu_class extends RecyclerView.Adapter<pizzaMenu_class.ViewHolder> {
    String[] all_pizzaname;
    String[] all_pizzaPrice;
    int[] all_pizzaImg;
    Context c;

    public pizzaMenu_class(Context context, String[] pizzanam, int[] pizzaimg, String[] pizzaPrices) {
        c = context;
        all_pizzaname = pizzanam;
        all_pizzaImg = pizzaimg;
        all_pizzaPrice = pizzaPrices;
    }

    @NonNull
    @Override
    public pizzaMenu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.pizza_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pizzaMenu_class.ViewHolder holder, final int position) {
        holder.tvpizzamenu.setText(all_pizzaname[position]);
        holder.imageViewpizza.setImageResource(all_pizzaImg[position]);
        holder.layoutpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c, viewactivity.class);
                intent.putExtra("name", all_pizzaname[position]);
                intent.putExtra("image", all_pizzaImg[position]);
                intent.putExtra("price", all_pizzaPrice[position]);
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return all_pizzaname.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvpizzamenu;
        ImageView imageViewpizza;
        ConstraintLayout layoutpizza;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvpizzamenu = itemView.findViewById(R.id.tvpizzaNam);
            layoutpizza = itemView.findViewById(R.id.layoutpizza);
            imageViewpizza = itemView.findViewById(R.id.imgviewAllpizza);
        }
    }
}
