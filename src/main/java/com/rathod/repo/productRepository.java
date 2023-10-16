package com.rathod.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rathod.Entity.product;

@Repository
public interface productRepository extends JpaRepository<product,Integer>{

}
