package com.example.intent.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.intent.R;
import com.example.intent.model.Item;

import java.util.ArrayList;
import java.util.List;

public class CartItemsAdapter extends RecyclerView.Adapter<CartItemsAdapter.CartItemsViewHolder> {

    private List<Item> mCartItems = new ArrayList<>();
    private static Context mContext;

    public CartItemsAdapter(List<Item> cartItems, Context context) {
        this.mCartItems = cartItems;
        this.mContext = context;
    }

    public void updateCartItems(List<Item> cartItems){
        mCartItems.clear();
        mCartItems.addAll(cartItems);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CartItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cart_item, parent, false);
        return new CartItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartItemsViewHolder holder, int position) {
        Item cartItem = mCartItems.get(position);
        holder.bind(cartItem);
    }

    @Override
    public int getItemCount() {
        return mCartItems.size();
    }

    static class CartItemsViewHolder extends RecyclerView.ViewHolder {
        private TextView title, price, quantity;
        private ImageView image;
        public CartItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.product_title);
            price = itemView.findViewById(R.id.product_price);
            quantity = itemView.findViewById(R.id.product_quantity);
            image = itemView.findViewById(R.id.product_image);
        }

        public void bind(Item cartItem) {
            title.setText(cartItem.getProduct().getTitle());
            price.setText(String.valueOf(cartItem.getProduct().getPrice()));
            title.setText(String.valueOf(cartItem.getQuantity()));
            Glide.with(mContext)
                    .load(cartItem.getProduct().getImage())
                    .into(image);
        }
    }
}
