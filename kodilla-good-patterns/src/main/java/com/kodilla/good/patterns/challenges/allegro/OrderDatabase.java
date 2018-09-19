package com.kodilla.good.patterns.challenges.allegro;

import java.util.Map;

public class OrderDatabase implements OrderRepository {
    @Override
    public boolean createOrder(User user, Map<Product, Integer> product) {
        /*This will create the Order in the database. Im honestly unsure why it is a boolean (I guess
        so it confirmes that the order actually was added? The original implementation this was based was like
        this, although it never quite used the boolean in any way. Though luck.
         */
        return true;
    }
}
