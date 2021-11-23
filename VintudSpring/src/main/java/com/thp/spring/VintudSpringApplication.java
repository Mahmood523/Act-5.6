package com.thp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication


@EnableAutoConfiguration
@EntityScan(basePackages = {"com.thp.spring.entities"})
@ComponentScan(basePackages={"com.thp.spring.Controllers",
		"com.thp.spring.servicesImpl","com.thp.spring.mapper"})
@EnableJpaRepositories(basePackages={"com.thp.spring.repositories"})
@EnableTransactionManagement
public class VintudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VintudSpringApplication.class, args);
	}

}
