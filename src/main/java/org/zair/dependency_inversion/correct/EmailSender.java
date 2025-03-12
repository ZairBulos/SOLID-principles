package org.zair.dependency_inversion.correct;

public class EmailSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}
