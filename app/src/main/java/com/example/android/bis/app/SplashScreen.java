package com.example.android.bis.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by tommy on 4/12/15.
 */
public class SplashScreen extends Activity{
    private static int splashInterval = 2000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent i = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(i);
                //jeda selesai Splashscreen

                this.finish();

            }

            private void finish() {

            }
        }, splashInterval);

    };

}