package org.zair.interface_segregation.correct;

public class Bulb implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }
}
