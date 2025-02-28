package org.zair.open_closed.incorrect;

import org.zair.open_closed.User;

// ❌ Antes: Sin usar OCP
public class PermissionChecker {

    public boolean checkPermission(User user, String action, String resource) {
        if (user.getRole().equals("admin")) {
            return true;
        } else if (user.getRole().equals("editor")) {
            return (action.equals("read") || action.equals("write")) && resource.equals("content");
        } else if (user.getRole().equals("viewer")) {
            return action.equals("read") && resource.equals("content");
        }

        return false;
    }
}
