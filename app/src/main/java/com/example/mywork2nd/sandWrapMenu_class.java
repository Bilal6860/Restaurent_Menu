package com.example.mywork2nd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class sandWrapMenu_class extends RecyclerView.Adapter<sandWrapMenu_class.ViewHolder> {
    String[] allsandwichNam;
    String[] allsandwichprice;
    int[] allsandwichimage;
    Context c;

    public sandWrapMenu_class(Context context, String[] allsandwich, int[] sandimg, String[] sandprice) {
        c = context;
        allsandwichNam = allsandwich;
        allsandwichimage = sandimg;
        allsandwichprice = sandprice;
    }

    @NonNull
    @Override
    public sandWrapMenu_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.sandwrap_menu, parent, false);
        return new sandWrapMenu_class.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sandWrapMenu_class.ViewHolder holder, int position) {
        holder.tvsandNam.setText(allsandwichNam[position]);
        holder.imagesand.setImageResource(allsandwichimage[position]);
        holder.tvsandprice.setText(allsandwichprice[position]);
    }

    @Override
    public int getItemCount() {
        return allsandwichNam.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvsandNam;
        TextView tvsandprice;
        ImageView imagesand;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvsandNam = itemView.findViewById(R.id.tvsandName);
            tvsandprice = itemView.findViewById(R.id.tvsandwichiprice);
            imagesand = itemView.findViewById(R.id.imgviewAllsandwich);
        }
    }
}
