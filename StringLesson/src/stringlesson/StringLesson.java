/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlesson;

/**
 *
 * @author PLAYER ONE
 */
public class StringLesson 
{
 static 
 {
//        //declare a String variable
//        String school;
//        
//        //initialize variable
//        school = "StFX";
//        
//        //decalare and initialize String variable (more efficient)
//        String school = "StFX";
//        
//        //print statement
//        System.out.println("My school's name is: " + school);
        
        
        
        /**************
         * String methods
         * **************/
        String holiday = "Thanksgiving";
        
        //.length returns the length of a String
        System.out.println("The length is: " + holiday.length());
        
        //.toLowerCase() converts it to all lower case letters
        System.out.println("I can't wait for " + holiday.toLowerCase());

        //.toUpperCase() converts it to all upper case letters
        System.out.println("I can't wait for " + holiday.toUpperCase());        

        //.trim() removes white space from the String
        System.out.println("I can't wait for " + holiday.trim());
        
        //.charAt(n) return the character at a specific index
        System.out.println("The fifth letter is " + holiday.charAt(4));
        
        //.compareTo() compares String to determine alphabetic location 
        //return a 0 if the two are equal
        //return a negative number if the 1st value is alphabetically before the 2nd
        //return a positive number if the 1st value is alphabetically after the 2nd
        System.out.println("Alphabetically, " + holiday + "comes before "
                + "Christmas : " + holiday.compareTo("Christmas"));
        System.out.println("Alphabetically, " + holiday + "comes before "
                + "Valentine's Day: " + holiday.compareTo("Valentine's Day"));
        System.out.println("Alphabetically, " + holiday + "comes before "
                + "Thanksgiving : " + holiday.compareTo("Thanksgiving"));
    }
    
}

