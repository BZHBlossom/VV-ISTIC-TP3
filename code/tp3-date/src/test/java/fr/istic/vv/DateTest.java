package fr.istic.vv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.istic.vv.Date.*;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    //### TEST DE ValidDate ###
    @Test
    public void testValidDate(){
        Assertions.assertTrue(isValidDate(1,1, 2020));
    }
    @Test
    public void testNotValidDateIncorrect(){
        Assertions.assertFalse(isValidDate(-1,1, 2020));
    }
    @Test
    public void testValidDateIncorrectDayMonth(){
        Assertions.assertFalse(isValidDate(31,4, 2020));
    }
    @Test
    public void testValidDateIncorrectMonth(){
        Assertions.assertFalse(isValidDate(10,800, 2020));
    }
    @Test
    public void testValidDateIncorrectDay(){
        Assertions.assertFalse(isValidDate(800,800, 2020));
    }
    @Test
    public void testValidDate30Fev(){
        Assertions.assertFalse(isValidDate(30,2, 2020));
    }
    @Test
    public void testValidDate31Jan(){
        Assertions.assertTrue(isValidDate(31,1, 2020));
    }

    //### TEST DE LEAPYEAR ###
    @Test
    public void testLeapYear(){
        Assertions.assertTrue(isLeapYear(2020));
    }
    @Test
    public void testNotLeapYear(){
        Assertions.assertFalse(isLeapYear(2021));
    }
    @Test
    public void testLeapYearIncorrect(){
        Assertions.assertFalse(isLeapYear(-50));
    }
    @Test
    public void testLeapYearZero(){
        Assertions.assertTrue(isLeapYear(0));
    }
}