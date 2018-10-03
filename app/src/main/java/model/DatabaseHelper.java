package model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SrikanthGovindan on 27-04-2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "notes_db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
// CREATE TABLE
        sqLiteDatabase.execSQL(Note.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //Drop table if existed
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Note.TABLE_NAME);

        //Create DB again
        onCreate(sqLiteDatabase);

    }

    public long insertNote(String txtNote) {
        //get writeable db as we want to write data

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cValues = new ContentValues();
        cValues.put(Note.COLUMN_NOTE, txtNote);

        //insert row
        long id = db.insert(Note.TABLE_NAME, null, cValues);
        db.close();
        return id;
    }
}
