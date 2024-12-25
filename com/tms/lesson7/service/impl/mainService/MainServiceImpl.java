package com.tms.lesson7.service.impl.mainService;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.*;

public class MainServiceImpl implements MainSeviceOrder {

    private GetOrder[] getOrders;
    private SaveOrder saveOrder;
    private ProcessCreateDishes processCreateDishes;
    private DeliverOrder [] deliverOrders;

    public MainServiceImpl(GetOrder[] getOrders, SaveOrder saveOrder, ProcessCreateDishes processCreateDishes, DeliverOrder[] deliverOrders) {
        this.getOrders = getOrders;
        this.saveOrder = saveOrder;
        this.processCreateDishes = processCreateDishes;
        this.deliverOrders = deliverOrders;
    }

    @Override
    public void registerOrder(Order order) {
        System.out.println("step1: create order");

        for(GetOrder getOrder : getOrders){
            getOrder.makeContact(order);
        }

        System.out.println("step2: save order");
        saveOrder.save(order);

        System.out.println("step3: cook dishes");
        processCreateDishes.create(order);

        System.out.println("step4: delivery order");

        for(DeliverOrder deliverOrder : deliverOrders){
            deliverOrder.getInfoAddress(order);
        }
    }

}

