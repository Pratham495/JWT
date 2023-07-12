package com.example.demo;

import java.util.List;



import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.User;
import com.example.demo.repositories.UserRepository;



@SpringBootApplication
public class JwtApplication1Application {

	@Autowired
	private UserRepository repository;
		
	public static void main(String[] args) {
		SpringApplication.run(JwtApplication1Application.class, args);
	}
	
		@PostConstruct
		public void initUsers() {
			
			List<User>users = Stream.of(
					new User(101, "pratham", "pratham123", "pratham@123"),
					new User(102, "user1", "pwd1", "user1@123"),
					new User(103, "user2", "pwd2", "user2@234"),
					new User(104, "user3", "pwd3", "user3@235"))
					.collect(Collectors.toList());
			repository.saveAll(users);
	}
}
