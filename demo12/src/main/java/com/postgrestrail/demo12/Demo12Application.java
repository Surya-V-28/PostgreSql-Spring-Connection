package com.postgrestrail.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080")
public class Demo12Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}

}
