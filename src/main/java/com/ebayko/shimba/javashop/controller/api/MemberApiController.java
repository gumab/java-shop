package com.ebayko.shimba.javashop.controller.api;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.dto.MyHeader;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/members")
public class MemberApiController {

    @Autowired
    MemberService memberService;

    @GetMapping(path = "/{memberId}")
    public Member getUser(MyHeader myHeader, @PathVariable("memberId") Long memberId) {
        System.out.println(myHeader.getAccept());
        System.out.println(myHeader.getHost());
        Member result = memberService.getMember(memberId);
        return result;
        //return new Member(1L, "test", "test@test.com", "1234", LocalDateTime.now(), new ArrayList<>());
    }

    @GetMapping(path = "/test")
    public Member test() {
        Member newMember = new Member();
        newMember.setPasswd("1234");
        newMember.setName("chabae");
        newMember.setEmail("chabae@ebay.com");
        newMember.setRegdate(LocalDateTime.now());

        memberService.addMember(newMember);

        return null;
    }
}
