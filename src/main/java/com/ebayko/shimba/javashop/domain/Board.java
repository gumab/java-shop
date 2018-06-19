package com.ebayko.shimba.javashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column(name = "reg_date")
    private LocalDateTime regdate;
}
