package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Hache extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hache);
        ImageButton h1 = (ImageButton) findViewById(R.id.h1);
		ImageButton h2 = (ImageButton) findViewById(R.id.h2);
		ImageButton h3 = (ImageButton) findViewById(R.id.h3);

		h1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Hache.this, Ha1.class);
				startActivity(intent);
			}
		});
		h2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Hache.this, Ha2.class);
				startActivity(intent);
			}
		});
		h3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Hache.this, Ha3.class);
				startActivity(intent);
			}
		});

    }
}