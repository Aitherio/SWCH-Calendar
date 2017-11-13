package ca.bcit.cameronwong.calendarapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

/**
 * Created by cameronwong on 2017-11-07.
 */

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";

    private CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        Log.d(TAG, "onCreate: Started CalendarActivity class");

        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/" + dayOfMonth;
                Log.d(TAG, "onSelectedDayChange: ClickedDate: " + date);

                Intent intent = new Intent(CalendarActivity.this, ChecklistActivity.class);
                startActivity(intent);
            }
        });

        Button btnReturnToMain = (Button) findViewById(R.id.btnToMainFroCalendar);

        btnReturnToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnReturnToMain");
                Intent intent = new Intent (CalendarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
