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
public class DayTimeGreetingTest {
    
    public DayTimeGreetingTest() {
    }
    
    /**
     * Test of main method, of class StartClass.
     */
    @Test
    public void testMain() throws Exception {
        String[] args = null;
        DayTimeGreeting.main(args);
        ResultMessage instance = new ResultMessage();
        assertNotNull(instance);
    }
    
}
