package com.example.intent.ui.onboarding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.intent.Constants;
import com.example.intent.R;
import com.example.intent.adapters.OnboardingAdapter;
import com.example.intent.ui.login.LoginActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class OnboardingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        Button skip = findViewById(R.id.skip_button);
        final Button okay = findViewById(R.id.okay_button);
        skip.setOnClickListener(this);
        okay.setOnClickListener(this);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
            }
        }).attach();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 2)
                    okay.setVisibility(View.VISIBLE);
                else
                    okay.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.skip_button:
            case R.id.okay_button:
                finishOnBoarding();
                break;
        }
    }

    private void finishOnBoarding() {
        SharedPreferences preferences = getSharedPreferences(Constants.PREFERENCES_NAME, MODE_PRIVATE);
        preferences.edit().putBoolean(Constants.ONBOARDING_COMPLETE, true).apply();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}