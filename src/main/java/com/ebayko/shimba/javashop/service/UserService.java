package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.User;

public interface UserService {
    public User getUser(Long id);
    public User addUser(User user);
}
