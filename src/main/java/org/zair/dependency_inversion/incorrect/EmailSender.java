package org.zair.dependency_inversion.incorrect;

public class EmailSender {

    public void sendEmail(String message) {
        System.out.println("Sending email : " + message);
    }
}
