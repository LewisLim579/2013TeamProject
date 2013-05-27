package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Sangche extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sangche);
        ImageButton s1 = (ImageButton) findViewById(R.id.sa1);
		ImageButton s2 = (ImageButton) findViewById(R.id.sa2);
		ImageButton s3 = (ImageButton) findViewById(R.id.sa3);
		ImageButton s4 = (ImageButton) findViewById(R.id.sa4);
		ImageButton s5 = (ImageButton) findViewById(R.id.sa5);
		s1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Sangche.this, Sa1.class);
				startActivity(intent);
			}
		});
		s2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Sangche.this, Sa2.class);
				startActivity(intent);
			}
		});
		s3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Sangche.this, Sa3.class);
				startActivity(intent);
			}
		});
		s4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Sangche.this, Sa4.class);
				startActivity(intent);
			}
		});
		s5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Sangche.this, Sa5.class);
				startActivity(intent);
			}
		});
    }
}