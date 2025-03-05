package org.zair.interface_segregation.incorrect;

public class TV implements Device {

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

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }

    @Override
    public void showSubtitle() {
        System.out.println("Showing subtitle");
    }
}
