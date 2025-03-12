package org.zair.dependency_inversion.correct;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Notification notifiers = new Notification(List.of(new EmailSender(), new SMSSender()));
        notifiers.notify("Hello World");
    }

}
