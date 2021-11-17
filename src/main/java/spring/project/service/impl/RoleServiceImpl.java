package spring.project.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import spring.project.dao.RoleDao;
import spring.project.model.Role;
import spring.project.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.get(roleName).orElseThrow(
                () -> new NoSuchElementException("Unable to find role: " + roleName));
    }
}
