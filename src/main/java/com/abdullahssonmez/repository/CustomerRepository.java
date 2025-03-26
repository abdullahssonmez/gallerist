package com.abdullahssonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullahssonmez.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
