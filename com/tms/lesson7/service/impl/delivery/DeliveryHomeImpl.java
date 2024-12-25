package com.tms.lesson7.service.impl.delivery;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.DeliverOrder;

public class DeliveryHomeImpl implements DeliverOrder {
    @Override
    public void getInfoAddress(Order order) {
        if(order.isAddress()== true && order.isPayment() == true){
            System.out.println("Your order number " + order.getNumber()+ " was delivered to the specified home address");
        }
        else {
            System.out.println("Your can take your order " + order.getNumber() + " from shop");
        }

    }

}
