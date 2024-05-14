package com.cydeo.repository;

import com.cydeo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

    //Write a derived query to get all addresses starting with a street name

    //Write a derived query to get top 3 addresses with a specific customer email

    //Write a JPQL query to get all addresses with a specific customerId

}