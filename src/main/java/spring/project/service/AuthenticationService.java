package spring.project.service;

import spring.project.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
