package com.example.shopping.service;

import com.example.shopping.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList;

    public ProductService() {
        this.productList = new ArrayList<>();
        this.productList.add(new Product("Teva", 2200, 20, "Perfect!"));
        this.productList.add(new Product("Dr.martin", 6200, 20, "Very Nice"));
        this.productList.add(new Product("Reebok", 1800, 20, "Very Bok"));

    }

    public List<Product> getAllProducts() {
        return this.productList;
    }

    public Product getProductByName(String name) {
        for (Product product : this.productList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }


    public Product createProduct(Product product) {
        this.productList.add(product);
        return product;
    }

    public Product updateProduct(String name, Product product) {
        for (Product updatedProduct : this.productList) {
            if (name.equals(updatedProduct.getName())) {
                updatedProduct.setPrice(product.getPrice());
                updatedProduct.setStock(product.getStock());
                updatedProduct.setDescription(product.getDescription());
                return updatedProduct;
            }
        }
        return null;
    }

    public Product deleteProduct(String name) {
        for (Product deleteProduct : this.productList) {
            if (name.equals(deleteProduct.getName())) {
                this.productList.remove(deleteProduct);
                return deleteProduct;
            }
        }
        return null;
    }

}
