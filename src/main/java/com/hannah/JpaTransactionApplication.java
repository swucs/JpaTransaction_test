package com.hannah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan("com.hannah")
@SpringBootApplication
public class JpaTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTransactionApplication.class, args);
	}

}
