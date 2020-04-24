package com.achari.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class AchariapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(AchariapplicationApplication.class, args);
	}

}
