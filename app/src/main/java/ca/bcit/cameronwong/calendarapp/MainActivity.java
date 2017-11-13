package ca.bcit.cameronwong.calendarapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button btnToCalendar;
    private Button btnToNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started.");

        btnToCalendar = (Button) findViewById(R.id.btnToCalendar);
        btnToNotes = (Button) findViewById(R.id.btnToNotes);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");

        btnToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnToCalendar");
                Intent intent = new Intent (MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        btnToNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnToNotes");
                Intent intent = new Intent (MainActivity.this, ChecklistActivity.class);
                startActivity(intent);
            }
        });
    }


}
