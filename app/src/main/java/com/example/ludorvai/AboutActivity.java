package com.example.ludorvai;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_museum);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageButton button_back = findViewById(R.id.back);
        button_back.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));


    }
}
