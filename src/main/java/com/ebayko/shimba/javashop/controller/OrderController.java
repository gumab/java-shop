package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.domain.MyOrder;
import com.ebayko.shimba.javashop.service.MemberService;
import com.ebayko.shimba.javashop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    MemberService memberService;

    @Autowired
    OrderService orderService;

    @GetMapping
    public String order() {
        return "redirect:/order/0";
    }

    @GetMapping("/{pageId}")
    public String order(@PathVariable(name = "pageId", required = false) int pageId, Principal principal,
                           ModelMap modelMap
    ) {

        Member member = memberService.getMemberByEmail(principal.getName());
        PageRequest pageRequest = PageRequest.of(pageId, 5, Sort.Direction.DESC, "id");
        Page<MyOrder> orderPage = orderService.getOrders(member.getId(), pageRequest);
        modelMap.addAttribute("orderPage", orderPage);

        //modelMap.addAttribute("orderList", member.getOrderList());
        return "order/list";
    }
}
