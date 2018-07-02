package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository
        extends JpaRepository<Item, Long> {
    public Item getItemById(Long id);
    public Page<Item> findAllBy(Pageable pageable);
}
