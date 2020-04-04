package com.kodilla.good.patterns.train;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TrainService {

    private Set<Train> trainSet = new HashSet<>();


    public void addTrain(Train train) {
        trainSet.add(train);
    }

    public List<Train> trainFrom(String trainFrom) {
        return trainSet.stream()
                .filter(t -> t.getTrainFrom().equals(trainFrom))
                .collect(Collectors.toList());
    }

    public List<Train> trainTo(String trainTo) {
        return trainSet.stream()
                .filter(r -> r.getTrainTo().equals(trainTo))
                .collect(Collectors.toList());
    }

    public List<Train> trainBy(String trainTo, String trainFrom) {
        List<Train> trainsFromList = trainFrom(trainFrom);
        List<Train> trainsToList = trainTo(trainTo);
        return trainsFromList.stream()
                .filter(t -> trainsToList
                        .stream()
                        .anyMatch(p -> p.getTrainFrom().equals(t.getTrainTo())))
                .collect(Collectors.toList());
    }
}
