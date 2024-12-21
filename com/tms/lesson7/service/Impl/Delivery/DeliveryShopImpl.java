package com.tms.lesson7.service.Impl.Delivery;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.DeliverOrder;

public class DeliveryShopImpl implements DeliverOrder {

    @Override
    public void getInfoAddress(Order order) {
        DeliverOrder.super.getInfoAddress(order);
    }
}
