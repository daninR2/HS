/*
 * Name: Daniyal Naqvi
 * Date: June 2nd, 2022
 * Desc: An RPG game, created on netbeans output.
 * Program: culminating.java
 */

package culminating;
import java.util.*;
import java.io.*;
public class Culminating {
    //create global scanners
    public static Scanner scanN = new Scanner(System.in);
    public static Scanner scanS = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, IOException{
    
    //inizalize variables
    int choice;
    String userChoice;
    //start of do-while loop
    do {
        //ask the user if they've played before
        System.out.println("█───█ █▀▀ █── █▀▀ █▀▀█ █▀▄▀█ █▀▀ 　 ▀▀█▀▀ █▀▀█ \n" +
"█▄█▄█ █▀▀ █── █── █──█ █─▀─█ █▀▀ 　 ──█── █──█ \n" +
"─▀─▀─ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀───▀ ▀▀▀ 　 ──▀── ▀▀▀▀\n\n█████████████████████████████████████████████████████████\n" +
"█░░░░░░█████████░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
"█░░▄▀░░█████████░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
"█░░▄▀░░█████████░░░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█\n" +
"█░░▄▀░░███████████░░▄▀░░███░░▄▀░░█████████░░▄▀░░█████████\n" +
"█░░▄▀░░███████████░░▄▀░░███░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█\n" +
"█░░▄▀░░███████████░░▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
"█░░▄▀░░███████████░░▄▀░░███░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█\n" +
"█░░▄▀░░███████████░░▄▀░░███░░▄▀░░█████████░░▄▀░░█████████\n" +
"█░░▄▀░░░░░░░░░░█░░░░▄▀░░░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█\n" +
"█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
"█░░░░░░░░░░░░░░█░░░░░░░░░░█░░░░░░█████████░░░░░░░░░░░░░░█\n" +
"█████████████████████████████████████████████████████████\n\nHave you played "
                + "before?(yes/no)");
        userChoice = scanS.nextLine();
        //if yes then send to startGame method
        if (userChoice.equalsIgnoreCase("yes")) {
            System.out.println("\n\nAmazing Lets Start!");
            System.out.println("\nLoading...");
            Thread.sleep(1000);
            System.out.println("\nLoading...");
            startGame();
        }
        //if no then send to intructions and then start game
        else if (userChoice.equalsIgnoreCase("no")) {
            Intructions();
            System.out.println("\nLoading...");
            Thread.sleep(1000);
            System.out.println("\nLoading...");
            startGame();
        }
        //give them a message to tell them that the response was invalid
        else{
            System.out.println("\nPlease enter a valid response\n");
        }
    //end do while, condition for error trapping
    } while (!userChoice.equalsIgnoreCase("yes") 
            || userChoice.equalsIgnoreCase("no"));
          
        
    }
    
    /**
     * Name: startGame
     * Desc: Creates a player object and then starts the game by replaying the 
     * object menu in an infinate while loop
     * @throws IOException 
     */
    
    public static void startGame() throws IOException{
        
        //create player object
        Player obj = new Player();
        
        //print start
        System.out.println("\nWell lets start!");
        //infinate while loop
        while(true){
            //send to player menu
            obj.menu();
            System.out.println(obj);
        }
    }
    
    /**
     * Name: Instructions
     * Desc: Prints out instructions
     */
    
    public static void Intructions(){
        
        //big statement
        System.out.println("INSTRUCTIONS\n\nThis game is played by the user "
                + "(YOU!) making \ndecisions to ultimatly meet your end goal "
                + "of making a MILLION DOLLARS within a month. This will be done"
                + " by taking on random\njobs, creating your own business, "
                + "interacting with others \nand maybe just with a little bit "
                + "of luck. But be careful,\nunexpected events may rise making "
                + "you lose all your hard work.\nSo what do you say? "
                + "Lets start!");
        
    }
        
}
