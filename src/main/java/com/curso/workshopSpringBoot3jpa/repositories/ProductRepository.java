package com.curso.workshopSpringBoot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshopSpringBoot3jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
