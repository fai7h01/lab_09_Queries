package com.cydeo.repository;

import com.cydeo.entity.Cart;
import com.cydeo.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {

    //Write a derived query to get all cart by specific discount type
    List<Cart> findByDiscount_DiscountType(DiscountType type);

    //Write a JPQL query to get all cart by customer
    List<Cart> findByCustomer_Id(Long customerId);
}