package com.charmi.mytimetable.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class TaskDbthurs  extends SQLiteOpenHelper {


    public TaskDbthurs(Context context) {
        super(context, TaskContractThurs.DB_NAME, null, TaskContractThurs.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractThurs.TaskEntry.TABLE + " ( " +
                TaskContractThurs.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractThurs.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractThurs.TaskEntry.TABLE);
        onCreate(db);
    }
}
