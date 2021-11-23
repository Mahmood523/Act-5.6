package com.thp.spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.dtos.CategoryDto;
import com.thp.spring.services.CategoryService;

@RestController
@RequestMapping("/gestionnaireCategories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "/listeCategories")
	public List<CategoryDto> getAllCategories() {
		return categoryService.getAllCategories();

	}

	@PostMapping(value = "/addCategory")
	public CategoryDto aadCategory(@RequestBody CategoryDto categoryDto) {
		return categoryService.addCategory(categoryDto);

	}

	@DeleteMapping(value = "/deleteCategory/{id}")
	public CategoryDto deleteCategory(@PathVariable Long id) {
		return categoryService.deleteCategroyById(id);

	}

	@GetMapping(value = "/findCategory/{id}")
	public CategoryDto getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);

	}

	@PutMapping(value = "/updateCategory/{id}")
	public CategoryDto updateCategoryById(@RequestBody CategoryDto categoryDto) {
		return categoryService.updateById(categoryDto);

	}
}
