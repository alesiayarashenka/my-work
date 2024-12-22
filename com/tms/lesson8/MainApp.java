package com.tms.lesson8;

import com.tms.lesson8.domain.*;
import com.tms.lesson8.domain.Phone;

public class MainApp {
    public static void main(String[] args) {

        ServiceRepairPhone serviceRepairPhone = new ServiceRepairPhone();

        ApplePhone applePhone = new ApplePhone("Apple iPhone 16 ProMax", "7777",5, 16);
        serviceRepairPhone.check(applePhone);

        AndroidPhone androidPhone = new AndroidPhone("Samsung", "6666", 3,13);
        serviceRepairPhone.check(androidPhone);

        WindowsPhone windowsPhone = new WindowsPhone("Windows Phone", "5543",5, 20);
        serviceRepairPhone.check(windowsPhone);

        Phone phone = new Phone("Phillips", "4433",5, 10) {
            @Override
            public void firmware(int phone) {
            }
        };
        serviceRepairPhone.check(phone);

    }
}
