package com.ibrahimpercin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibrahimpercin.entities.User;
import com.ibrahimpercin.repositories.UserRepository;

@SpringBootApplication
public class CrudAppApplication implements CommandLineRunner {

	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new User("ipercin", "ipercin@gmail.com"));
		userRepository.save(new User("xxx", "yyy@gmail.com"));
	}
}
