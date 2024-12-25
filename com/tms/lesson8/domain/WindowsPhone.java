package com.tms.lesson8.domain;

public class WindowsPhone extends Phone{

    public WindowsPhone(String phoneName, String phoneNumber, int levelVolume, int version) {
        super(phoneName, phoneNumber, levelVolume,version);
    }

    @Override
    public void call(String phoneNumber) {
            System.out.println("Your mobile phone has cool ringtone");
        }

    @Override
    public void firmware(int phone) {

    }

}

