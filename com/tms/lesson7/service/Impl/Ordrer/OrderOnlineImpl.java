package com.tms.lesson7.service.Impl.Ordrer;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.GetOrder;

public class OrderOnlineImpl implements GetOrder {

        @Override
    public void makeContact(Order order) {
            System.out.println("You've been logged in the delivery application as " + order.getUsername());
            System.out.println("You chose " + order.getProduct());
            System.out.println("You chose " + order.getAmount() + " amount of products");
    }
}