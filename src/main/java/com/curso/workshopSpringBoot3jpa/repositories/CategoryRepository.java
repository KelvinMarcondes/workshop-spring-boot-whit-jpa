package com.curso.workshopSpringBoot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshopSpringBoot3jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
