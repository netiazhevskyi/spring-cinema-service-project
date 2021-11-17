package spring.project.service.impl;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;
import spring.project.model.Role;
import spring.project.model.User;
import spring.project.service.AuthenticationService;
import spring.project.service.RoleService;
import spring.project.service.ShoppingCartService;
import spring.project.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        Set<Role> roleList = new HashSet<>();
        roleList.add(roleService.getRoleByName("USER"));
        user.setRoles(roleList);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
