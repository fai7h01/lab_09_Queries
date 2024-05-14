package com.cydeo.repository;

import com.cydeo.enums.CartState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartState,Long> {

    //Write a derived query to get the count of all cart items

    //Write a derived query to get cart items for specific cart state

    //Write a native query to get cart items for specific cart state and product name

    //Write a native query to get cart items for specific cart state and without discount

}