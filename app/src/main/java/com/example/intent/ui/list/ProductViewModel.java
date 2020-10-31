package com.example.intent.ui.list;

import androidx.lifecycle.ViewModel;

import com.example.intent.model.Item;
import com.example.intent.model.Product;
import com.example.intent.resourses.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductViewModel extends ViewModel {
    private Product product;
    private String category;
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItem(Item item) {
        items.add(item);
    }

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
