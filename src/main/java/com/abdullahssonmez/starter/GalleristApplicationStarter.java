package com.abdullahssonmez.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.abdullahssonmez"})
@EntityScan(basePackages = {"com.abdullahssonmez"})
@EnableJpaRepositories(basePackages = {"com.abdullahssonmez"})
@SpringBootApplication
public class GalleristApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GalleristApplicationStarter.class, args);
	}

}
