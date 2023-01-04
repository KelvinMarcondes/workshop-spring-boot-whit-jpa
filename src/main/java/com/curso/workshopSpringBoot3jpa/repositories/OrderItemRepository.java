package com.curso.workshopSpringBoot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshopSpringBoot3jpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
