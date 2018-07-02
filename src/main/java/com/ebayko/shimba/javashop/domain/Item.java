package com.ebayko.shimba.javashop.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
@Getter
@Setter
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @Column(name = "image_url")
    private String imageUrl;


    @Column(name = "reg_date")
    private LocalDateTime regdate;
//
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
//    private List<Cart> cartList = new ArrayList<>();
}
