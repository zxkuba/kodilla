package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorObserverTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTasks krzysiek = new StudentTasks("Krzysiek");
        StudentTasks lukasz = new StudentTasks("Lukasz");
        MentorObserver zbigniew = new MentorObserver("Zbigniew");
        MentorObserver gerwazy = new MentorObserver("Gerwazy");
        krzysiek.registerObserver(zbigniew);
        lukasz.registerObserver(gerwazy);
        //When
        krzysiek.addTasks("Dzieja sie dziwne rzeczy w zadaniu nr 5");
        krzysiek.addTasks("wysylam zadanie 15 ale i tak nie dziala");
        krzysiek.addTasks("W zadaniu 25 jest chyba blad bo nie wiem jak go zrbic");

        lukasz.addTasks("Wysylam zadie 6");
        lukasz.addTasks("Wysylam zadanie 7 z komentarzem");
        lukasz.addTasks("Nie mam pojecia jak zrobic zadanie 8");
        lukasz.addTasks("Zadanie nr 9 jest trywialne szkoda pradu");
        //Then
        assertEquals(3, krzysiek.getTasks().size());
        assertEquals(4, lukasz.getTasks().size());

    }

}