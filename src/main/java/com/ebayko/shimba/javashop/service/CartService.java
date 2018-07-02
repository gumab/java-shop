package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.Cart;

public interface CartService {
    public Cart addCart(Cart cart);

    public Cart getCart(Long id);
}
