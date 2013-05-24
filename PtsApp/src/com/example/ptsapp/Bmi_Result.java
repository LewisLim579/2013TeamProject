package com.example.ptsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bmi_Result extends Activity {
    /** Called when the activity is first created. */
    private TextView showbmi;
    private TextView resulttxt;
    private ImageView mark;
 
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmiresult);
        
        Intent intent= this.getIntent();
        String str1="";
        double result2=0;
        if(intent!=null)
        {
        str1= intent.getStringExtra("gogo");
        result2=Double.parseDouble(str1);
        };
       
       showbmi = (TextView) findViewById(R.id.rebmi);
       showbmi.setText(""+result2);
       

       mark = (ImageView) findViewById(R.id.remark);
       if(result2>=30)
    	   mark.setImageResource(R.drawable.warning);
       else if(result2>=25)
    	   mark.setImageResource(R.drawable.smile);
       else if(result2>=20)
    	   mark.setImageResource(R.drawable.good);
       else if(result2<20)
    	   mark.setImageResource(R.drawable.warning2);
    }
}