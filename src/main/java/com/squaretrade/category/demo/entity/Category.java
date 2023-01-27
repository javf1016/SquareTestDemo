package com.squaretrade.category.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="name", nullable = false)
    public String name;

    @ManyToOne
    @JoinColumn(name="parent_category_id")
    public Category parentCategoryId;

    @OneToMany(mappedBy = "parentCategoryId", cascade = CascadeType.ALL)
    public List<Category> subCategories = new ArrayList<>();


    public Category() {
    }

    public Category(String name, Category parentCategory, List<Category> subCategories) {
        this.name = name;
        this.parentCategoryId = parentCategory;
        this.subCategories = subCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Category parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }
}
