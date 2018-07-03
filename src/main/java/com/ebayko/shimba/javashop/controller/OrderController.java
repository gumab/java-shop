package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    MemberService memberService;

    @GetMapping
    public String order(Principal principal,
                           ModelMap modelMap
    ) {
        Member member = memberService.getMemberByEmail(principal.getName());
        modelMap.addAttribute("orderList", member.getOrderList());
        return "order/list";
    }
}
