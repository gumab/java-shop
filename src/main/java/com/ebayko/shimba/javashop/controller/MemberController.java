package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(path = "/joinform")
    public String joinForm() {
        return "members/joinForm";
    }

    @PostMapping(path = "/join")
    public String join(@ModelAttribute Member member) {
        member.setRegdate(LocalDateTime.now());
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encode = passwordEncoder.encode(member.getPasswd());
        member.setPasswd(encode);
        memberService.addMember(member);

        return "redirect:/members/welcome";
    }

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "members/welcome";
    }
}
