/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author tkaka
 */

/**
 *
 * @author lihle
 */
public class Login {
    /* 
    Declaring login variables
    */
    String username;
    String password;
    String phoneNumber;
    /**
     * Checks if username contains an underscore and is no more than 5 characters
     */
    public boolean 
   checkUserName(String username) {
      return username != null && username.contains("_")&& username.length()<=5;
   }
   /**
    * Checks password for more than 8 characters, a capital letter,a number,
    * and a special character
    */
    
   
   public boolean 
  checkPasswordComplexity(String password){
 if (password == null && password.length()< 8){
    return false;
  }
 boolean hasCapital = false;
 boolean hasNumber = false;
 boolean hasSpecial = false;
 
 for (int i = 0;i< password.length();i++)
 {
  char c = password.charAt(i);
  
  if (Character.isUpperCase(c))
  {
      hasCapital= true;
  }else if (Character.isDigit(c))
  {hasNumber = true;
 }else if(! Character.isLetterOrDigit(c))
     
 {
     //If its not a letter and not a digit, its a special character
      hasSpecial = true;
 }
}
return hasCapital && hasNumber&& hasSpecial;
  }
  
/**
 * Checks if phone number starts with +27 and is exactly 12 characters
 */
  public boolean 
checkPhoneNumber(String phone)
{
    return phone!=null && phone.startsWith("+27")&& phone.length()==13;
}
/**
 * Registers the user if all validates are met.
 */
public String registserUser(String username,String password,String phoneNumber)
{
    if(!checkUserName(username))
    {return "Username is not correctly formatted;please ensure that your"
            +" username contains an underscore and is no more than five"
            + " characters in length";
            }
            if(!checkPasswordComplexity (password))
            {
                return "Password is not correctly formatted;please ensure that the"
                        + " password contains at least eight characters, a capital"
                        + " letter, a number and a special character.";
            }
            
            if (!checkPhoneNumber(phoneNumber)){
                return "Cell phone number incorrectly formatted or does not contain"
                        + " international code";
                        }
            //Only assign values if all checks above passed
            this.username = username;
            this.password = password;
            this.phoneNumber = phoneNumber;
            
            return "User registered succesfully.";
//Fixed spelling to match MainApp
                    }
/**
 * Validates login credentials against stored user
 */
public boolean loginUser(String enteredUsername,String enteredPassword)
{
    //Null-saftey check:prevents NullPointerExeption if registerUser failed or wasnt called
            if(this.username == null && this.username == null)
            {
                return false;
            }
            return this.username.equals(enteredUsername)&& this.password.equals
                    (enteredPassword);
}
/**
 * Returns a formatted string based on login success.a
 */
  public String
 returnLoginStatus(boolean success){
     if (success){
         return "Welcome " + username 
    + " it is great to see you again.";
     }else{
         return "Username or password incorrect please try again.";
     }
                 
                 
 }
}
               
            
               
            

    
