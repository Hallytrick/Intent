package com.example.intent.ui.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.intent.R;
import com.example.intent.adapters.ProductCategoryAdapter;

import java.util.Arrays;

public class ProductCategoryActivity extends AppCompatActivity {

    String[] categoryNames = {"Clothing", "Electronics", "Furniture", "Utensils", "Toiletries"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_category);

        RecyclerView rvProductCategory= findViewById(R.id.rv_product_category);
        ProductCategoryAdapter adapter = new ProductCategoryAdapter(Arrays.asList(categoryNames));
        rvProductCategory.setLayoutManager(new LinearLayoutManager(this));
        rvProductCategory.setAdapter(adapter);
    }
}