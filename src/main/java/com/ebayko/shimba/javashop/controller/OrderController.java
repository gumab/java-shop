package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/cart")
public class OrderController {

    @Autowired
    MemberService memberService;

    @PostMapping
    public String order(Principal principal,
                           ModelMap modelMap
    ) {
        Member member = memberService.getMemberByEmail(principal.getName());
        modelMap.addAttribute("cartList", member.getCartList());
        return "cart/list";
    }
}
