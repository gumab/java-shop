package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository
        extends JpaRepository<Cart, Long> {
}
