package com.ebayko.shimba.javashop.controller.api;

import com.ebayko.shimba.javashop.domain.Cart;
import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.domain.MyOrder;
import com.ebayko.shimba.javashop.service.CartService;
import com.ebayko.shimba.javashop.service.MemberService;
import com.ebayko.shimba.javashop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderApiController {

    @Autowired
    MemberService memberService;

    @Autowired
    CartService cartService;

    @Autowired
    OrderService orderService;

    @PostMapping
    @ResponseBody
    public MyOrder addOrder(@RequestBody MyOrder order, Principal principal) {
        Member member = memberService.getMemberByEmail(principal.getName());

        List<Cart> newCartList = new ArrayList<>();

        for (Cart cart : order.getCartList()) {
            newCartList.add(cartService.getCart(cart.getId()));
        }

        order.setCartList(newCartList);
        order.setMember(member);
        order.setRegdate(LocalDateTime.now());

        orderService.addOrder(order);

        return order;
    }

    @GetMapping("/{id}")
    public MyOrder getOrder(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }
}
