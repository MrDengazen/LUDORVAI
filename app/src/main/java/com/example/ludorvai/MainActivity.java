package com.example.ludorvai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        String styledText = "<b><font color='red'>Наши</font> <font color='black'>мероприятия</font></b>";
        TextView textView = findViewById(R.id.events_d);
        textView.setText(Html.fromHtml(styledText), TextView.BufferType.SPANNABLE);
        String styledText1 = "<b><font color='red'>Наши</font> <font color='black'>мастерклассы</font></b>";
        TextView textView1 = findViewById(R.id.class_d);
        textView1.setText(Html.fromHtml(styledText1), TextView.BufferType.SPANNABLE);
        ImageButton button_about = findViewById(R.id.about);
        ImageButton button_games = findViewById(R.id.games);
        ImageButton button_tours = findViewById(R.id.tours);
        button_about.setOnClickListener(v -> startActivity(new Intent(this, AboutActivity.class)));
        button_games.setOnClickListener(v -> startActivity(new Intent(this, GameActivity.class)));
        button_tours.setOnClickListener(v -> startActivity(new Intent(this, ToursActivity.class)));
    }
}