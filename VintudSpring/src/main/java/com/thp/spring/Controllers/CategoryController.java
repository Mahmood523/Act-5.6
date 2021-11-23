package com.thp.spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.thp.spring.dtos.CategoryDto;
import com.thp.spring.mapper.EntityDtoMapper;
import com.thp.spring.services.CategoryService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/gestionnaireCategories")
@Component
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	EntityDtoMapper entityDtoMapper;

	@GetMapping(value = "/listeCategories")
	public List<CategoryDto> getAllCategories() {
		try {
			List<CategoryDto> allCategories = categoryService.getAllCategories();
			return allCategories;
		} catch (Exception E) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, E.getMessage());

		}

	}

	@PostMapping(value = "/addCategory")
	public CategoryDto aadCategory(@RequestBody CategoryDto categoryDto) {
		try {
			CategoryDto categoryDtoAdded = categoryService.addCategory(categoryDto);
			return categoryDtoAdded;
		} catch (Exception E) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, E.getMessage());
		}
	}

	@DeleteMapping(value = "/deleteCategory/{id}")
	public CategoryDto deleteCategory(@PathVariable Long id) {
		try {
			return categoryService.deleteCategroyById(id);

		} catch (Exception E) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, E.getMessage());
		}
	}

	@GetMapping(value = "/findCategory/{id}")
	public CategoryDto getCategoryById(@PathVariable Long id) {
		try {
			return categoryService.getCategoryById(id);
		} catch (Exception E) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, E.getMessage());
		}
	}

	@PutMapping(value = "/updateCategory/{id}")
	public CategoryDto updateCategoryById(@PathVariable Long id,@RequestBody CategoryDto categoryDto) {
		try {
			return categoryService.updateById(id,categoryDto);
		} catch (Exception E) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, E.getMessage());
		}
	}
}
