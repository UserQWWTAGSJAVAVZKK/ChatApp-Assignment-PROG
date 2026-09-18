/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    @Test
    public void testUsernameCorrectlyFormatted() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","+27838969876");

        assertTrue(user.checkUserName());
    }

   
    @Test
    public void testUsernameIncorrectlyFormatted() {

        Login user = new Login("kyle","Ch&&sec@ke99!","+27838969876");

        assertFalse(user.checkUserName());
    }

   
    @Test
    public void testPasswordMeetsComplexityRequirements() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","+27838969876");

        assertTrue(user.checkPassword());
    }

    
    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {

        Login user = new Login("kyl_1","password","+27838969876");

        assertFalse(user.checkPassword());
    }

   
    @Test
    public void testCellPhoneNumberCorrectlyFormatted() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","+27838969876");

        assertTrue(user.checkCellPhoneNumber());
    }

  
    @Test
    public void testCellPhoneNumberIncorrectlyFormatted() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","08966553");

        assertFalse(user.checkCellPhoneNumber());
    }

   
    @Test
    public void testLoginSuccessful() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","+27838969876");

        boolean result = user.loginUser("kyl_1","Ch&&sec@ke99!");

        assertTrue(result);
    }

 
    @Test
    public void testLoginFailed() {

        Login user = new Login("kyl_1","Ch&&sec@ke99!","+27838969876");

        boolean result = user.loginUser("kyl_1","WrongPassword1!");

        assertFalse(result);
    }
}