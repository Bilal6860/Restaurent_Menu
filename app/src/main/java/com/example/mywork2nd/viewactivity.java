package com.example.mywork2nd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class viewactivity extends AppCompatActivity {
    ImageView imageView_allitem;
    TextView tvallitemdetail, tvallitemprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewactivity);
        tvallitemdetail = findViewById(R.id.tvdetailallitem);
        tvallitemprice = findViewById(R.id.tvpriceallitem);
        imageView_allitem = findViewById(R.id.imgviewallitem);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int image = intent.getIntExtra("image", 1);
        String price = intent.getStringExtra("price");
        imageView_allitem.setImageResource(image);
        tvallitemprice.setText(price);
        tvallitemdetail.setText(name);
    }
}