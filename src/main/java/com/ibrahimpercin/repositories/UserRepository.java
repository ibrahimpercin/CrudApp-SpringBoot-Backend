package com.ibrahimpercin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibrahimpercin.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
