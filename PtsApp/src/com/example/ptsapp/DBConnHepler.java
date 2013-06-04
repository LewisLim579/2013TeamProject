package com.example.ptsapp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import android.R.bool;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

public class DBConnHepler extends SQLiteOpenHelper{
	static final String DB_NAME ="pts.db";
	static final String PACKAGE_NAME = "com.example.ptsapp";
	public Context context = null;
	
	
	public DBConnHepler(Context context) {
		 super(context, DB_NAME, null, 1);
		 this.context = context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		boolean bolResult = isCheckDB(context);
		Log.d("PtsApp", "DB CHECK = "+bolResult);
		
		if(!bolResult){
			copyDatabase(context);
//			createDatabase(db);
//			insertDatabase(db);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w("DatabaseHandler", "Version mismatch : "+oldVersion+" to "+newVersion);
		db.execSQL("DROP TABLE IF EXISTS MOVIE");
		onCreate(db);
	}

	public String getUrl(String name){
		String url = "";
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery("select url from movie where name = '"+name+"'", null);
		 // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
        	do{
        		url = cursor.getString(0);
        	}while(cursor.moveToNext());
        }
        Log.w("PtsApp", "MOVIE URL :"+url);
        return url;
	}
	
	public boolean isCheckDB(Context context){
	      String filePath = "/data/data/" + PACKAGE_NAME + "/databases/" + DB_NAME;
	      File file = new File(filePath);
	       
	       if (file.exists()) {
	           return true;
	       }
	        
	       return false;
	     
	}
	
	
	public void copyDatabase(Context context){
		Log.d("PtsApp","Method = copyDatabase");
		AssetManager asset = context.getAssets();
		String folderPath =  "/data/data/" + PACKAGE_NAME + "/databases/";
		String filePath = "/data/data/" + PACKAGE_NAME + "/databases/" + DB_NAME;
		
		File folder = new File(folderPath);
		File file = new File(filePath);
		
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
				
		try {
			InputStream is = asset.open("db/"+DB_NAME);
			 BufferedInputStream bis = new BufferedInputStream(is);
			 if (folder.exists()) {
             }else{
                     folder.mkdirs();
             }

             if (file.exists()) {
                     file.delete();
                     file.createNewFile();
             }

             fos = new FileOutputStream(file);
             bos = new BufferedOutputStream(fos);
             int read = -1;
             byte[] buffer = new byte[1024];
             while ((read = bis.read(buffer, 0, 1024)) != -1) {
                     bos.write(buffer, 0, read);
             }

             bos.flush();
             bos.close();
             fos.close();
             bis.close();
             is.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
