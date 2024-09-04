package perscholas.EurekaClientOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientOneApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientOneApplication.class, args);
	}

}
