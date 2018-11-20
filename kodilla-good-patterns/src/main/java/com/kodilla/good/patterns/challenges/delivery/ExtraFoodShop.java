package com.kodilla.good.patterns.challenges.delivery;

import java.util.HashSet;
import java.util.Set;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(Order order) {
        return false;
    }

    private Set<Product> productList = new HashSet<>();
    {
        productList.add(new Product("Extra spicy chilli"));
    }

    public Set<Product> getProductList() {
        return productList;
    }
}
