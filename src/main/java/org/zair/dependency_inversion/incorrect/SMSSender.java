package org.zair.dependency_inversion.incorrect;

public class SMSSender {

    public void sendSMS(String message) {
        System.out.println("Sending sms : " + message);
    }
}
