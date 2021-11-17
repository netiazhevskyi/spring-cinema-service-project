package spring.project.dao;

import java.util.Optional;
import spring.project.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> get(String roleName);
}
