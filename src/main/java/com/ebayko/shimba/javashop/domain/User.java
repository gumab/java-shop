package com.ebayko.shimba.javashop.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String name;
    private String email;
    private String passwd;
    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @JsonManagedReference
    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    private List<Cart> cartList = new ArrayList<>();

    public void addCart(Cart cart) {
        cartList.add(cart);
        if (cart.getBuyer() != this) {
            cart.setBuyer(this);
        }
    }
}
