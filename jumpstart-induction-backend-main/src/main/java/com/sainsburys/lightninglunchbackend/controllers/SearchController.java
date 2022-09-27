package com.sainsburys.lightninglunchbackend.controllers;

import com.sainsburys.lightninglunchbackend.exceptions.ProductNotFoundException;
import com.sainsburys.lightninglunchbackend.services.ProductService;
import com.sainsburys.lightninglunchbackend.services.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("search")
public class SearchController {
    private final SearchService searchService;

    public SearchController(SearchService searchService){
        this.searchService = searchService;
    }

    @GetMapping
    public ResponseEntity<?> searchProducts(@RequestParam("term") String searchTerm){
        return ResponseEntity.ok(searchService.searchProducts(searchTerm));
    }
}
