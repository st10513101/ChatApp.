/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

import java.util.Scanner;
/**
 *
 * @author lihle 
 */
public class MainApp {
public static String[] sentMessages = new String[100];
public static String[] diregardMessages = new String[100];
public static String[] storedMessages = new String[100];
public static String[] messageHashes = new String[100];
public static String[] messagesIds = new string[100];

public static int messageCount = 0;

public static void main(String[]args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    Login loginSystem = new Login();
        
    boolean loginSuccesful = true;
        
        // System.out.println("--- QuickChat Application ---");
        if (loginSuccessful){
            System.out.println("Welcome to QuickChat.");
            System.out.print(3);
            int maxMessages = input.nextInt();
            input.nextLine();
            
            int menuChoice = 0;
            while (menuChoice != 5){
                System.out.println("/nPlease choose an option from the menu:");
                System.out.println("1) Send Messages");
                System.out.println("2) Show recently sent messages");
                System.out.println("3) Quit");
                System.out.println("4) Stored Messages Sub_Menu");
                System.out.println("5) Quit");
                System.out.print("Your choice: ");
                
                menuChoice = input.nextInt();
                input.nextLine(); 
                
           if (menuChoice == 1) {
               for (int i = 0; i < maxMessages; i++) {
                   System.out.print("Enter message payload" + ( i + 1) + ": "
                   String messagePayload = input.nextLine();
               }
               boolean isSent = true;
               boolean isReceived = true;
               boolean isRead = false;
               
               System.out.println("Status: Message Sent) [" + isSent + "]
               }
           }
            else if (menuChoice == 2) {
                System.out.println("Coming Soon.");
           } 
            else if (menuChoice ==3) {
              System.out.println("Exiting application. Goodbye!");
           }
            else {
                System.out.println("Invalid option. Please tyr again.");
            }      
        }
    public static String findLongestMessages() {
        if (messageCount == 0) return "No messgaes available.";
        String longest = storedMessages[0] != null ? storedMessages[0] : "";
        for (int i = 0; i < messageCount; i++) {
            if (storedMessages [i] != null && storedMessages[i].length()> longest.
                    length()) { longest = stoeredMessages[i]
            }
        }
    }
    return longest;
}

 public static String searchByMessagesID(String searchID) {
     for (int i = 0; i < messagesCount; i++) {
         if (messageIds[i] != null && messageIds[i].equals(searchID)) {
             return storedMessages[i];
         }
     }
     return "Message Id not found.";
 }

 public static boolean deleteMessageByHash(String targetHash) {
     for (int i = 0; i < messageCount; i++) {
         if (messageHashes[i] != null && messageHashes[i].equalsIgnoreCase(targetHash)){
             System.out.println("Message: \"" + storedMessages[i] + "\") succesfully deleted.");
             
         //
             for (int j = i; j < messageCount - 1; j++) {
                  storedMessages[j] = storedMessages [j + 1];
                  messageHashes[j] = messageHashes[j + 1];
                  messageIds[j] = messageIds [j + 1];
             }
                 storedMessages[messagesCount - 1] = null;
                 messageHashes[messagesCount -1] = null;
                 messageIDs[messagesCount -1] = null;
                 messageCount--;
                 return true;
     }
 }
 return false;
 }
 public static void runStoredMessagesSubMenu(Scanner input) {
     System.out.print("Select sub_option (a-f: ");
     String choice = input.nextLine(). trim().toLowerCase();
     
     if (choice.equals("a")) System.out.println(storedMessages[0]); 
     else if (choice.equals("b")) System.out.println(["Longest: " + findLongestMessages());
     else if (choice.equals("c")) {
             System.out.print("Enter ID: ");
             System.out.println(searchByMessagesID(input.nextLine()));
             }
     else if (choice.equals("e")){
             System.out.print("Enter Hash: ");
             deleteMessageByHash(input.nextLine());
             }
 }


 

                
        
    


             


    

