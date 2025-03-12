package org.zair.dependency_inversion.incorrect;

// ❌ Antes: Sin usar DIP
public class Notification {

    private EmailSender emailSender;
    private SMSSender smsSender;

    public Notification() {
        // Mi caso de uso depende de clases concretas
        this.emailSender = new EmailSender();
        this.smsSender = new SMSSender();
    }

    public void notify(String message) {
        this.emailSender.sendEmail(message);
        this.smsSender.sendSMS(message);
    }
}
