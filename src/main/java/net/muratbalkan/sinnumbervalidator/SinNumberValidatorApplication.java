package net.muratbalkan.sinnumbervalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication      // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SinNumberValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinNumberValidatorApplication.class, args);
	}

}
