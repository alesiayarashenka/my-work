package com.tms.lesson7;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.DeliverOrder;
import com.tms.lesson7.service.GetOrder;
import com.tms.lesson7.service.Impl.CreateDishes.CreateDishesServiceImpl;
import com.tms.lesson7.service.Impl.Delivery.DeliveryHomeImpl;
import com.tms.lesson7.service.Impl.MainService.MainServiceImpl;
import com.tms.lesson7.service.Impl.Ordrer.OrderByPhoneImpl;
import com.tms.lesson7.service.Impl.SaveOrder.ServiceDataBaseImpl;
import com.tms.lesson7.service.MainSeviceOrder;

public class MainApp {

    public static void main(String[] args) {

        Order order = new Order("pizza", 100, 2,true,true,"7799","user_1");

        MainSeviceOrder mainService = new MainServiceImpl(
                new GetOrder[]{
                    new OrderByPhoneImpl(),
//                  new OrderOnlineImpl()
                },
                new ServiceDataBaseImpl(),
                new CreateDishesServiceImpl(),
                new DeliverOrder[]{
                    new DeliveryHomeImpl(),
//                  new DeliveryShopImpl()
                }
        );

        mainService.registerOrder(order);

    }
}
