package com.kodilla.good.patterns.foodtodoor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FoodToDoorApp {

    public static void main(String[] args) {

        InformationService informationService = new MailService();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();

        OrderService orderService = new OrderService(informationService, orderRepository);


        Product product1 = new Product("Ziemniaki", new BigDecimal("5.5"), extraFoodShop);
        Map<Product, Integer> map1 = new HashMap<>();
        map1.put(product1, 100);
        Customer customer1 = new Customer("Jan", "Kowalski", "kowalski@wp.pl", "Kraków ul.Zajęcza 14");
        OrderDto orderDto1 = new OrderDto(customer1, map1, false);

        Product product2 = new Product("Spirulina", new BigDecimal("105.0"), healthyShop);
        Map<Product, Integer> map2 = new HashMap<>();
        map2.put(product2, 45);
        Customer customer2 = new Customer("Piotr", "Nowak", "nowak@onet.pl", "Oborniki ul. Długa 2");
        OrderDto orderDto2 = new OrderDto(customer2, map2, false);


        orderService.order(orderDto1);
        orderService.order(orderDto2);

    }
}
