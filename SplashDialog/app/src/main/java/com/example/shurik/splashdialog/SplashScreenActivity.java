package com.example.shurik.splashdialog;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shurik on 03.11.2017.
 */

public class SplashScreenActivity extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        activity    = this;

        Thread logoThread   = new Thread(){
            public void run(){
                try {

                    int logoTimer   = 0;
                    while (logoTimer < 3000){
                        sleep(100);
                        logoTimer += 100;
                    }
                    startActivity(new Intent(activity, MainActivity.class));

                } catch (InterruptedException e){

                    e.printStackTrace();

                }finally {

                    finish();

                }
            }

        };

        logoThread.start();


    }

}
