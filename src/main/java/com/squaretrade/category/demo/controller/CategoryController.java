package com.squaretrade.category.demo.controller;

import com.squaretrade.category.demo.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("/keywords/{keywordId}")
    public ResponseEntity<List<String>> getKeywordsByCategoryId(@PathVariable (value = "keywordId") Long keywordId){
        List<String> keywords = categoryService.getKeywordForCategory(keywordId);
        return ResponseEntity.ok(keywords);
    }
}
