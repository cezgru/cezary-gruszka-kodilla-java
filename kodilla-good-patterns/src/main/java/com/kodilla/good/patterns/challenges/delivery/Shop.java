package com.kodilla.good.patterns.challenges.delivery;

import java.util.List;
import java.util.Set;

public interface Shop {
    boolean process(Order order);
    Set<Product> getProductList();
}
