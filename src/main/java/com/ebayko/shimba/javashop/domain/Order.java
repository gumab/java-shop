package com.ebayko.shimba.javashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Getter
@Setter
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "buyer_id")
    private User buyer;
    private Integer itemQty;

    @ManyToOne(targetEntity = Address.class)
    @JoinColumn(name = "address_id")
    private Address shippingAddress;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
    @Column(name = "chg_date")
    private LocalDateTime chgDate;
}
