package com.ebayko.shimba.javashop.security;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class passwordTest {

    @Test
    public void encodingTest() throws Exception {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);

        boolean matches = passwordEncoder.matches("1234","{bcrypt}$2a$10$lJqNIwHuZCW9R8kk/S816eAz2y/1dTdrE/QXTmfDNa4UeVGrVZn.y");
        System.out.println(matches);
        Assert.assertTrue(matches);


    }
}
