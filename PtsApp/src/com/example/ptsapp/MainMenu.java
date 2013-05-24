package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		ImageButton b = (ImageButton) findViewById(R.id.btn1);
		ImageButton b3 = (ImageButton) findViewById(R.id.btn3);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainMenu.this, Distinguish.class);
				startActivity(intent);
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainMenu.this, Schedule.class);
				startActivity(intent);
			}
		});
	}
}