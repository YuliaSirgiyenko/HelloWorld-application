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

    String ListOfMessages[] = new String[5];
    CurrentSystemStatus thisSystemStatus = new CurrentSystemStatus();
    MessagesInDiffLanguages lang = new MessagesInDiffLanguages();
    
    private static final Logger logger = Logger.getLogger(ResultMessage.class.getName());
    
    ResultMessage() {
    }

    String[] selectLanguage() {
        if (toLowerCase(thisSystemStatus.language) == "ru") {
            ListOfMessages = lang.MESSAGES_RUSSIAN;
        } else {
            ListOfMessages = lang.MESSAGES_ENGLISH;
        }
        logger.info("Method selectLanguage is finished");
        return ListOfMessages;
    }

    void printMessage(String dayTime) {
        selectLanguage();
        logger.info("Method printMessage is working");
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
            case "NULL":
                logger.warn("Impossible value of hours in system");
                System.out.print(ListOfMessages[4]);
                break;
            default:
                logger.warn("Impossible value of hours in system");
                System.out.print(ListOfMessages[4]);
                break;
        }

    }

}
