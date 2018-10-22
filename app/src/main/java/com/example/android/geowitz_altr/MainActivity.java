package com.example.android.geowitz_altr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSetAlarmButton;
    private Button mReminderButton;
    private Button mRestrictUsageButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSetAlarmButton = (Button) findViewById(R.id.set_alarm_button);
        mReminderButton = (Button) findViewById(R.id.reminder_button);
        mRestrictUsageButton = (Button) findViewById(R.id.restrict_usage_button);

        mSetAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
