package com.example.shopping.controller;

import com.example.shopping.model.Product;
import com.example.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public List<Product> getAllShops() {
        List<Product> productList = this.productService.getAllProducts();
        return productList;
    }

    @GetMapping("/{name}")
    public Product getShopByName(@PathVariable String name) {
        Product product = this.productService.getProductByName(name);
        return product;
    }

    @PostMapping()
    public Product createShop(@RequestBody Product product) {
        Product createProduct = this.productService.createProduct(product);
        return createProduct;
    }

    @PutMapping("/{name}")
    public Product updateShop(@PathVariable String name, @RequestBody Product product) {
        Product updateProduct = this.productService.updateProduct(name, product);
        return updateProduct;
    }

    @DeleteMapping("/{name}")
    public Product deleteShop(@PathVariable String name) {
        Product deleteProduct = this.productService.deleteProduct(name);
        return deleteProduct;
    }


}
