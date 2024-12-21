package com.tms.lesson7.service.Impl.CreateDishes;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.ProcessCreateDishes;

public class CreateDishesServiceImpl implements ProcessCreateDishes {

    @Override
    public void create(Order order) {
        System.out.println("The dishes from order " + order.getNumber() + " are cooking");
    }
}
