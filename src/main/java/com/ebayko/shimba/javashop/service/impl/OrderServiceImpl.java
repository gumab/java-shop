package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.domain.MyOrder;
import com.ebayko.shimba.javashop.repository.OrderRepository;
import com.ebayko.shimba.javashop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    @Transactional
    public MyOrder addOrder(MyOrder order) {
        return orderRepository.save(order);
    }

    @Override
    @Transactional(readOnly = true)
    public MyOrder getOrder(Long id) {
        return orderRepository.getMyOrder(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<MyOrder> getOrders(Long memberId, Pageable pageable) {
        Page<MyOrder> orderPage = orderRepository.findAllByMember_Id(memberId, pageable);
        return orderPage;
    }
}
