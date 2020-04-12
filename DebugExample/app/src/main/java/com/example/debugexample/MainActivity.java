package com.example.debugexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tomato = "Tomato";

        Log.e("MainActivity : ", tomato);

        //안드로이드의 나이
        int a = 10;

        //로그를 찍었다
        Log.e("MainActivity : ", String.valueOf(a));
    }
}
