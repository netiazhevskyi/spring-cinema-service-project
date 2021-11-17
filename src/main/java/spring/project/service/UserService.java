package spring.project.service;

import java.util.Optional;
import spring.project.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
