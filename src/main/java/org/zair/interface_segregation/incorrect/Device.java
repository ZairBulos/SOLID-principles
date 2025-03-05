package org.zair.interface_segregation.incorrect;

// ❌ Antes: Sin usar ISP
public interface Device {
    void turnOn();
    void turnOff();
    void playAudio();
    void mute();
    void playVideo();
    void showSubtitle();
}
