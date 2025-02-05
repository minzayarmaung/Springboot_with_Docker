package com.example.springboot_Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {

	@GetMapping("/getMessage")
	public String getMessage(){
		return "Welcome to Spring boot Project with Dockerizing";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
