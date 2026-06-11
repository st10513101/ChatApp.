/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author lihle
 */
public class LoginTest {

  Login testLogin = new Login ();
@Test  
public void testUsernameCorecct() {
    boolean result = testlogin.checkUserName("kyl_1");
    assertTrue(result);
}
@Test
public void testUsernameIncorrect() {
    boolean result = testLogin.checkUserName("kyle_smith);
    assertFalse(result);}
@Test
public void testPasswordSuccess() {
     boolean result = testLogin.checkPassowrdComplexity("ChatApp2026");
    assertTrue(result);}
@Test
public void testPhoneNumberValid(){
    boolean result = testLogin.checkCellPhoneNumber("+276745635967");
    assertTrue(result);}
@Test
public void testPhoneNumberInvalid(){
    boolean result = testLogin.checkCellPhoneNumber("8311234567");
    assertFalse(result);

}
}
@Test
public void testSentMessagesPopulation() {
   // Populates testing enviroment metrics
   MainApp.messageIds[0] = "0834557896";
   MainApp.sentMessages[0] = "Did you get the cake?";
   MainApp.messageCount = 1;
   
   assertEquals("Did you get the cake?" , MainApp.sentMessages[0]);
}
@Test
public void testDisplayLongestMessage() {
    MainApp.storedMessages[1] =  "Where are you? You are late! I have asked you to be on time.";
    MainApp.messageCount = 2;
    
    String expected = "Where are you? You are late! I have aksed you to be on time.";
    assertEquals(expected, MainApp.findLongestMessages());
}

@Test
public void testSearchByMessageId() {
    MainApp.messageIds[3] = "0833884567";
    MainApp.sentMessages[3] = "It is dinner time !";
    MainApp.messageCount = 4;
    
    String expected = "It is dinner time !";
    assertEquals(expected, MainApp.searchByMessageID("0833884567"));
}

@Test
public void testDeleteMessageUsingHashes() {
    MainApp.messageHashes[1] = "Test Message 2";
    MainApp.storedMessages[1] = "Where are you? You are late! I have asked you to be on time.";
    MainApp.messageCount = 2;
    
    assertTrue(MainApp.deleteMessageByHash("Test Message 2"));
    
@Test
public void testSearchByRecipient() {
    MainApp.messageIds[1] = "+27838884567";
    MainApp.storedMessages[1] = "Where are you? You late! I have asked you to be onn time.";
    
    MainApp.messageIds[4] = "+27838884567";
    MainApp.storedMessages[4] = "Ok, I am leaving without you.";
    MainApp.messageCount = 5;
    
    String expected1 = "Where are you? You are late! I have asked you to be on time.";
    String expected2 = "Ok, I am leaving without you.";
    
    assertEquals(expeceted1, MainApp.storedMessages[1]);
    assertEquals(expected2, MainApp.storedMessages[4]);
}
@Test
public void testDisplayReport() {
    MainApp.messageIds[0] = "0834557896";
    MainApp.sentMessages[0] = "Did you get the cake?";
    MainApp.messageCount = 1;
    
    // Validates that the report criteria (Hash, Recipient/ID, and Message)
    assertNotNull(MainApp.messageHashes[0]);
    assertNotNull(MainApp.messageIds[0]);
    assertNotNull(MainApp.sentMessages[0]);
      
}
}