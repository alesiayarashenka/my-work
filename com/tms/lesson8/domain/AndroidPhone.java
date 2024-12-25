package com.tms.lesson8.domain;

public class AndroidPhone extends Phone {

    public AndroidPhone(String phoneName, String phoneNumber, int levelVolume, int version) {
        super(phoneName, phoneNumber,levelVolume,version);
    }

    @Override
    public void firmware(int phone) {
        if(phone == 15){
            System.out.println("Your version is actual");
        }
        else {
            System.out.println("Your version is not supported");
        }
    }

}

