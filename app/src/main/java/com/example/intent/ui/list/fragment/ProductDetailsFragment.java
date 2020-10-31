package com.example.intent.ui.list.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.intent.R;
import com.example.intent.model.Product;
import com.example.intent.ui.list.ProductActivity;
import com.example.intent.ui.list.ProductViewModel;

public class ProductDetailsFragment extends Fragment {

    public ProductDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ProductViewModel viewModel = new ViewModelProvider(requireActivity()).get(ProductViewModel.class);
        final Product product = viewModel.getProduct();
        TextView productTitle = view.findViewById(R.id.product_title);
        productTitle.setText(product.getTitle());
        TextView productPrice = view.findViewById(R.id.product_price);
        productPrice.setText(String.valueOf(product.getPrice()));
        TextView productDescription= view.findViewById(R.id.product_description);
        productDescription.setText(product.getDescription());
        ImageView productImage = view.findViewById(R.id.product_image);
        Glide.with(requireContext())
                .load(product.getImage())
                .into(productImage);

        Button addToCart = view.findViewById(R.id.add_to_cart);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ProductActivity)requireActivity()).addToCart(product, 1);
            }
        });
    }
}