package com.abdullahssonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullahssonmez.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
