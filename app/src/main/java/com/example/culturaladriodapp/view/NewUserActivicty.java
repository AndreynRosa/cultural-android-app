package com.example.culturaladriodapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.culturaladriodapp.R;
import com.example.culturaladriodapp.contoller.NewUserController;

import java.sql.SQLException;

public class NewUserActivicty extends AppCompatActivity {

    private NewUserController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_activicty);
        controller = new NewUserController(this);
    }

    public void voltar(View view) {
        controller.votar();
    }

    public void salvar(View view) throws SQLException {
        controller.salvar();
    }
}
