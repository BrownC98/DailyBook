package com.teamnova.bookday.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.teamnova.bookday.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 카카오 api 사용을 위한 디버그 키 해시 값 확인
//        Log.d("TAG", "onCreate: " + Utility.INSTANCE.getKeyHash(this));

    }
}