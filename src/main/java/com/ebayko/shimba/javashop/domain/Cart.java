package com.ebayko.shimba.javashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
@Getter
@Setter
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "buyer_id")
    private User buyer;
    private Integer itemQty;
    private Boolean isOrdered;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
    @Column(name = "chg_date")
    private LocalDateTime chgDate;

    public void setBuyer(User buyer){
        this.buyer = buyer;
        if(!buyer.getCartList().contains(this)){
            buyer.addCart(this);
        }
    }
}
