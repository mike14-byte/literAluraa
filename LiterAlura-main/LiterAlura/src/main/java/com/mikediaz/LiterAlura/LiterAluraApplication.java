package com.mikediaz.LiterAlura;

import com.mikediaz.LiterAlura.main.Main;
import com.mikediaz.LiterAlura.repository.IAuthorRepository;
import com.mikediaz.LiterAlura.repository.IbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	@Autowired
	private IbookRepository bookRepository;
	@Autowired
	private IAuthorRepository authorRepository;
	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookRepository, authorRepository);
		main.displayMenu();
	}
}
