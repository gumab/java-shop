package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {
    public Item getItem(Long id);

    public Page<Item> getItems(Pageable pageable);
}
