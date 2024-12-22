package com.tms.lesson8.domain;

public class ServiceRepairPhone {

    public void check(Object o){
        if(o instanceof Phone) {
            Phone val = (Phone) o;
        val.call(val.phoneNumber);
        val.play(val.levelVolume);
        val.firmware(val.getVersion());
    }
}


}
