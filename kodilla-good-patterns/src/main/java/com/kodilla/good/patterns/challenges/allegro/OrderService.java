package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public interface OrderService {
    boolean order(User user, Map<Product, Integer> product);
}
