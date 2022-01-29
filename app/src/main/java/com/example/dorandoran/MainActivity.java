package com.example.dorandoran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView fullcal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      fullcal = findViewById(R.id.fullCal);
      fullcal.setOnClickListener(new View.OnClickListener(){  //전체화면 보기 선택하면 캘린더 화면으로 전환
          @Override
          public void onClick(View v) {
              Intent intent  =  new Intent(getApplicationContext(), CalendarActivity.class);
              startActivity(intent);
          }
      });

    }
}