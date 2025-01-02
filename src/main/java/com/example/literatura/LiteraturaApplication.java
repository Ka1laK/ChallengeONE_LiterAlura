package com.example.literatura;

import com.example.literatura.Principal.principal;
import com.example.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import java.security.Principal;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Autowired
	LibroRepository repository;

	@Override
	public void run(String... args)  {
		principal principal = new principal(repository);
		principal.MostrarMenu();
	}
}
