package com.example.Homeworjs456;

import com.example.Homeworjs456.entities.Laptop;
import com.example.Homeworjs456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop = new Laptop("G580", 4, "Lenovo");
		repository.save(laptop);
	}

}
