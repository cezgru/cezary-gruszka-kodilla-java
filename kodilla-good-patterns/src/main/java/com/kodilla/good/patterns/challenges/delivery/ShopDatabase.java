package com.kodilla.good.patterns.challenges.delivery;

import java.util.HashSet;
import java.util.Set;

public class ShopDatabase {
    private static Set<Shop> shops = new HashSet<>();
    static {
        shops.add(new ExtraFoodShop());
        shops.add(new GlutenFreeShop());
        shops.add(new HealthyShop());
    }

    public static Set<Shop> getShops() {
        return shops;
    }
}
