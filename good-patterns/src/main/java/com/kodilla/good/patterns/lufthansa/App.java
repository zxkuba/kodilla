package com.kodilla.good.patterns.lufthansa;

import java.util.List;

public class App {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        flightService.addFlight(new Flight("Wroclaw", "Rzeszow"));
        flightService.addFlight(new Flight("Krakow", "Warszawa"));
        flightService.addFlight(new Flight("Gdansk", "Poznan"));
        flightService.addFlight(new Flight("Rzeszow", "Poznan"));

        List<Flight> flightsFrom = flightService.flightFrom("Wroclaw");

        List<Flight> flightsTo = flightService.flightTo("Rzeszow");

        List<Flight> zx = flightService.flightsThrow("Poznan", "Wroclaw");
        System.out.println(flightsFrom);
        System.out.println(flightsTo);

        System.out.println("Test: " + zx);


    }
}
