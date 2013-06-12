package com.example.ptsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ShowWeek extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showweek);
        ImageButton b1 = (ImageButton) findViewById(R.id.monday);
        ImageButton b2 = (ImageButton) findViewById(R.id.tuesday);
        ImageButton b3 = (ImageButton) findViewById(R.id.wednesday);
        ImageButton b4 = (ImageButton) findViewById(R.id.thursday);
        ImageButton b5 = (ImageButton) findViewById(R.id.friday);
        ImageButton b6 = (ImageButton) findViewById(R.id.saturday);
        ImageButton b7 = (ImageButton) findViewById(R.id.sunday);
        
		b1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_06Activity.class);
				startActivity(intent);
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_07Activity.class);
				startActivity(intent);
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_08Activity.class);
				startActivity(intent);
			}
		});
		b4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_09Activity.class);
				startActivity(intent);
			}
		});
		b5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_10Activity.class);
				startActivity(intent);
			}
		});
		b6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_11Activity.class);
				startActivity(intent);
			}
		});
		b7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ShowWeek.this, Ex07_12Activity.class);
				startActivity(intent);
			}
		});
		
    }
    public boolean onCreateOptionsMenu(Menu menu) {
    	
		   MenuInflater inflater = getMenuInflater();
     inflater.inflate(R.menu.mymenu, menu); 
     return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
switch( item.getItemId() ){
		
		case R.id.addMenu:
			
			LayoutInflater inf = getLayoutInflater();
			View convertView = inf.inflate(R.layout.studentadd, null);
			
		final	EditText  editName = (EditText)convertView.findViewById(R.id.editName);
		final	EditText editDay = (EditText)convertView.findViewById(R.id.editDay);
		final	EditText editsets = (EditText)convertView.findViewById(R.id.editsets);
			
			AlertDialog.Builder builder = new AlertDialog.Builder(ShowWeek.this);
			builder.setTitle("운동 일정 등록");
			builder.setIcon(android.R.drawable.stat_sys_warning);
			builder.setView(convertView);
			builder.setPositiveButton("일정등록",  new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {

					String name = editName.getText().toString();
					String Day = editDay.getText().toString();
					String sets =editsets.getText().toString();
					
					
				}
			});
			builder.setNegativeButton("취소",  null);
			builder.show();
			
			break;
			
		
			
		case R.id.preferMenu:
			Intent intent = new Intent(ShowWeek.this, FinalScheduler.class);
			startActivity(intent);
		
		}//end 
	   return super.onOptionsItemSelected(item);
	}
}