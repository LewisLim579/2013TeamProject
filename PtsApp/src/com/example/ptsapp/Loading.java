package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Loading extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Window win = getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);  
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.loading);
		
		
		Handler handler = new Handler();
		
		handler.postDelayed(new Runnable() {
			public void run() {
				Intent intent = new Intent(getBaseContext(), MainMenu.class);
				startActivity(intent);
				finish();
			}
		}, 1000);
	}
		
		
}