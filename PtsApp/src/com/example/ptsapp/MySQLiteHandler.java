package com.example.ptsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MySQLiteHandler {
	
	ProductDBHelper helper;
	SQLiteDatabase db;
	
	public MySQLiteHandler(Context ctx){
		
		
		helper = new ProductDBHelper(ctx);
	}
	// �����ͺ��̽� open
	public static MySQLiteHandler open(Context ctx){
		return new MySQLiteHandler(ctx);
	}
	//�����ͺ��̽� close
	public  void close(){
		helper.close();
	}
	
	//������ ����
	
	public void insert( String name, int sets, String Day){
		
		db = helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("sets", sets);
		values.put("Day", Day);
		db.insert("name", null, values);
	}
   
   //������ ����
	public void update(String id, String name, String sets, String Day){
		
		db = helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("sets", sets);
		values.put("Day", Day);
		db.update("name", values, "_id = ?", new String[]{ id });
		
	}
	//������ ����
	public void delete(String id){
		db = helper.getWritableDatabase();
		db.delete("name", " _id = ? ",  new String[]{ id } );
	}
	
	//������ ��ȸ
	public Cursor selectAll(){
		
		db = helper.getReadableDatabase();
		Cursor c = db.query("name", null, null, null, null, null, null);
	    return c;
	}
	
	//_id ��ġ ������ ���
	public Cursor  selectById(String _id){
			
			db = helper.getReadableDatabase();
			Cursor c = db.query("name", null, "_id = ?", new String[]{ _id }, null, null, null);
	    	return c;
	}//end select
	
	
}






