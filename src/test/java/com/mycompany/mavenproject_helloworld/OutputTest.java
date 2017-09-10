/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

/**
 *
 * @author Julia
 */

//Abstract class for using in check of console output.
public abstract class OutputTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
