package com.Food.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Food.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
