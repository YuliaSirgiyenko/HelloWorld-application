/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia
 */
public class ResultMessageTestPrint extends OutputTest {

    //Defenition of variable for tests run.
    String testMessagesEnglish[] = {"Good morning, World!", "Good day, "
        + "World!", "Good evening, World!", "Good night, World!", "Mistake in time definition"};

    public ResultMessageTestPrint() {
    }

    /**
     * Test of printMessage method, of class ResultMessage.
     */
    
    //Check of console message for dayTime = MORNING.
    @Test
    public void testPrintMessageMorning() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("MORNING");
        assertEquals("Good morning, World!", output.toString());
    }

    //Check of console message for dayTime = DAY.
    @Test
    public void testPrintMessageDay() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("DAY");
        assertEquals("Good day, World!", output.toString());
    }

    //Check of console message for dayTime = EVENING.
    @Test
    public void testPrintMessageEvening() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("EVENING");
        assertEquals("Good evening, World!", output.toString());
    }

    //Check of console message for dayTime = NIGHT.
    @Test
    public void testPrintMessageNight() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("NIGHT");
        assertEquals("Good night, World!", output.toString());
    }

    //Check of console message for NULL dayTime.
    @Test
    public void testPrintMessageNull() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("NULL");
        assertEquals("Mistake in time definition", output.toString());
    }
    
    //Check of console message for impossible dayTime.
    @Test
    public void testPrintMessageDefault() {
        ResultMessage instance = new ResultMessage();
        instance.printMessage("iuerh k ");
        assertEquals("Mistake in time definition", output.toString());
    }
    
}
