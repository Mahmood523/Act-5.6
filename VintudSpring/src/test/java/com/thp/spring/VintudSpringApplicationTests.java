package com.thp.spring;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thp.spring.dtos.CategoryDto;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = VintudSpringApplication.class )
@AutoConfigureMockMvc

class VintudSpringApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void aadCategory() throws Exception {
		
		mockMvc.perform( MockMvcRequestBuilders
			      .post("/gestionnaireCategories/addCategory")
			      .content(asJsonString(new CategoryDto(null, "Vest", "old")))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isCreated())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.[0].categoryId").exists());
	}

	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	
	
	
	@Test
	public void getCategoryById() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
			      .get("/gestionnaireCategories/findCategory/{id}", 11)
			      .accept(MediaType.APPLICATION_JSON))
			      .andDo(print())
			      .andExpect(status().isOk())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.categoryId").value(11));
	}
	
	
	@Test
	public void getAllCategories() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
			      .get("/gestionnaireCategories/listeCategories")
			      .accept(MediaType.APPLICATION_JSON))
			      .andDo(print())
			      .andExpect(status().isOk())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.[*]").exists())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.[*].categoryId").exists());
	}
	
	
	@Test
	public void updateCategoryById() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
			      .put("/gestionnaireCategories/updateCategory/{id}", 24)
			      .content(asJsonString(new CategoryDto(24L, "Veste", "m9at3a")))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Veste"))
			      .andExpect(MockMvcResultMatchers.jsonPath("$.description").value("m9at3a"))
			      .andExpect(MockMvcResultMatchers.jsonPath("$.categoryId").value("24")	  );
	}
	
	
	@Test
	public void deleteCategory() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders.delete("/gestionnaireCategories/deleteCategory/{id}", 12) )
        .andExpect(status().isAccepted());
	}
}
