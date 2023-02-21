package com.ankan.mango;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MangoApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Customer("Ankan", "Das"));
		repository.save(new Customer("Mutton", "Biryani"));
		repository.save(new Customer("Chicken", "Biryani"));
		repository.save(new Customer("Veg", "Biryani"));



	}}