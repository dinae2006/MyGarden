package com.example.mygarden;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartUpScreen extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_screen);
        Thread thread=new Thread();
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Intent intent;
        SharedPreferences sharedPreferences=getSharedPreferences("file",MODE_PRIVATE);
        String s=sharedPreferences.getString("Login_done",null);
        if(s!=null)
            intent=new Intent(StartUpScreen.this,MainActivity.class);
        else
            intent=new Intent(StartUpScreen.this,LoginActivity.class);

        startActivity(intent);


    }
}