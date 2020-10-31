package com.example.intent.ui.list;

import androidx.lifecycle.ViewModel;

import com.example.intent.model.Product;
import com.example.intent.resourses.Products;

import java.util.Arrays;
import java.util.List;

public class ProductViewModel extends ViewModel {
    private Product product;
    private String category;

    public void setProductCategory(String category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public List<Product> getProductsList(){
        Products products = Products.getInstance();
        Product[] product = products.PRODUCT_MAP.get(category);
        return Arrays.asList(product);
    }
}
