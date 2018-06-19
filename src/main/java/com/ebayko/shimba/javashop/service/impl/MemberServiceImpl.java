package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.domain.MemberRole;
import com.ebayko.shimba.javashop.repository.MemberRepository;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    @Transactional(readOnly = true)
    public Member getMember(Long id) {
        return memberRepository.getMember(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Member getMemberByEmail(String email) {
        return memberRepository.getMemberByEmail(email);
    }

    @Override
    @Transactional
    public Member addMember(Member member) {
        MemberRole memberRole = new MemberRole();
        memberRole.setName("USER");
        member.addMemberRole(memberRole);
        member =
                memberRepository.save(member);
        return member;
    }
}
