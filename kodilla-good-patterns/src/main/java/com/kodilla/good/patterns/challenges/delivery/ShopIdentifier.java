package com.kodilla.good.patterns.challenges.delivery;

public class ShopIdentifier {
    public static Shop identifyShopByProduct(Product product){
        return ShopDatabase.getShops().stream()
                .filter(s -> s.getProductList().contains(product))
                .findAny().orElse(null);

    }
}
