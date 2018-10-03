package model;

/**
 * Created by SrikanthGovindan on 27-04-2018.
 */

public class Note {
    public static final String TABLE_NAME = "brief_notes";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_TIMESTAMP = "timestamp";

    private int id;
    private String note;
    private String timeStamp;

    // CREATE table SQL QUERY

    public static final String CREATE_TABLE = "CREATE_TABLE" + TABLE_NAME + "(" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_NOTE + "TEXT," + COLUMN_TIMESTAMP + "DATETIME DEFAULT CURRENT_TIMESTAMP" + ")";

    public Note(int id) {
        this.id = id;
    }

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
