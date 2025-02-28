package org.zair.open_closed.correct;

import org.zair.open_closed.User;

import java.util.HashMap;
import java.util.Map;

// ✅ Después: Aplicando OCP
public class PermissionChecker {
    private final Map<String, Permission> permissions = new HashMap<>();

    public PermissionChecker() {
        permissions.put("admin", new AdminPermission());
        permissions.put("editor", new EditorPermission());
        permissions.put("viewer", new ViewerPermission());
    }

    public boolean checkPermission(User user, String action, String resource) {
        Permission permission = permissions.get(user.getRole());

        if (permission != null) {
            return permission.hasPermission(action, resource);
        }

        return false;
    }
}
