package ca.bcit.cameronwong.calendarapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by cameronwong on 2017-11-14.
 * Represents a notepad.
 */

public class NotesActivity extends AppCompatActivity {
    //Tag used for logging
    private static final String TAG = "NotesAcitivty";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_layout);
        //log this class startup activity in the console
        Log.d(TAG, "onCreate: Started NotesActivity class");
    }
}

