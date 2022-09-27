package com.sainsburys.lightninglunchbackend.controllers;

import com.sainsburys.lightninglunchbackend.exceptions.ProductNotFoundException;
import com.sainsburys.lightninglunchbackend.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("{productId}")
    public ResponseEntity<?> getProductDetails(@PathVariable("productId") String productId) {
        try {
            return ResponseEntity.ok(productService.getProduct(productId));
        } catch (ProductNotFoundException e) {
            return ResponseEntity.status(404).body(productId + " not found");
        }
    }
}
