package com.example.ptsapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Shop extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        ImageButton drink = (ImageButton) findViewById(R.id.drinkbtn);
        ImageButton food = (ImageButton) findViewById(R.id.foodbtn);
        
        drink.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Shop.this, Drink.class);
				startActivity(intent);
			}
		});
        
        food.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Shop.this, Food.class);
				startActivity(intent);
			}
		});
    }
}