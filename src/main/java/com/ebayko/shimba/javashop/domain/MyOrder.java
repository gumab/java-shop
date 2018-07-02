package com.ebayko.shimba.javashop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "myOrder")
@Getter
@Setter
public class MyOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonManagedReference(value = "ordercart")
    @OneToMany(mappedBy = "myOrder", cascade = CascadeType.ALL)
    private List<Cart> cartList;

    public void setCartList(List<Cart> cartList){
        for (Cart cart:cartList){
            if(cart.getMyOrder()!=this) {
                cart.setMyOrder(this);
            }
        }
        this.cartList = cartList;
    }

    @JsonBackReference(value = "memberorder")
    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "reg_date")
    private LocalDateTime regdate;
}
