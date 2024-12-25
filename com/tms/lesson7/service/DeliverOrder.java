package com.tms.lesson7.service;

import com.tms.lesson7.domain.Order;

public interface DeliverOrder {

    default void getInfoAddress(Order order){
        System.out.println("Order " + order.getNumber() + " was delivered to the goods delivery point");
    }

}
