package com.curso.workshopSpringBoot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshopSpringBoot3jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
