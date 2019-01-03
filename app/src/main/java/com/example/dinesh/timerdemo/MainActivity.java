package com.example.dinesh.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                //countdown for everysecond
                //we write code which is required for functioning in everysecond
            }

            @Override
            public void onFinish() {
                //countdown fnishes
                //we write particular code which is required after finishing of code
            }
        }.start();

       /*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this,1000);
                Log.i("Runnable has run ","second must have passed");
            }
        };
        handler.post(run);
        */
    }
}
