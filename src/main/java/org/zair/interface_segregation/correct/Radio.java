package org.zair.interface_segregation.correct;

public class Radio implements Device, AudioDevice {

    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio");
    }

    @Override
    public void mute() {
        System.out.println("Muting");
    }
}
