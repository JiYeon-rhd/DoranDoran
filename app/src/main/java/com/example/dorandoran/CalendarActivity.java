package com.example.dorandoran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class CalendarActivity extends AppCompatActivity {

    public CalendarView calendarView;
    public Button day_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);


        calendarView  = findViewById(R.id.calendarView);
        day_btn = findViewById(R.id.day_btn); //우리의 하루 보기 버튼



        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() { //캘린더 뷰에서 날짜 선택시 우리의 하루 보기 버튼 생김
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                day_btn.setVisibility(View.VISIBLE);
            }
        });

        day_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent(getApplicationContext(), Cal_DayActivity.class);
                startActivity(intent);
            }
        });
    }




}