package com.tms.lesson7.service.impl.ordrer;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.GetOrder;

public class OrderByPhoneImpl implements GetOrder {

        @Override
    public void makeContact(Order order) {
            System.out.println("You called to deliveryService by " + order.getPhone());
            System.out.println("You named " + order.getProduct());
            System.out.println("You specified " + order.getAmount() + " amount of products");

    }

}
