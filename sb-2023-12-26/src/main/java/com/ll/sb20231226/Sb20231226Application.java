package com.ll.sb20231226;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Sb20231226Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb20231226Application.class, args);
	}

}
