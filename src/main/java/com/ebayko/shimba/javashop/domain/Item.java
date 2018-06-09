package com.ebayko.shimba.javashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@AllArgsConstructor
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;
    private String name;
    private Double price;
    private String imageUrl;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
    @Column(name = "chg_date")
    private LocalDateTime chgDate;
}
