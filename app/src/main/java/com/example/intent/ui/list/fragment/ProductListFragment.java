package com.example.intent.ui.list.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.intent.R;
import com.example.intent.adapters.ProductListAdapter;
import com.example.intent.model.Product;
import com.example.intent.ui.list.ProductViewModel;

import java.util.ArrayList;
import java.util.List;

public class ProductListFragment extends Fragment {

    public static final String EXTRA_PRODUCT_CATEGORY = "EXTRA_PRODUCT_CATEGORY";

    public ProductListFragment() {
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
        return inflater.inflate(R.layout.fragment_product_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ProductViewModel viewModel = new ViewModelProvider(requireActivity()).get(ProductViewModel.class);
        List<Product> products = viewModel.getProductsList();
        RecyclerView productList = view.findViewById(R.id.rv_procucts);
        ProductListAdapter adapter = new ProductListAdapter(requireContext(), products);
        productList.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        productList.setHasFixedSize(true);
        productList.setAdapter(adapter);
    }
}