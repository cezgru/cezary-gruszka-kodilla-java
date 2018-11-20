package com.kodilla.good.patterns.challenges.delivery;

public class Order {
    private Product product;
    private User user;
    private int quantity;

    public Order(Product product, User user, int quantity) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
