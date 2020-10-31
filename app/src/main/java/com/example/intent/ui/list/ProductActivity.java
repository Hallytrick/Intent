package com.example.intent.ui.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.intent.R;
import com.example.intent.model.Item;
import com.example.intent.model.Product;
import com.example.intent.ui.list.fragment.CartFragment;
import com.example.intent.ui.list.fragment.ProductDetailsFragment;
import com.example.intent.ui.list.fragment.ProductListFragment;

import java.util.HashSet;
import java.util.Set;

public class ProductActivity extends AppCompatActivity {

    public static final String EXTRA_CATEGORY = "EXTRA_CATEGORY";
    private ProductViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initToolbar();
        initFragment();
        ImageView cart = findViewById(R.id.cart);
        viewModel = new ViewModelProvider(this).get(ProductViewModel.class);
        String category = getIntent().getStringExtra(EXTRA_CATEGORY);
        viewModel.setProductCategory(category);

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inflateCartFragment();
            }
        });
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

    public void inflateProductDetailsFragment(){
        ProductDetailsFragment fragment = new ProductDetailsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment, "productDetailsFragment");
        transaction.addToBackStack("productDetailsFragment");
        transaction.commit();
    }

    public void inflateCartFragment(){
        CartFragment fragment = new CartFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment, "cartFragment");
        transaction.commit();
    }

    public void addToCart(Product product, int quantity){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();

        Set<String> serialNumbers = preferences.getStringSet("shopping_cart", new HashSet<String>());
        serialNumbers.add(String.valueOf(product.getSerialNo()));
        editor.putStringSet("shopping_cart", serialNumbers);
        editor.apply();

        int currentQuantity = preferences.getInt(String.valueOf(product.getSerialNo()), 0);
        editor.putInt(String.valueOf(product.getSerialNo()), (currentQuantity + quantity));
        editor.apply();

        Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show();
    }
}