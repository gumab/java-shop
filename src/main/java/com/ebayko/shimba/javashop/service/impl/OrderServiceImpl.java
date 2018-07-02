//package com.ebayko.shimba.javashop.service.impl;
//
//import com.ebayko.shimba.javashop.domain.MyOrder;
//import com.ebayko.shimba.javashop.repository.OrderRepository;
//import com.ebayko.shimba.javashop.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class OrderServiceImpl implements OrderService {
//    @Autowired
//    OrderRepository orderRepository;
//
//    @Override
//    @Transactional
//    public MyOrder addOrder(MyOrder order) {
//        return orderRepository.save(order);
//    }
//}
