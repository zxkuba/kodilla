package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever rentRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = rentRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
