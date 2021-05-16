package com.example.mywork2nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class Item_Detail_activity extends AppCompatActivity {
    String[] burgers_names, burger_price, pizza_nam, pizza_price, dessert_nam,
            dessert_price, drink_nam, drink_price, sandwitchWrap_nam, SandwitchWrap_price;
    RecyclerView recylerforAll;
    int[] burger_imges = {

            R.drawable.cruncho,
            R.drawable.doppler,
            R.drawable.jalapeno_crunch,
            R.drawable.mushroom_melt,
            R.drawable.zinger,
            R.drawable.tripple_cheese
    };
    int[] pizza_imges = {

            R.drawable.chicken_tikka,
            R.drawable.tandoori_chicken,
            R.drawable.golden_delight,
            R.drawable.chicken_fajita,
            R.drawable.pepporoni,
            R.drawable.mozzarella
    };
    int[] dessert_imges = {
            R.drawable.banofie_pie,
            R.drawable.choclate_pie,
            R.drawable.apple_pie,
            R.drawable.choclate_brownies,
            R.drawable.redvelvetcupcakes,
            R.drawable.choc_cupcake,
            R.drawable.vanila_cupcake,
            R.drawable.bday_one,
            R.drawable.bday_two,
            R.drawable.choc_icecream,
            R.drawable.oreo_icecream,
            R.drawable.mango_icecream
    };
    int[] drink_imges = {
            R.drawable.stawberry_ore,
            R.drawable.salted_caramel,
            R.drawable.carrot_orange,
            R.drawable.pineapple,
            R.drawable.cucumber_juice,
            R.drawable.mango_lemonade,
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
            R.drawable.mutto_roll,
            R.drawable.paneer_roll,
            R.drawable.bbq_ranch_wrap,
            R.drawable.steak_sandwich,
            R.drawable.club_sandwich,
            R.drawable.grilled_chicken_sandwich,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__detail);
        Intent intent = getIntent();
        String item_name = intent.getStringExtra("message");
        //  int item_img = intent.getIntExtra("message2", 1);
        recylerforAll = findViewById(R.id.recycler_forAll);

        if (item_name.equals("Burgers")) {
            burgers_names = getResources().getStringArray(R.array.burgers_menu);
            burger_price = getResources().getStringArray(R.array.burgers_prices);
            burgerMenu_class burgerMenu_classOBJ = new burgerMenu_class(this, burgers_names, burger_imges, burger_price);
            recylerforAll.setAdapter(burgerMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }
        if (item_name.equals("Pizza")) {
            pizza_nam = getResources().getStringArray(R.array.pizza_menu);
            pizza_price = getResources().getStringArray(R.array.pizza_prices);
            pizzaMenu_class pizzaMenu_classOBJ = new pizzaMenu_class(
                    this, pizza_nam, pizza_imges, pizza_price);
            recylerforAll.setAdapter(pizzaMenu_classOBJ);
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
            SandwitchWrap_price = getResources().getStringArray(R.array.sandwitch_prices);
            sandWrapMenu_class sandwichMenu_classOBJ = new sandWrapMenu_class(this, sandwitchWrap_nam, sandwich_wrap_imges, SandwitchWrap_price);
            recylerforAll.setAdapter(sandwichMenu_classOBJ);
            recylerforAll.setLayoutManager(new LinearLayoutManager(this));
        }

    }
}