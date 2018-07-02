package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Board;
import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    MemberService memberService;

    @GetMapping
    public String cartView(Principal principal,
                           ModelMap modelMap
    ) {
        Member member = memberService.getMemberByEmail(principal.getName());
        modelMap.addAttribute("cartList", member.getCartList());
        return "cart/list";
    }
}
