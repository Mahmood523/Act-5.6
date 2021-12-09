package com.thp.spring.services;

import java.util.List;

import com.thp.spring.dtos.CategoryDto;

public interface CategoryService {

	public CategoryDto addCategory(CategoryDto categoryDto);

	public CategoryDto getCategoryById(Long id);

	public CategoryDto deleteCategroyById(Long id);

	public CategoryDto updateCategoryById(CategoryDto categoryDto);

	public List<CategoryDto> getAllCategories();

}
