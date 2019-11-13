package com.example.timecapsule;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;


public class ActivitySplash extends FragmentActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(ActivitySplash.this,MapsActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
