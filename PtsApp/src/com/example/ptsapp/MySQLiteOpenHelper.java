package com.example.ptsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

	public MySQLiteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
        
		//테이블 생성 코드
		String sql = "create table student ( _id integer primary key autoincrement ," +
				" name text , age integer , address text )";
        db.execSQL(sql);
        
        String sss = "insert into student ( name, age ,address ) values ( '홍길동' , 18,'서울')";
        db.execSQL(sss);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		//테이블 삭제 코드
		String sql = "drop table if exists student";
		db.execSQL(sql);
		
		onCreate(db);
	}

}
