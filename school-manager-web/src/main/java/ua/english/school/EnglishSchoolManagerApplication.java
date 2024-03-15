package ua.english.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "ua.english.school")
public class EnglishSchoolManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishSchoolManagerApplication.class, args);
	}

}
