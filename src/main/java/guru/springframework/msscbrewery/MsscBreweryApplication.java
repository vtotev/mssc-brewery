package guru.springframework.msscbrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//		(scanBasePackages = {"guru.springframework.msscbrewery"})
//		(scanBasePackages =
//		{"guru.springframework.msscbrewery.services",
//		"guru.springframework.msscbrewery.web",
//		"guru.springframework.msscbrewery.web.controller"})
public class MsscBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);
	}

}
