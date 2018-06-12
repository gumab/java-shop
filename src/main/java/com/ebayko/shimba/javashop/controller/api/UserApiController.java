package com.ebayko.shimba.javashop.controller.api;

import com.ebayko.shimba.javashop.domain.Cart;
import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.User;
import com.ebayko.shimba.javashop.dto.MyHeader;
import com.ebayko.shimba.javashop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/{userId}")
    public User getUser(MyHeader myHeader, @PathVariable("userId") Long userId) {
        System.out.println(myHeader.getAccept());
        System.out.println(myHeader.getHost());
        User result = userService.getUser(userId);
        return result;
        //return new User(1L, "test", "test@test.com", "1234", LocalDateTime.now(), new ArrayList<>());
    }

    @GetMapping(path = "/test")
    public User test() {
        User newUser = new User();
        newUser.setPasswd("1234");
        newUser.setName("chabae");
        newUser.setEmail("chabae@ebay.com");
        newUser.setRegDate(LocalDateTime.now());

        userService.addUser(newUser);

        return null;
    }


    @GetMapping(path = "/test2")
    public User test2() {
        User user = userService.getUser(1L);
        Item item = new Item(null, "상품1", 5000D, "http://www.google.com", LocalDateTime.now(), LocalDateTime.now());
        Cart cart = new Cart(null, null, null, 1, false, LocalDateTime.now(), LocalDateTime.now());
        cart.setItem(item);
        cart.setBuyer(user);

        user.addCart(cart);

        return null;
    }
}
