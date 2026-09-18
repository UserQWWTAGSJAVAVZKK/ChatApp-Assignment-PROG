/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */

public class ChatApp {

    public static void main(String[] args) {
       
        // Creates a Scanner object to allow the user to enter information
        Scanner input = new Scanner(System.in);

        // Displays the ChatApp registration heading
        System.out.println("==============================");
        System.out.println(" CHATAPP REGISTRATION   ");
        System.out.println("==============================");
       
        // Asks the user to enter their name
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        // Asks the user to enter their surname
        System.out.print("Enter Surname: ");
        String surname = input.nextLine();
        
        // Asks the user to create a username
        System.out.print("Enter username: ");
        String userName = input.nextLine();

       
        // Asks the user to create a password
        System.out.print("Enter password: ");
        String password = input.nextLine();

       
        // Asks the user to enter their cellphone number
        System.out.print("Enter cellphone number: ");
        String cellPhoneNumber = input.nextLine();

       
        // Creates a Login object and sends the username,
        // password and cellphone number to the constructor
        Login user = new Login(
                userName,
                password,
                cellPhoneNumber
        );

        // Prints a blank line to make the output easier to read
        System.out.println();
        
        // Displays the registration results heading
        System.out.println("========== REGISTRATION RESULTS ==========");

       
        // Displays the message showing whether the username is valid
        System.out.println(user.getUserNameMessage());
        
        // Displays the message showing whether the password is valid
        System.out.println(user.getPasswordMessage());
        
        // Displays the message showing whether the cellphone number is valid
        System.out.println(user.getCellPhoneMessage());

       
        // Checks whether all the registration details are valid
        if (user.registrationSuccessful()) {

            // Displays a blank line and registration success message
            System.out.println();
            System.out.println("Registration successful!");

           
            // Creates another Login object for the login process
            // using the username, password and cellphone number
            Login login = new Login(
                    userName,
                    password, cellPhoneNumber
            );

            // Displays a blank line and the login heading
            System.out.println();
            System.out.println("==============================");
            System.out.println("      CHATAPP    LOGIN        ");
            System.out.println("==============================");

           
            // Asks the user to enter their username to log in
            System.out.print("Enter username to login: ");
            String loginUserName = input.nextLine();

           
            // Asks the user to enter their password to log in
            System.out.print("Enter password to login: ");
            String loginPassword = input.nextLine();

           
            // Checks whether the username and password entered
            // match the username and password stored in the Login object
            boolean loginSuccessful = login.loginUser(
                    loginUserName,
                    loginPassword
            );

           
            // Displays a blank line before showing the login result
            System.out.println();
            
            // Displays whether the login was successful or unsuccessful
            System.out.println(
                    login.returnLoginStatus(loginSuccessful)
            );

        } else {

            // Displays a blank line and registration failure message
            System.out.println();
            System.out.println("Registration failed.");
            
            // Tells the user to correct their information
            System.out.println("Please correct your details and try again.");
        }

       
        // Closes the Scanner when the program is finished
        input.close();
    }
}