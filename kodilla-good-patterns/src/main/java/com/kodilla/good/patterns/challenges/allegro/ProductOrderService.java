package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, Map<Product, Integer> product) {
        /*This will check whether the order can actually be... umm... ordered. So it will check
        quantities in some external ProductDatabase etc. and return true false based on that.
         */
        return true;
    }
}
