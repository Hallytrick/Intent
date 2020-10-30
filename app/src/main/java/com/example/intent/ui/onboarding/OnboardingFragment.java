package com.example.intent.ui.onboarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent.Constants;
import com.example.intent.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class OnboardingFragment extends Fragment {

    private TextView tvDescription;
    private ImageView imageView;
    private int position;

    private String[] descriptions = {
            "All you need to buy/sell online is\nsetup your account and start buying and selling",
            "Start buying/selling items",
            "Pay for bought goods using available payment methods.",
    };

    private int[] images = {
            R.drawable.account,
            R.drawable.purchases,
            R.drawable.paying
    };

    public OnboardingFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null){
            position = args.getInt(Constants.EXTRA_POSITION, 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_onboarding, container, false);

        tvDescription = view.findViewById(R.id.description);
        tvDescription.setText(descriptions[position]);

        imageView = view.findViewById(R.id.imageView);
        imageView.setBackgroundResource(images[position]);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}