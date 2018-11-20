package com.kodilla.good.patterns.challenges.delivery;

public class Application {
    public static void main(String[] args){

        User user = new User("Tomek");
        Product chili = new Product("GF Bread");
        Order order = new Order(chili, user, 3);
        InformationService informationService = new InformationService();
        informationService.informUser(order, ShopIdentifier.identifyShopByProduct(order.getProduct()).process(order));

    }
}
