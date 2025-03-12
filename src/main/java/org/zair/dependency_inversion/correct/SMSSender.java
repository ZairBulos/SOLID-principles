package org.zair.dependency_inversion.correct;

public class SMSSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("Sending sms : " + message);
    }
}
