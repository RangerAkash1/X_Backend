package com.example.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import javax.persistence.EntityManagerFactory;


@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.example.Backend"})
@EntityScan(basePackages = {"com.example.Backend.entity"})
@EnableJpaRepositories(basePackages = {"com.example.Backend.repository"})
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
