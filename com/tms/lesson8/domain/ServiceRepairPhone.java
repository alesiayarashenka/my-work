package com.tms.lesson8.domain;

public class ServiceRepairPhone {

    public void check(Phone phone){
        phone.call(phone.phoneNumber);
        phone.play(phone.levelVolume);
        phone.firmware(phone.getVersion());
    }
}



