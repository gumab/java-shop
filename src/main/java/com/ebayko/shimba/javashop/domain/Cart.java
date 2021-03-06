package com.ebayko.shimba.javashop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
@Getter
@Setter
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    private Item item;

    @JsonBackReference(value = "membercart")
    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "reg_date")
    private LocalDateTime regdate;

    @JsonBackReference(value = "ordercart")
    @ManyToOne(targetEntity = MyOrder.class)
    @JoinColumn(name = "order_id")
    private MyOrder myOrder;

    public boolean isOrdered() {
        return myOrder != null;
    }
}
