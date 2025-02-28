package org.zair.open_closed.correct;

public interface Permission {
    boolean hasPermission(String action, String resource);
}
