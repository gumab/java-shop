package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
