package com.example.ludorvai;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);
        ImageButton button_main = findViewById(R.id.back);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button_main.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
    }
}
