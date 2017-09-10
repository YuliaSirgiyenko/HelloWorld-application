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
public class ResultMessageTestSelect {

    //Defenition of variables in different languges for tests run.
    String[] MESSAGES_RUSSIAN = {"Доброе утро, Мир!", "Добрый день, "
        + "Мир!", "Добрый вечер, Мир!", "Доброй ночи, Мир!", "Ошибка определения времени"};
    String[] MESSAGES_ENGLISH = {"Good morning, World!", "Good day, "
        + "World!", "Good evening, World!", "Good night, World!", "Mistake in time definition"};

    public ResultMessageTestSelect() {
    }

    /**
     * Test of selectLanguage method, of class ResultMessage.
     */

    //Test of correct definition of greeting depends on language for russian.
    @Test
    public void testSelectLanguageRu() {
        ResultMessage instance = new ResultMessage();
        instance.thisSystemStatus.language = "ru";
        String[] expResult = MESSAGES_RUSSIAN;
        String[] result = instance.selectLanguage();
        assertArrayEquals(expResult, result);
    }

        //Test of correct definition of greeting depends on language for english.
    @Test
    public void testSelectLanguageEn() {
        ResultMessage instance = new ResultMessage();
        instance.thisSystemStatus.language = "EN";
        String[] expResult = MESSAGES_ENGLISH;
        String[] result = instance.selectLanguage();
        assertArrayEquals(expResult, result);
    }
    
    //Test of correct definition of greeting depends on language for german.
    @Test
    public void testSelectLanguageDe() {
        ResultMessage instance = new ResultMessage();
        instance.thisSystemStatus.language = "de";
        String[] expResult = MESSAGES_ENGLISH;
        String[] result = instance.selectLanguage();
        assertArrayEquals(expResult, result);
    }

}
