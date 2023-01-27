package com.squaretrade.category.demo.service;

import com.squaretrade.category.demo.entity.Category;
import com.squaretrade.category.demo.repository.CategoryKeywordRepository;
import com.squaretrade.category.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryKeywordRepository categoryKeywordRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<String> getKeywordForCategory(Long categoryId){
        List<String> keywords = categoryKeywordRepository.findCategoryKeywordsByCategoryId(categoryId);
        return keywords;
    }

    public int getCategoryLevel(Long categoryId){
        int level =0;
        Category currentCategory = categoryRepository.findById(categoryId).orElse(null);
        while (currentCategory!=null){
            level++;
            currentCategory = currentCategory.getParentCategoryId();
        }
        return level;
    }
}
