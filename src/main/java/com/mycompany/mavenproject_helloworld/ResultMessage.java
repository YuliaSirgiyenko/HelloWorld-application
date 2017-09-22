package com.mycompany.mavenproject_helloworld;

import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

//@author Julia
public class ResultMessage {

    //Logger creation
    private static final Logger logger = Logger.getLogger(ResultMessage.class.getName());

    //Creating of object with current system parameters (hours and local language).
    CurrentSystemStatus thisSystemStatus = new CurrentSystemStatus();

    //Creating of bundle object for further check from properties files
    //depends on local language.
    Locale locale = Locale.getDefault();
    ResourceBundle label = ResourceBundle.getBundle("Greetings", locale);
    
    ResultMessage() {
    }

    //Printing of greeting depends on time (language has been already known).
    void printMessage(String dayTime) {
        logger.info("Local language is " + locale.getLanguage());
        logger.info("Method printMessage is working for dayTime " + dayTime);
        switch (dayTime) {
            case "MORNING":
                System.out.print(label.getString("MORNING"));
                break;
            case "DAY":
                System.out.print(label.getString("DAY"));
                break;
            case "EVENING":
                System.out.print(label.getString("EVENING"));
                break;
            case "NIGHT":
                System.out.print(label.getString("NIGHT"));
                break;
            default:
                logger.warn("Impossible value of hours in system");
                System.out.print(label.getString("DEFAULT"));
                break;
        }

    }

}
