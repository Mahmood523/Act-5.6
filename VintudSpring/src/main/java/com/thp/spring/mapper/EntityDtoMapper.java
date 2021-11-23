package com.thp.spring.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thp.spring.dtos.CategoryDto;
import com.thp.spring.entities.Category;

@Configuration
public class EntityDtoMapper {
	
	@Bean
	public ModelMapper EntityDtoMapper() {
		return new ModelMapper();
		
	}
	
	@Autowired 
	private ModelMapper modelMapper;
	
	// convert DTO category to entity category
	
		public Category categoryDtoToEntity(CategoryDto categoryDto) {	
			return modelMapper.map(categoryDto,Category.class) ;
		}
		
    // convert category entity to dto category
		
		public CategoryDto categoryEntityToDto(Category category) {	
			return modelMapper.map(category,CategoryDto.class) ;
		}

}
