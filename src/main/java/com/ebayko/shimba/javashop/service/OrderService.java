package com.ebayko.shimba.javashop.service;

import com.ebayko.shimba.javashop.domain.MyOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    public MyOrder addOrder(MyOrder order);

    public MyOrder getOrder(Long id);

    public Page<MyOrder> getOrders(Long memberId, Pageable pageable);
}
