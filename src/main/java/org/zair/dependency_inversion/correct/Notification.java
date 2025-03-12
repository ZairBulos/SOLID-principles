package org.zair.dependency_inversion.correct;

import java.util.List;

// ✅ Después: Aplicando DIP
public class Notification {

    private List<Sender> senders;

    public Notification(List<Sender> senders) {
        // Mi caso de uso depende de la abstracción Sender
        this.senders = senders;
    }

    public void notify(String message) {
        for (Sender sender : senders) {
            sender.send(message);
        }
    }
}
