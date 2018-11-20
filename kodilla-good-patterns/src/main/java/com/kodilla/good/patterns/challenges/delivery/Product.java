package com.kodilla.good.patterns.challenges.delivery;

import java.util.Objects;

public class Product {
    private String name;
    //private String quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Product(String name) {
        this.name = name;
    }
}
