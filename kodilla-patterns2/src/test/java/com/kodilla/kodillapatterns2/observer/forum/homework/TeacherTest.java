package com.kodilla.kodillapatterns2.observer.forum.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void testUpdateTeacher(){
        //Given
        WalterStudent walterStudent = new WalterStudent();
        GustavoStudent gustavoStudent = new GustavoStudent();
        Teacher tucoSalamanca = new Teacher("Tuco Salamanca");
        Teacher saulGoodman = new Teacher("Saul Goodman");
        walterStudent.registerObserver(tucoSalamanca);
        gustavoStudent.registerObserver(saulGoodman);

        //When
        walterStudent.addExercise("Exercise1");
        walterStudent.addExercise("Exercise2");
        walterStudent.addExercise("Exercise3");
        gustavoStudent.addExercise("Exercise1");
        gustavoStudent.addExercise("Exercise2");

        //Then
        assertEquals(3,tucoSalamanca.getExerciseCount());
        assertEquals(2,saulGoodman.getExerciseCount());


    }
}