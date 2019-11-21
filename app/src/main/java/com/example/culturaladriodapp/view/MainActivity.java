package com.example.culturaladriodapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.culturaladriodapp.R;
import  com.example.culturaladriodapp.contoller.MainController;
public class MainActivity extends AppCompatActivity {

    private  MainController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new MainController(this);
    }

    public void newUser(View view) {
        controller.newUser();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        controller.onActivityResult(requestCode, resultCode, data);
    }

    public void login(View view) {
        controller.login();
    }
}
