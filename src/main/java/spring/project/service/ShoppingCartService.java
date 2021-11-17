package spring.project.service;

import spring.project.model.MovieSession;
import spring.project.model.ShoppingCart;
import spring.project.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
