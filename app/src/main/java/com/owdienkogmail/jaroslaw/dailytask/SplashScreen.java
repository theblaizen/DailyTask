/*
 * Copyright (c) 2016. Jaroslaw Owdienko
 */

package com.owdienkogmail.jaroslaw.dailytask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        try {
            Thread.sleep(650);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(intent);
        finish();
    }
}
