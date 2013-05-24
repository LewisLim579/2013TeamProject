package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Starc extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starc);
        
        ImageButton d1 = (ImageButton) findViewById(R.id.nab);

		d1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Starc.this, C_na.class);
				startActivity(intent);
			}
		});
		
		ImageButton d2 = (ImageButton) findViewById(R.id.jungb);

		d2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Starc.this, C_jung.class);
				startActivity(intent);
			}
		});
		
		ImageButton d3 = (ImageButton) findViewById(R.id.oib);

		d3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Starc.this, C_oi.class);
				startActivity(intent);
			}
		});
       
    }
}