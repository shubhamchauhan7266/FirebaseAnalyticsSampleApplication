package com.shubham.firebaseanalyticssampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity class is used to show Event Button.
 *
 * @author Shubham Chauhan
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MyFirebaseAnalyticsUtil mMyFirebaseAnalyticsUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyFirebaseAnalyticsUtil = new MyFirebaseAnalyticsUtil(this);

        findViewById(R.id.bt_event_1).setOnClickListener(this);
        findViewById(R.id.bt_event_2).setOnClickListener(this);
        findViewById(R.id.bt_event_3).setOnClickListener(this);
        findViewById(R.id.bt_event_4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_event_1:
                mMyFirebaseAnalyticsUtil.sendEventToFirebaseServer("1", "Event 1", "Button");
                break;

            case R.id.bt_event_2:
                mMyFirebaseAnalyticsUtil.sendEventToFirebaseServer("2", "Event 2", "Image");
                break;

            case R.id.bt_event_3:
                mMyFirebaseAnalyticsUtil.sendEventToFirebaseServer("3", "Event 3", "Button");
                break;

            case R.id.bt_event_4:
                mMyFirebaseAnalyticsUtil.sendEventToFirebaseServer("4", "Event 4", "Button");
                break;

            default:
                break;
        }
    }
}
