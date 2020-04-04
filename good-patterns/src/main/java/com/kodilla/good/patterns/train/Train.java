package com.kodilla.good.patterns.train;

import java.util.Objects;

public class Train {

    String trainFrom;
    String trainTo;

    public Train(String trainFrom, String trainTo) {
        this.trainFrom = trainFrom;
        this.trainTo = trainTo;
    }

    public String getTrainFrom() {
        return trainFrom;
    }

    public void setTrainFrom(String trainFrom) {
        this.trainFrom = trainFrom;
    }

    public String getTrainTo() {
        return trainTo;
    }

    public void setTrainTo(String trainTo) {
        this.trainTo = trainTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(trainFrom, train.trainFrom) &&
                Objects.equals(trainTo, train.trainTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainFrom, trainTo);
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainFrom='" + trainFrom + '\'' +
                ", trainTo='" + trainTo + '\'' +
                '}';
    }
}
