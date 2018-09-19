package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("Jan", "Kowalski", "jkowalski@gmail.com");

        Map<Product, Integer> products = new HashMap<>();

        products.put(new Product("2354A"), 3);
        products.put(new Product("2734C"), 1);
        products.put(new Product("1864E"), 5);

        return new OrderRequest(user, products);
    }
}
