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
import com.example.intent.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder> {

    private Context context;
    private List<Product> products = new ArrayList<>();

    public ProductListAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        return new ProductListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListViewHolder holder, int position) {
        Product product = products.get(position);
        holder.productPrice.setText(String.valueOf(product.getPrice()));
        holder.productTitle.setText(product.getTitle());
        Glide.with(context)
                .load(product.getImage())
                .into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ProductListViewHolder extends RecyclerView.ViewHolder {
        TextView productTitle, productPrice;
        ImageView productImage;
        public ProductListViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_title);
            productPrice = itemView.findViewById(R.id.product_price);
        }
    }
}
