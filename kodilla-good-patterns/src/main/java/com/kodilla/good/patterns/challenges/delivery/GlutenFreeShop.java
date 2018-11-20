package com.kodilla.good.patterns.challenges.delivery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(Order order) {
        Random random = new Random();
        return random.nextInt(2)%2==0;
    }

    private Set<Product> productList = new HashSet<>();
    {
        productList.add(new Product("GF Bread"));
    }

    public Set<Product> getProductList() {
        return productList;
    }
}
