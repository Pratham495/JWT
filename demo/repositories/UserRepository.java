package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;


public interface UserRepository extends JpaRepository<User,Integer> {

	 User findByUserName(String username);

}
