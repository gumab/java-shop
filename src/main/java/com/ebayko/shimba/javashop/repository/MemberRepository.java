package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository
        extends JpaRepository<Member, Long> {
    // jpql - Member엔티티들중에서 조회하라.
    // fetch join
    @Query("select distinct m from Member m join fetch m.memberRoles")
    public List<Member> getMembers();

    @Query("select m from Member m where m.id = :id")
    public Member getMember(@Param("id") Long id);

    public Member getMemberByEmail(String email);
}
