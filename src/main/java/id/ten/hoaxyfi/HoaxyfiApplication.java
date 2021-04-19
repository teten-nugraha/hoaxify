package id.ten.hoaxyfi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HoaxyfiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoaxyfiApplication.class, args);
	}

}
