package com.kodilla.good.patterns.train;

import java.util.List;

public class App {

    public static void main(String[] args) {

        TrainService trainService = new TrainService();
        trainService.addTrain(new Train("Wroclaw", "Krakow"));
        trainService.addTrain(new Train("Krakow", "Rzeszow"));

        List<Train> trainsFrom = trainService.trainFrom("Wroclaw");
        List<Train> trainsTo = trainService.trainTo("Krakow");
        List<Train> trainsBy = trainService.trainBy("Rzeszow", "Wroclaw");

        System.out.println("From: " + trainsFrom);
        System.out.println("To: " + trainsTo);
        System.out.println("By: " + trainsBy);


    }


}
