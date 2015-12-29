package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper 
{
	
	public static final String CREATE_PROVINCE = "crate table Province ("
											   + "id integer primary key autoincrement,"
											   + "province_name text,"
											   + "province_code text)";
	
	public static final String CREATE_CITY = "crate table City ("
			   							   + "id integer primary key autoincrement,"
			   							   + "city_name text,"
			   							   + "city_code text,"
			   							   + "province_id integer)";
	public static final String CREATE_COUNTY = "crate table County ("
			   								 + "id integer primary key autoincrement,"
			   								 + "county_name text,"
			   								 + "county_code text,"
			   								 + "city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) 
	{
		super(context, name, factory, version);
	}

	public void onCreate(SQLiteDatabase db) 
	{
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		
	}
	
}
