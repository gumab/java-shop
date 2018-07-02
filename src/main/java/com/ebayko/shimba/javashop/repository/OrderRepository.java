package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository
        extends JpaRepository<MyOrder, Long> {
}
