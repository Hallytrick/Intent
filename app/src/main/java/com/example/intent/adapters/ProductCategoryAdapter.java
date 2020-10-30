package com.example.intent.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intent.R;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryAdapter.ProductCategoryViewHolder> {
    private List<String> categoryName = new ArrayList<>();

    public ProductCategoryAdapter(List<String> categoryName) {
        this.categoryName = categoryName;
    }

    @NonNull
    @Override
    public ProductCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new ProductCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCategoryViewHolder holder, int position) {
        holder.tvCategoryName.setText(categoryName.get(position));
    }

    @Override
    public int getItemCount() {
        return categoryName.size();
    }

    static class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCategoryName;
        public ProductCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCategoryName = itemView.findViewById(R.id.category_name);
        }
    }
}
