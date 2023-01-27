package com.squaretrade.category.demo.repository;

import com.squaretrade.category.demo.entity.CategoryKeyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryKeywordRepository extends JpaRepository<CategoryKeyword, Long> {
    @Query("SELECT k.keyword FROM CategoryKeyword k  WHERE k.category.id =:categoryId")
    List<String> findCategoryKeywordsByCategoryId(@Param ("categoryId") Long categoryId);
}


