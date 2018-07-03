package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository
        extends JpaRepository<MyOrder, Long> {

    @Query("select m from MyOrder m where m.id = :id")
    public MyOrder getMyOrder(@Param("id") Long id);
}
