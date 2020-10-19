package com.example.intent.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.intent.Constants;
import com.example.intent.R;
import com.example.intent.ui.onboarding.OnboardingActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        confirmOnBoardingFinished();
        setContentView(R.layout.activity_login);

    }

    private void confirmOnBoardingFinished() {
        SharedPreferences preferences = getSharedPreferences(Constants.PREFERENCES_NAME, MODE_PRIVATE);
        boolean onBoardingFinished = preferences.getBoolean(Constants.ONBOARDING_COMPLETE, false);
        if (!onBoardingFinished){
            startActivity(new Intent(this, OnboardingActivity.class));
            finish();
        }
    }
}