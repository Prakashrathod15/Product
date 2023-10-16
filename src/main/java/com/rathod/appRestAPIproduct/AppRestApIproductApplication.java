package com.rathod.appRestAPIproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.rathod.controllers","com.rathod.repo","com.rathod.service"})
public class AppRestApIproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRestApIproductApplication.class, args);
	}

}
