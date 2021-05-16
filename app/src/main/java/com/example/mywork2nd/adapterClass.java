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

public class adapterClass extends RecyclerView.Adapter<adapterClass.ViewHolder> {
    String[] item_names;
    int[] item_images;
    Context context;

    public adapterClass(Context c, String[] item_nam, int[] item_img) {
        context = c;
        item_names = item_nam;
        item_images = item_img;
    }

    @NonNull
    @Override
    public adapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.singleitem, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull adapterClass.ViewHolder holder, final int position) {
        holder.tv_itemname.setText(item_names[position]);
        holder.iv_item_image.setImageResource(item_images[position]);
        holder.singleitem_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Item_Detail_activity.class);
                intent.putExtra("message", item_names[position]);
                intent.putExtra("message2", item_images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item_images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_itemname;
        ImageView iv_item_image;
        ConstraintLayout singleitem_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_itemname = itemView.findViewById(R.id.tvname);
            iv_item_image = itemView.findViewById(R.id.imgeicon);
            singleitem_layout = itemView.findViewById(R.id.singleItem_layout);
        }
    }
}