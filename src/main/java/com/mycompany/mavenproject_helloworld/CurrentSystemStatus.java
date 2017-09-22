package com.mycompany.mavenproject_helloworld;

import java.time.LocalTime;
import org.apache.log4j.Logger;

//@author Julia
public class CurrentSystemStatus {

    //Logger creation
    private static final Logger logger = Logger.getLogger(CurrentSystemStatus.class.getName());

    //Definition of localtime in hours
    int hours = LocalTime.now().getHour();
    
    //Creation of constants for further using.
    final String DAY_TIMES[] = {"NULL", "MORNING", "DAY", "EVENING", "NIGHT"};
       
    CurrentSystemStatus() {
    }

    //Method for definition of dayTime based on current hours.
    String definitionOfDayTime() {
        logger.info("Current hours value is " + hours);
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
        logger.info("Method definitionOfTime is finished, resulted day"
                + "time is " + dayTime);
        return dayTime;
    }

}
