/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import java.io.IOException;
import org.apache.log4j.Logger;

/**
 *
 * @author Julia
 */

//Main class for application start
public class DayTimeGreeting {

    //Logger creation
    private static final Logger logger = Logger.getLogger(DayTimeGreeting.class.getName());

    public static void main(String args[]) throws IOException {

        //Creation of object for greeting printing
        ResultMessage dayTimeGreeting = new ResultMessage();
        logger.info("ResultMessage object created");

        //Call of method for greeting printer
        dayTimeGreeting.printMessage(dayTimeGreeting.thisSystemStatus.definitionOfDayTime());
        logger.info("Method printMessage is finished");
        logger.info("Application is finished");
    }

}
