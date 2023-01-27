package com.squaretrade.category.demo.service;

import com.squaretrade.category.demo.entity.CategoryKeyword;
import com.squaretrade.category.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<String> getKeywordForCategory(Long categoryId){
        List<String> keywords = categoryRepository.findCategoryKeywordsByCategoryId(categoryId);
        return keywords;
    }
}
