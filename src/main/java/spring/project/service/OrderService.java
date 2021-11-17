package spring.project.service;

import java.util.List;
import spring.project.model.Order;
import spring.project.model.ShoppingCart;
import spring.project.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
