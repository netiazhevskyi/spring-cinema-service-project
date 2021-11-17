package spring.project.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import spring.project.model.Role;
import spring.project.model.RoleName;
import spring.project.model.User;
import spring.project.service.AuthenticationService;
import spring.project.service.RoleService;
import spring.project.service.UserService;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;
    private final AuthenticationService authenticationService;

    public DataInitializer(UserService userService,
                           RoleService roleService,
                           AuthenticationService authenticationService) {
        this.userService = userService;
        this.roleService = roleService;
        this.authenticationService = authenticationService;
    }

    @PostConstruct
    public void injectData() {
        roleService.add(new Role(RoleName.ADMIN));
        roleService.add(new Role(RoleName.USER));

        User bob = new User();
        bob.setEmail("bob@test.com");
        bob.setPassword("1234");
        bob.setRoles(Set.of(roleService.getRoleByName("ADMIN")));
        userService.add(bob);

        User aliceUser = new User();
        aliceUser.setEmail("alice@test.com");
        aliceUser.setPassword("12345");
        authenticationService.register(aliceUser.getEmail(), aliceUser.getPassword());
    }
}
