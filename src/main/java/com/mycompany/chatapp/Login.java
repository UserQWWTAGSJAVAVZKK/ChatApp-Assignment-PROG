
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class Login { 
    
    // Variables used to store the user's username, password and cellphone number
    private String userName; 
    private String password; 
    private String cellPhoneNumber; 
    
    // Constructor: used to create a Login object and store the user's information
    public Login(String userName, String password, String cellPhoneNumber) { 
        this.userName = userName; 
        this.password = password; 
        this.cellPhoneNumber = cellPhoneNumber; 
    } 
  
    // Checks if the username contains an underscore and is 5 characters or less
    public boolean checkUserName() { 
        return userName.contains("_") && userName.length() <= 5; 
    } 
 
    // Checks whether the password meets all the required conditions
    public boolean checkPassword() { 
 
        // These variables keep track of whether the password has each requirement
        boolean hasCapital = false; 
        boolean hasNumber = false; 
        boolean hasSpecialCharacter = false; 
 
        
        // If the password has fewer than 8 characters, it is invalid
        if (password.length() < 8) { 
            return false; 
        } 
 
        
        // Goes through the password one character at a time
        for (int i = 0; i < password.length(); i++) { 
 
            // Gets the current character from the password
            char currentCharacter = password.charAt(i); 
 
            // Checks if the current character is a capital letter
            if (Character.isUpperCase(currentCharacter)) { 
                hasCapital = true; 
            } 
 
            // Checks if the current character is a number/digit
            if (Character.isDigit(currentCharacter)) { 
                hasNumber = true; 
            } 
 
            // Checks if the current character is not a letter or number
            // If it is not, it is treated as a special character
            if (!Character.isLetterOrDigit(currentCharacter)) { 
                hasSpecialCharacter = true; 
            } 
        } 
 
        
        // Password is valid only if it has a capital letter,
        // a number and a special character
        return hasCapital && hasNumber && hasSpecialCharacter; 
    } 
 
    
    // Checks if the cellphone number follows the required South African format
    public boolean checkCellPhoneNumber() { 
 
        // Regular expression that requires +27 followed by exactly 9 digits
        String cellPhoneRegex = "^\\+27\\d{9}$"; 
       
        // Returns true if the cellphone number matches the required format
        return cellPhoneNumber.matches(cellPhoneRegex); 
    } 
 
    
    // Gives a message telling the user whether the username is valid
    public String getUserNameMessage() { 
 
        // If the username is valid, return a success message
        if (checkUserName()) { 
            return "Username successfully captured."; 
        } 
 
        // If the username is invalid, return an error message
        return "Username is not correctly formatted, " 
                + "please ensure that your username contains " 
                + "an underscore and is no more than five characters in length."; 
    } 
 
    
    // Gives a message telling the user whether the password is valid
    public String getPasswordMessage() { 
 
        // If the password is valid, return a success message
        if (checkPassword()) { 
            return "Password successfully captured."; 
        } 
 
        // If the password is invalid, return an error message
        return "Password is not correctly formatted, " 
                + "please ensure that the password contains at least " 
                + "eight characters, a capital letter, a number/digit, " 
                + "and a special character."; 
    } 
 
    
    // Gives a message telling the user whether the cellphone number is valid
    public String getCellPhoneMessage() { 
 
        // If the cellphone number is valid, return a success message
        if (checkCellPhoneNumber()) { 
            return "Cell phone number successfully added."; 
        } 
 
        // If the cellphone number is invalid, return an error message
        return "Cell phone number incorrectly formatted " 
                + "or does not contain international code."; 
    } 
 
    
    // Checks whether all three registration requirements are valid
    public boolean registrationSuccessful() { 
 
        // Returns true only when username, password and cellphone number are valid
        return checkUserName() 
                && checkPassword() 
                && checkCellPhoneNumber(); 
    } 
    
    // Checks whether the username and password entered during login
    // match the username and password stored in the Login object
    public boolean loginUser(String enteredUserName, String enteredPassword) { 
 
        // equals() compares the entered information with the stored information
        return enteredUserName.equals(userName) 
                && enteredPassword.equals(password); 
    } 
 
    
    // Returns a message showing whether the login was successful
    public String returnLoginStatus(boolean loginSuccessful) { 
 
        // If loginSuccessful is true, return the successful login message
        if (loginSuccessful) { 
            return "Login successful. Welcome back!"; 
        } 
 
        // If loginSuccessful is false, return the incorrect login message
        return "Username or password incorrect, please try again."; 
    } 
}

