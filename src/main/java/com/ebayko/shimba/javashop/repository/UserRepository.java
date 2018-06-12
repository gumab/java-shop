package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select distinct m from User m join fetch m.cartList")
    public List<User> getUsers();

    @Query("select m from User m left join fetch m.cartList where m.userId = :id")
    public User getUser(@Param("id") Long id);
}
