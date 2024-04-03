package com.abdtouirsi.jpatp.repositories;

import com.abdtouirsi.jpatp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
