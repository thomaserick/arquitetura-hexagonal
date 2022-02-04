package com.tef.arqhexagonal;

import com.tef.arqhexagonal.infraestrutura.adaptadores.repositories.SpringProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringProdutoRepository.class)
public class ArqhexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArqhexagonalApplication.class, args);
	}

}
