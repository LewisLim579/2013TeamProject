package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ha2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ha2);
        ImageButton s1 = (ImageButton) findViewById(R.id.imageButton1);
		s1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Ha2.this, How17.class);
				startActivity(intent);
			}
		});
		ImageButton s2 = (ImageButton) findViewById(R.id.imageButton2);
		s2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Ha2.this, How18.class);
				startActivity(intent);
			}
		});
    }
}