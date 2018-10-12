package com.ajw.calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple calculator application used solely for the purpose of setting up a 
 * continuous delivery pipeline.
 * <p>
 * The application is a Spring Boot Application.
 * </p>
 * @author andy
 */
@SpringBootApplication
public class CalculatorApplication {

    /**
     *
     * @param args Runtime arguments
     */
    public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
}
