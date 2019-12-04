package com.example.culturaladriodapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.culturaladriodapp.R;
import com.example.culturaladriodapp.contoller.HomeController;

import java.sql.SQLException;

public class HomeUser extends AppCompatActivity {

    private HomeController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);
        try {
            controller = new HomeController(this);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void voltar(View view) {
    }
}
