package com.vominhvo.simplejobmanagement;

import org.springframework.boot.SpringApplication;

public class TestSimplejobmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(SimplejobmanagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
