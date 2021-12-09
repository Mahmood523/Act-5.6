package com.thp.spring.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.dtos.CategoryDto;
import com.thp.spring.entities.Category;
import com.thp.spring.repositories.CategoryRepository;
import com.thp.spring.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {

		
		CategoryDto categoryDtoToAdd = modelMapper.map(categoryRepository.save(modelMapper.map(categoryDto, Category.class)), CategoryDto.class);

		return categoryDtoToAdd;
	}

	@Override
	public CategoryDto getCategoryById(Long id) {
		Optional<Category> categoryRendred = categoryRepository.findById(id);
		if (categoryRendred.isPresent()) {
			return modelMapper.map(categoryRendred.get(), CategoryDto.class);

		}

		return null;

	}

	@Override
	public CategoryDto deleteCategroyById(Long id) {
		CategoryDto categoryDtoToDelete = this.getCategoryById(id);
		categoryRepository.deleteById(id);

		return categoryDtoToDelete;
	}

	@Override
	public CategoryDto updateCategoryById(CategoryDto categoryDto) {

		return addCategory(categoryDto);
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		List<Category> categories = categoryRepository.findAll();
		List<CategoryDto> categoriesDto = new ArrayList<>();
		if ( !categories.isEmpty()) {
			for (int i = 0; i < categories.size(); i++) {
				categoriesDto.add(modelMapper.map(categories.get(i), CategoryDto.class));

			}
		}

		return categoriesDto;
	}

}
