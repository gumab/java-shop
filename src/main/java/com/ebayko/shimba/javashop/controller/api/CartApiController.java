package com.ebayko.shimba.javashop.controller.api;

import com.ebayko.shimba.javashop.domain.Cart;
import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.dto.MyHeader;
import com.ebayko.shimba.javashop.service.CartService;
import com.ebayko.shimba.javashop.service.ItemService;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/cart")
public class CartApiController {

    @Autowired
    MemberService memberService;

    @Autowired
    ItemService itemService;

    @Autowired
    CartService cartService;

    @PostMapping
    @ResponseBody
    public Cart addCart(@RequestBody Cart cart, Principal principal) {
        Member member = memberService.getMemberByEmail(principal.getName());
        Item item = itemService.getItem(cart.getItem().getId());
        cart.setRegdate(LocalDateTime.now());
        cart.setItem(item);
        cart.setMember(member);
        cartService.addCart(cart);
        return cart;
    }
}
