package com.example.intent.ui.list.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.intent.R;
import com.example.intent.adapters.CartItemsAdapter;
import com.example.intent.checkout.CheckoutActivity;
import com.example.intent.model.Item;
import com.example.intent.resourses.Products;
import com.example.intent.ui.list.ProductActivity;
import com.example.intent.ui.list.ProductViewModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CartFragment extends Fragment implements View.OnClickListener {

    private ImageButton increase, decrease;
    private List<Item> items;
    private CartItemsAdapter adapter;

    public CartFragment() {
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
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        increase = view.findViewById(R.id.increase_quantity);
        decrease = view.findViewById(R.id.decrease_quantity);
        Button checkout = view.findViewById(R.id.checkout);
        RecyclerView rvCartItems = view.findViewById(R.id.rv_cart_items);
        items = getShoppingCartList();
        adapter = new CartItemsAdapter(items, requireContext());
        rvCartItems.setLayoutManager(new LinearLayoutManager(requireContext()));
        rvCartItems.setHasFixedSize(true);
        rvCartItems.setAdapter(adapter);

        checkout.setOnClickListener(this);
    }

    private List<Item> getShoppingCartList() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Set<String> serialNumbers = preferences.getStringSet("shopping_cart", new HashSet<String>());

        Products products = Products.getInstance();
        List<Item> cartItems = new ArrayList<>();
        for (String serialNumber : serialNumbers){
            int quantity = preferences.getInt(serialNumber,0);
            cartItems.add(new Item(products.getPRODUCT_HASH_MAP().get(serialNumber), quantity));
        }
        return cartItems;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.checkout:
                startActivity(new Intent(requireContext(), CheckoutActivity.class));
                ((ProductActivity)requireActivity()).finish();
                break;
        }
    }

}