/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_helloworld;

import java.time.LocalTime;
import java.util.Locale;
import org.apache.log4j.Logger;

/**
 *
 * @author Julia
 */
public class CurrentSystemStatus {

    int hours = LocalTime.now().getHour();
    String language = Locale.getDefault().getLanguage();
    final String DAY_TIMES[] = {"NULL", "MORNING", "DAY", "EVENING", "NIGHT"};
    
    private static final Logger logger = Logger.getLogger(CurrentSystemStatus.class.getName());
    
    CurrentSystemStatus() {
    }

    String definitionOfDayTime() {
        String dayTime = DAY_TIMES[0];
        if (hours >= 6 && hours < 9) {
            dayTime = DAY_TIMES[1];
        }
        if (hours >= 9 && hours < 19) {
            dayTime = DAY_TIMES[2];
        }
        else if (hours >= 19 && hours < 23) {
            dayTime = DAY_TIMES[3];
        }
        else if ((hours >= 0 && hours < 6) || (hours == 23)) {
            dayTime = DAY_TIMES[4];
        }
        logger.info("Method definitionOfTime is finished");
        return dayTime;
    }

}
