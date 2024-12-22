package com.tms.lesson8.domain;

public class ApplePhone extends Phone {

    public ApplePhone(String phoneName, String phoneNumber, int levelVolume, int version) {
        super(phoneName, phoneNumber, levelVolume,version);
    }

    @Override
    public void firmware(int phone) {
        if(phone == 16){
            System.out.println("Your version is actual");
        }
        else {
            System.out.println("Your version is not supported");
        }
    }

}
