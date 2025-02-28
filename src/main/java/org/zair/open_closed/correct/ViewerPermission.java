package org.zair.open_closed.correct;

public class ViewerPermission implements Permission {

    @Override
    public boolean hasPermission(String action, String resource) {
        if (resource.equals("content")) {
            return action.equals("read");
        }

        return false;
    }
}
