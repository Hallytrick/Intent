package com.example.intent.ui.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.intent.R;
import com.example.intent.model.Product;
import com.example.intent.ui.list.fragment.ProductListFragment;

public class ProductActivity extends AppCompatActivity {

    public static final String EXTRA_CATEGORY = "EXTRA_CATEGORY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initToolbar();
        initFragment();
        ProductViewModel viewModel = new ViewModelProvider(this).get(ProductViewModel.class);
        String category = getIntent().getStringExtra(EXTRA_CATEGORY);
        viewModel.setProductCategory(category);
    }

    private void initToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initFragment(){
        ProductListFragment fragment = new ProductListFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment, "productListFragment");
        transaction.commit();
    }
}