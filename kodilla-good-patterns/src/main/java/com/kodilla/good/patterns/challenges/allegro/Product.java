package com.kodilla.good.patterns.challenges.allegro;

import java.util.Objects;

public class Product {

    private final String ID;

    public Product(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(ID, product.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
