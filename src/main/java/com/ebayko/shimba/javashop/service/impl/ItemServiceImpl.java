package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.repository.ItemRepository;
import com.ebayko.shimba.javashop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    @Transactional(readOnly = true)
    public Item getItem(Long id) {
        return itemRepository.getItemById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public Page<Item> getItems(Pageable pageable) {
        Page<Item> itemPage = itemRepository.findAllBy(pageable);
        return itemPage;
    }
}
