package com.tms.lesson8.domain;

public abstract class Phone {

    public String phoneNumber;

    public String phoneName;

    public int levelVolume;

    public int version;

    public int getVersion() {
        return version;
    }

    public Phone(String phoneName, String phoneNumber, int levelVolume, int version) {
        this.phoneNumber = phoneNumber;
        this.levelVolume = levelVolume;
        this.version = version;
        this.phoneName = phoneName;
        System.out.println("Your phone " + phoneName + " has version " + version);
    }

   public void call(String phoneNumber){
            System.out.println("Somebody calls you to number " + phoneNumber);
    }

    public void play(int levelVolume){
        if(levelVolume >= 5){
            System.out.println("Play music");
        }
        else {
            System.out.println("Increase the volume");
        }

    }

    public abstract void firmware(int phone);
}
