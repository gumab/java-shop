package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Cart;
import com.ebayko.shimba.javashop.repository.CartRepository;
import com.ebayko.shimba.javashop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    @Transactional
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    @Transactional(readOnly = true)
    public Cart getCart(Long id) {
        return cartRepository.getCart(id);
    }
}
