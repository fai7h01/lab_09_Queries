package com.cydeo.repository;

import com.cydeo.entity.Discount;
import com.cydeo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    //Write a derived query to get top 5 orders which are ordered by total price desc
    List<Order> findTop5ByPaidPriceOrderByTotalPriceDesc(BigDecimal paidPrice);

    //Write a derived query to check is there any orders by customer email
    boolean existsByCustomer_Email(String email);

    //Write a JPQL query to get all orders that have equal totalPrice and paidPrice
    @Query("select o from Order o where o.paidPrice = o.totalPrice")
    List<Order> retrieveOrdersEqualTotalAndPaid();

}