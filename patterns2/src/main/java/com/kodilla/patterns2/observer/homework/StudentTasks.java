package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable {
    private final List<Observer> observers;
    private final ArrayDeque<String> tasks;
    private final String studentName;

    public StudentTasks(String studentName) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTasks(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
