package com.shubham.firebaseanalyticssampleapplication;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * This class is used to create instance of FirebaseAnalytics and provide a function to send a event to server.
 *
 * @author Shubham Chauhan
 */

public class MyFirebaseAnalyticsUtil {
    private FirebaseAnalytics mFirebaseAnalytics;

    public MyFirebaseAnalyticsUtil(Context context){
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
    }

    public void sendEventToFirebaseServer(String id,String name,String contentType){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, contentType);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
