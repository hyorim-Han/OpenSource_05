package com.cookandroid.project6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler; // 자동으로 넘어가게 하기 위한 함수

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        Handler hand = new Handler();

        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Title.this, LoginActivity.class); // 액티비티 지정
                startActivity(i);
                finish();
            }
        }, 2000); // 2초뒤에 자동으로 다음 액티비티로 넘어가게 설정
    }
}