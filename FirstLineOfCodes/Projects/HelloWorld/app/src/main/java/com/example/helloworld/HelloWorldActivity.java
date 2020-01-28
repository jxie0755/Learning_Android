package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


// 书中写的是HelloWorldActivity, 这一版AS自动生成MainActivity类,
public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
