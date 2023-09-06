package com.reset.ProfessorService.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getallprofessors")
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ProfessorServiceApplication {
	
	@GetMapping("/professor")
	public String getAllProfessors() {
		return "All Professors";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProfessorServiceApplication.class, args);
	}

}
