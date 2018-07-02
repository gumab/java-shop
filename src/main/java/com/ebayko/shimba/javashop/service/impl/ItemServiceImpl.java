package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.domain.MemberRole;
import com.ebayko.shimba.javashop.repository.ItemRepository;
import com.ebayko.shimba.javashop.repository.MemberRepository;
import com.ebayko.shimba.javashop.service.ItemService;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item getItem(Long id) {
        return itemRepository.getItemById(id);
    }
}
