package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.Member;

import java.util.List;

public interface MemberService {
    public Member getMember(Long id);

    public Member addMember(Member member);

    public List<Member> getMembers();

    public Member getMemberByEmail(String email);
}
