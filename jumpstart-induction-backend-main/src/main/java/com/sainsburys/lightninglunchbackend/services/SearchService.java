package com.sainsburys.lightninglunchbackend.services;

import com.sainsburys.lightninglunchbackend.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private final ProductService productService;

    public SearchService(ProductService productService){this.productService = productService;}

    public List<Product> searchProducts(String searchTerm) {
        return productService.getProducts().stream()
                .filter((product -> product.getName().toLowerCase().contains(searchTerm.toLowerCase())))
                .toList();
    }


}
