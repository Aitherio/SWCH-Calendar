package ca.bcit.cameronwong.calendarapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by cameronwong on 2017-11-07.
 * Represents a homescreen where you see the upcoming day's activities or checklist items.
 */
public class MainActivity extends AppCompatActivity {
    //Tag used for logging
    private static final String TAG = "MainActivity";
    //button will take you to the CalendarActivity
    private Button btnToCalendar;
    //button takes you to the Notes activity
    private Button btnToNotes;
    //button takes you to the Checklist activity
    private Button btnToChecklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //log this class startup activity in the console
        Log.d(TAG, "onCreate: Started MainActivity class.");

        btnToCalendar = (Button) findViewById(R.id.btnToCalendar);
        btnToNotes = (Button) findViewById(R.id.btnToNotes);
        btnToChecklist = (Button) findViewById(R.id.btnToChecklist);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");

        btnToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //log that this button was clicked
                Log.d(TAG, "onClick: Clicked btnToCalendar");
                Intent intent = new Intent (MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        btnToNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //log that this button was clicked
                Log.d(TAG, "onClick: Clicked btnToNotes");
                Intent intent = new Intent (MainActivity.this, ChecklistActivity.class);
                startActivity(intent);
            }
        });
    }


}
