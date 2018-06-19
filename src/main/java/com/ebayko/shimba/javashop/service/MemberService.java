package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.Member;

public interface MemberService {
    public Member getMember(Long id);
    public Member getMemberByEmail(String email);
    public Member addMember(Member member);
}
