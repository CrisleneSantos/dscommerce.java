package com.example.dscommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.entities")
public class DscommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
		
		System.out.print("OI");
		
	}

}
