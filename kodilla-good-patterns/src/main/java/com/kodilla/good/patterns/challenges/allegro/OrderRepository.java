package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public interface OrderRepository {
    boolean createOrder(User user, Map<Product, Integer> product);
}
