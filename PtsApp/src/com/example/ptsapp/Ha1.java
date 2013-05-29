package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ha1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ha1);
        ImageButton s1 = (ImageButton) findViewById(R.id.imageButton1);
		s1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Ha1.this, How15.class);
				startActivity(intent);
			}
		});
		ImageButton s2 = (ImageButton) findViewById(R.id.imageButton2);
		s2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Ha1.this, How16.class);
				startActivity(intent);
			}
		});
    }
}