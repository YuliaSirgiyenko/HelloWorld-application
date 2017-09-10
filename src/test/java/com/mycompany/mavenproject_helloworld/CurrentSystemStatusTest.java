/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia
 */
public class CurrentSystemStatusTest {

    public CurrentSystemStatusTest() {
    }

    /**
     * Test of definitionOfDayTime method, of class CurrentSystemStatus.
     */
    @Test
    public void testDefinitionOfDayTimeNight() {
        CurrentSystemStatus instance = new CurrentSystemStatus();
        for (int i = 0; i <= 5; i++) {
            instance.hours = i;
            assertEquals("NIGHT", instance.definitionOfDayTime());
        }
        instance.hours = 23;
        assertEquals("NIGHT", instance.definitionOfDayTime());
    }

    @Test
    public void testDefinitionOfDayTimeMorning() {
        CurrentSystemStatus instance = new CurrentSystemStatus();
        for (int i = 6; i <= 8; i++) {
            instance.hours = 7;
            assertEquals("MORNING", instance.definitionOfDayTime());
        }
    }

    @Test
    public void testDefinitionOfDayTimeDay() {
        CurrentSystemStatus instance = new CurrentSystemStatus();
        for (int i = 9; i <= 18; i++) {
            instance.hours = i;
            assertEquals("DAY", instance.definitionOfDayTime());
        }
    }

    @Test
    public void testDefinitionOfDayTimeEvening() {
        CurrentSystemStatus instance = new CurrentSystemStatus();
        for (int i = 19; i <= 22; i++) {
            instance.hours = i;
            assertEquals("EVENING", instance.definitionOfDayTime());
        }
    }

    @Test
    public void testDefinitionOfDayTimeImpossValues() {
        CurrentSystemStatus instance = new CurrentSystemStatus();
        instance.hours = -5;
        assertEquals("NULL", instance.definitionOfDayTime());
        instance.hours = 30;
        assertEquals("NULL", instance.definitionOfDayTime());
    }

}
