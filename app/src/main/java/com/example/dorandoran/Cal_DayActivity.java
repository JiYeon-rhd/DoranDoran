package com.example.dorandoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cal_DayActivity extends AppCompatActivity {

    ImageView add_schedule_btn;
    ImageView add_memory_btn;
    ImageView add_game_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_day);

        add_schedule_btn = findViewById(R.id.add_schedule_btn);
        add_schedule_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent(getApplicationContext(), Cal_Schedule_Writing.class);
                startActivity(intent);
            }
        });

        add_memory_btn = findViewById(R.id.add_memory_btn);
        add_memory_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent(getApplicationContext(), Cal_Memory_Writing.class);
                startActivity(intent);
            }
        });

        add_game_btn = findViewById(R.id.add_game_btn);
        add_game_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent(getApplicationContext(), Cal_Game_Writing.class);
                startActivity(intent);
            }
        });
    }
}