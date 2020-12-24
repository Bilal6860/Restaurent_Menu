package com.example.mywork2nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Item_Detail_activity extends AppCompatActivity {
    String[] burgers_names, burger_price, chicken_nam, chicken_price,dessert_nam,
    dessert_price,drink_nam,drink_price,sandwitchWrap_nam,SandwitchWrap_price;
    RecyclerView recylerforAll;
    int[] burger_imges = {

            R.drawable.cruncho,
            R.drawable.doppler,
            R.drawable.jalapeno_crunch,
            R.drawable.mushroom_melt,
            R.drawable.pizza_burger,
            R.drawable.tripple_cheese
    };
    int[] chicken_imges = {

            R.drawable.hot_wings,
            R.drawable.roasred_grilled,
            R.drawable.steak,
            R.drawable.tikka
    };
    int[] dessert_imges = {

            R.drawable.banofie_pie,
            R.drawable.choclate_brownies,
            R.drawable.nutellacheesecake,
            R.drawable.redvelvetcupcakes,
            R.drawable.strawberrymillefeuillie
    };
    int[] drink_imges = {

            R.drawable.black_coffee,
            R.drawable.cappuccino,
            R.drawable.cold_coffee,
            R.drawable.cz_hot_chocolate,
            R.drawable.d_cocacola,
            R.drawable.fanta_orange,
            R.drawable.sprite,
            R.drawable.tea,

    };
    int[] sandwich_wrap_imges = {

            R.drawable.bbq_ranch_wrap,
            R.drawable.club_sandwich,
            R.drawable.grilled_chicken_sandwich,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__detail);
        Intent intent = getIntent();
        String item_name = intent.getStringExtra("message");
        int item_img = intent.getIntExtra("message2", 1);
        recylerforAll = findViewById(R.id.recycler_forAll);

        if (item_name.equals("Burgers")) {
            burgers_names = getResources().getStringArray(R.array.burgers_menu);
            burger_price = getResources().getStringArray(R.array.burgers_prices);
            burgerMenu_class burgerMenu_classOBJ = new burgerMenu_class(this, burgers_names, burger_imges, burger_price);
            recylerforAll.setAdapter(burgerMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }
        if (item_name.equals("Chicken")) {
            chicken_nam = getResources().getStringArray(R.array.chicken_menu);
            chicken_price = getResources().getStringArray(R.array.chicken_prices);
            chickenMenu_class chickenMenu_classOBJ = new chickenMenu_class(this, chicken_nam, chicken_imges, chicken_price);
            recylerforAll.setAdapter(chickenMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }
        if (item_name.equals("Desserts")) {
            dessert_nam = getResources().getStringArray(R.array.dessert_menu);
            dessert_price = getResources().getStringArray(R.array.dessert_prices);
            dessertMenu_class dessertMenu_classOBJ = new dessertMenu_class(this, dessert_nam, dessert_imges, dessert_price);
            recylerforAll.setAdapter(dessertMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }
        if (item_name.equals("Drinks")) {
            drink_nam = getResources().getStringArray(R.array.drinks_menu);
            drink_price = getResources().getStringArray(R.array.drinks_prices);
            drink_menu_class drinkMenu_classOBJ = new drink_menu_class(this, drink_nam, drink_imges, drink_price);
            recylerforAll.setAdapter(drinkMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }

        if (item_name.equals("Sandwiches & Wraps")) {
            sandwitchWrap_nam = getResources().getStringArray(R.array.sandwitch_menu);
            SandwitchWrap_price= getResources().getStringArray(R.array.sandwitch_prices);
            sandWrapMenu_class sandwichMenu_classOBJ = new sandWrapMenu_class(this, sandwitchWrap_nam, sandwich_wrap_imges, SandwitchWrap_price);
            recylerforAll.setAdapter(sandwichMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }

    }
}