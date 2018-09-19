package com.kodilla.good.patterns.challenges.allegro;

public class Application {
    public static void main(String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformationService(),
                new ProductOrderService(), new OrderDatabase());
        orderProcessor.process(orderRequest);
    }
}
