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
import com.thp.spring.mapper.EntityDtoMapper;
import com.thp.spring.repositories.CategoryRepository;
import com.thp.spring.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	private EntityDtoMapper entityDtoMapper;

	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {
		
		Category category =entityDtoMapper.categoryDtoToEntity(categoryDto);
		Category categoryToAdd = categoryRepository.save(category);
		CategoryDto categoryDtoToAdd = entityDtoMapper.categoryEntityToDto(categoryToAdd);
		
		return categoryDtoToAdd ;
	}

	@Override
	public CategoryDto getCategoryById(Long id) {
		Optional<Category> categoryRendred =  categoryRepository.findById(id) ;
		CategoryDto categoryDtoRendred = entityDtoMapper.categoryEntityToDto(categoryRendred.get()) ;
		
		return categoryDtoRendred;

		
	}

	@Override
	public CategoryDto deleteCategroyById(Long id) {
        CategoryDto categoryDtoToDelete = this.getCategoryById(id);
        categoryRepository.deleteById(id);
        
        
		return categoryDtoToDelete;
	}

	@Override
	public CategoryDto updateById(Long id,CategoryDto categoryDto) {
 
		//Optional<Category> categoryRendred =categoryRepository.findById(id);
		
		categoryDto.setCategoryId(id);;
		
		
		return addCategory(categoryDto) ;
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		List<Category> categories=categoryRepository.findAll();
		List<CategoryDto> categoriesDto=new ArrayList<CategoryDto>();
		for (int i=0; i< categories.size();i++) 
		{
			categoriesDto.add(entityDtoMapper.categoryEntityToDto(categories.get(i)));
	
			
		}

		return categoriesDto;
	}

}
