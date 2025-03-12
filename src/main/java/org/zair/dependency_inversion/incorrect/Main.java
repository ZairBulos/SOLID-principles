package org.zair.dependency_inversion.incorrect;

public class Main {

    public static void main(String[] args) {
        Notification notifier = new Notification();
        notifier.notify("Hello World");
    }

}
