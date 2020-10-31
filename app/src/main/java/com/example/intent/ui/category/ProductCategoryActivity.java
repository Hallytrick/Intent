package com.example.intent.ui.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.intent.R;
import com.example.intent.adapters.ProductCategoryAdapter;
import com.example.intent.ui.list.ProductActivity;

import java.util.Arrays;

public class ProductCategoryActivity extends AppCompatActivity implements ProductCategoryAdapter.OnItemClickListener {

    String[] categoryNames = {"Clothing", "Smartphones", "Televisions", "Furniture", "Utensils", "Toiletries"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_category);

        initToolbar();
        RecyclerView rvProductCategory= findViewById(R.id.rv_product_category);
        ProductCategoryAdapter adapter = new ProductCategoryAdapter(Arrays.asList(categoryNames));
        adapter.setOnItemClickListener(this);
        rvProductCategory.setLayoutManager(new LinearLayoutManager(this));
        rvProductCategory.setAdapter(adapter);
    }

    private void initToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onItemClick(int position) {
        String category;
        switch (position){
            case 0:
                category = "Clothing";
                break;
            case 1:
                category = "Smartphone";
                break;
            case 2:
                category = "Television";
                break;
            case 3:
                category = "Furniture";
                break;
            case 4:
                category = "Utensil";
                break;
            case 5:
                category = "Toiletry";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }

        Intent intent = new Intent(this, ProductActivity.class);
        intent.putExtra(ProductActivity.EXTRA_CATEGORY, category);
        startActivity(intent);
    }
}