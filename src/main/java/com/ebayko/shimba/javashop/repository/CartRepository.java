package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository
        extends JpaRepository<Cart, Long> {

    @Query("select c from Cart c where c.id = :id")
    public Cart getCart(@Param("id") Long id);
}
