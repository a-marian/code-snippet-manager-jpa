package io.pivotal.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}
}
