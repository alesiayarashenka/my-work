package com.tms.lesson7.service.impl.saveOrder;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.SaveOrder;

public class ServiceDataBaseImpl implements SaveOrder {
    @Override
    public void save(Order order) {
        System.out.println("Number of order was saved as " + order.getNumber());
    }

}
