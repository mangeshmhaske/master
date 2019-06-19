package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaMvcStudentApplication {

	public static void main(String[] args)
	{
		System.out.println("main start");
	 	SpringApplication.run(SpringBootJpaMvcStudentApplication.class, args);
	 	System.out.println("main end");
	}

}
