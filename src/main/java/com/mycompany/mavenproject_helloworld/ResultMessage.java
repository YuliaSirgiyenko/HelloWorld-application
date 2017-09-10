/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import org.apache.log4j.Logger;

/**
 *
 * @author Julia
 */
public class ResultMessage {

    /*Creation of array for filling by greetings in denifinite
    language for any dayTime.*/
    String ListOfMessages[] = new String[5];

    //Creating of object with current system parameters (hours and local language).
    CurrentSystemStatus thisSystemStatus = new CurrentSystemStatus();
    
    //Creation of object from class of constants with greeting on differenct languages.
    MessagesInDiffLanguages lang = new MessagesInDiffLanguages();
    
    //Logger creation
    private static final Logger logger = Logger.getLogger(ResultMessage.class.getName());
    
    ResultMessage() {
    }

    //Filling of greetings array with greetings in definite language for any dayTime.
    String[] selectLanguage() {
        if (toLowerCase(thisSystemStatus.language) == "ru") {
            ListOfMessages = lang.MESSAGES_RUSSIAN;
        } else {
            ListOfMessages = lang.MESSAGES_ENGLISH;
        }
        logger.info("Method selectLanguage is finished, local language "
                + "is " + thisSystemStatus.language);
        return ListOfMessages;
    }

    //Printing of greeting depends on time (language has been already known).
    void printMessage(String dayTime) {
        selectLanguage();
        logger.info("Method printMessage is working for dayTime " + dayTime);
        switch (dayTime) {
            case "MORNING":
                System.out.print(ListOfMessages[0]);
                break;
            case "DAY":
                System.out.print(ListOfMessages[1]);
                break;
            case "EVENING":
                System.out.print(ListOfMessages[2]);
                break;
            case "NIGHT":
                System.out.print(ListOfMessages[3]);
                break;
            default:
                logger.warn("Impossible value of hours in system");
                System.out.print(ListOfMessages[4]);
                break;
        }

    }

}
