package org.zair.open_closed.correct;

public class AdminPermission implements Permission {

    @Override
    public boolean hasPermission(String action, String resource) {
        return true;
    }
}
