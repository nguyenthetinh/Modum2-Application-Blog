package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

//    Iterable<Category> findAllByCategory(Category category);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

}
