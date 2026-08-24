package com.flipkart.product_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.product_management_system.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}