package com.devarshi.tmer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class DbHadler extends SQLiteOpenHelper {
    public DbHadler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE Task (sno INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, task TEXT)";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String drop = String.valueOf("DROP TABLE IF EXISTS");
        db.execSQL(drop, new String[]{"Task"});
        onCreate(db);
    }

    public void addTask(String str) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("task",new String(str));
        long k = db.insert("Task",null, values);
        db.close();
    }

    public String getTask(int pos) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("Task", new String[]{"task"}, "sno=?", new String[]{String.valueOf("sno")}, null, null, null);
        if (cursor != null) {
              return  cursor.getString(pos);
        } else {
            return null;
        }
    }

    public int getCount() {
        String countQuery = "SELECT  * FROM Task";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }
}
