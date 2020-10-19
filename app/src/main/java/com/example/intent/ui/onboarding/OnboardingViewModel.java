package com.example.intent.ui.onboarding;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.intent.Constants;
import com.example.intent.ui.login.LoginActivity;

import static android.content.Context.MODE_PRIVATE;

public class OnboardingViewModel extends AndroidViewModel {
    private Application application;
    private boolean onBoardingFinished = false;

    public OnboardingViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
    }

    private void finishOnBoarding(){
        SharedPreferences preferences = application.getSharedPreferences(Constants.PREFERENCES_NAME, MODE_PRIVATE);
        preferences.edit().putBoolean(Constants.ONBOARDING_COMPLETE, true).apply();
        onBoardingFinished = true;
    }
}
