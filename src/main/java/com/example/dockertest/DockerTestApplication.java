package com.example.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

	//Rest controller to validate endpoint.....
	@GetMapping("/hello/{name}")
	public String syaHello(@PathVariable String name) {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
