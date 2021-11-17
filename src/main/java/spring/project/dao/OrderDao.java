package spring.project.dao;

import java.util.List;
import spring.project.model.Order;
import spring.project.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
