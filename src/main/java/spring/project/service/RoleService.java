package spring.project.service;

import spring.project.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}
