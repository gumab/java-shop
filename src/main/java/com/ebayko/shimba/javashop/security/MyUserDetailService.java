package com.ebayko.shimba.javashop.security;

import com.ebayko.shimba.javashop.domain.Member;
import com.ebayko.shimba.javashop.domain.MemberRole;
import com.ebayko.shimba.javashop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    MemberService memberService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Member member = memberService.getMemberByEmail(id);

        System.out.println(member);
        List<GrantedAuthority> list = new ArrayList<>();
        for(MemberRole memberRole : member.getMemberRoles()){
            list.add(new SimpleGrantedAuthority("ROLE_"+ memberRole.getName()));
        }

        UserDetails user = new User(member.getEmail(), member.getPasswd(), list);
        return user;
    }

}
