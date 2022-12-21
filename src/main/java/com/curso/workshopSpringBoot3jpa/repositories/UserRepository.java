package com.curso.workshopSpringBoot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshopSpringBoot3jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
