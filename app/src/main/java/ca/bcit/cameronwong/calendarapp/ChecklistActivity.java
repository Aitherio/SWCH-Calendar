package ca.bcit.cameronwong.calendarapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by cameronwong on 2017-11-08.
 * Represents a checklist.
 */

public class ChecklistActivity extends AppCompatActivity {
    //Tag used for logging
    private static final String TAG = "ChecklistActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist_layout);
        //log this class startup activity in the console
        Log.d(TAG, "onCreate: Started ChecklistActivity class");

        //returns you to the MainActivity from the ChecklistActivity
        Button btnReturnToMain = (Button) findViewById(R.id.btnToMainFroChecklist);
        btnReturnToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //log that this button was clicked
                Log.d(TAG, "onClick: Clicked btnReturnToMain");
                Intent intent = new Intent (ChecklistActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
