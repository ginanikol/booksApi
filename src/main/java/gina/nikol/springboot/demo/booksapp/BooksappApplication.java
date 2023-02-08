package gina.nikol.springboot.demo.booksapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the Spring Boot application.
 * 
 * @author Gina Nikolouzou
 */
@SpringBootApplication
public class BooksappApplication {
	/**
	 * The entry point of the application.
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(BooksappApplication.class, args);
	}
}
