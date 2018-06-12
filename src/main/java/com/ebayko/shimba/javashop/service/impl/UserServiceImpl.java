package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.User;
import com.ebayko.shimba.javashop.repository.CartRepository;
import com.ebayko.shimba.javashop.repository.UserRepository;
import com.ebayko.shimba.javashop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CartRepository cartRepository;

    @Override
    @Transactional
    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    @Override
    @Transactional
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
