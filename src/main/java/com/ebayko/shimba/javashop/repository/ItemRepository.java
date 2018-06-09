package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
