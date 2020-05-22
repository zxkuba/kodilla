package com.kodilla.patterns2.observer.homework;

public class MentorObserver implements Observer {
    private final String mentorname;

    public MentorObserver(String mentorname) {
        this.mentorname = mentorname;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(mentorname + ": New messages from student " + studentTasks.getStudentName() + "\n" +
                ", with new task " + studentTasks.getTasks());
    }

    public String getMentorname() {
        return mentorname;
    }
}
