package com.kodilla.good.patterns.lufthansa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    private Set<Flight> flightSet = new HashSet<>();

    public void addFlight(Flight flight) {
        flightSet.add(flight);
    }

    public List<Flight> flightTo(String flightTo) {
        return flightSet.stream()
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<Flight> flightFrom(String flightFrom) {
        return flightSet.stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsThrow(String flightTo, String flightFrom) {
        List<Flight> flightFromList = flightFrom(flightFrom);
        List<Flight> flightToList = flightTo(flightTo);
        return flightFromList.stream()
                .filter(s -> flightToList
                        .stream()
                        .anyMatch(p -> p.getFlightFrom().equals(s.getFlightTo()))
                )
                .collect(Collectors.toList());
    }

}
