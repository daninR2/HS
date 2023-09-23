/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;
import java.util.*;
import java.io.*;
public class SlotMachine {
    public static Scanner scanN = new Scanner(System.in);
    public static Scanner scanS = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        
        ArrayList<String> Word = new ArrayList<>();
        ArrayList<String> randWord = new ArrayList<>();
        String line, choice, name;
        int num = (int)(1 + Math.random() * 6 + 1 - 1), money;
        
        FileWriter fwriter = new FileWriter("C:\\Users\\daninaqv976\\OneDrive - "
            + "Halton Catholic District School Board\\Computer Science"
            + "\\Grade 12\\Files\\usernamesandmoney.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);
        File myFile = new File("C:\\Users\\daninaqv976\\OneDrive - "
            + "Halton Catholic District School Board\\Computer Science"
            + "\\Grade 12\\Files\\slotmachine.txt");
        Scanner readFile = new Scanner(myFile);
        
        while(readFile.hasNext()) {
            line = readFile.nextLine();
            String[] tokens = line.split(", ");
            for (int i = 0; i < 5; i++) {
                Word.add(tokens[i]);
            }
        }
        System.out.println("Please enter your name...");
        name = scanS.nextLine();
        outputFile.println(name);
        System.out.println("Welcome to the slot machine where you only win, win, WIN "
                + "here are your options, type in Go to start");
        
        do {
            System.out.println("Press go to start!");
            choice = scanS.nextLine();
            String randomOne, randomTwo, randomThree;
            if (choice.equalsIgnoreCase("Go")) {
                randomOne = Word.get((int)(Math.random()*(Word.size())));
                randomTwo = Word.get((int)(Math.random()*(Word.size())));
                randomThree = Word.get((int)(Math.random()*(Word.size())));
                if (randomOne.equals(randomTwo) && randomOne.equals(randomThree)) {
                    money = 30;
                    System.out.println("JackPot Winner: " + name 
                            + "\nYou have won 30$");
                    outputFile.println(name);
                    outputFile.println(money);
                    System.out.println(randomOne + "\t" + randomTwo + "\t" + randomThree);
                }
                else if(randomOne.equals(randomTwo)){
                    money = 10;
                    System.out.println("Congrats: " + name
                            + " You have won 10$");
                    outputFile.println(name);
                    outputFile.println(money);
                    System.out.println(randomOne + "\t" + randomTwo + "\t" + randomThree);
                }
                else if(randomOne.equals(randomThree)){
                    money = 10;
                    System.out.println("Congrats: " + name
                            + " You have won 10$");
                    outputFile.println(name);
                    outputFile.println(money);
                    System.out.println(randomOne + "\t" + randomTwo + "\t" + randomThree);
                }
                else if (randomTwo.equals(randomThree)){
                    money = 10;
                    System.out.println("Congrats: " + name
                            + " You have won 10$");
                    outputFile.println(name);
                    outputFile.println(money);
                    System.out.println(randomOne + "\t" + randomTwo + "\t" + randomThree);
                }
                else{
                    System.out.println("You Lost! " + name
                            + " You won nothing");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" + randomThree);
                }
            }
            do {
                System.out.println("Would you like to play again? (yes/no)");
                choice = scanS.nextLine();
                if (!choice.equalsIgnoreCase("no") && choice.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter a valid choice!");
                }
            } while (!choice.equalsIgnoreCase("no") && choice.equalsIgnoreCase("yes"));
             
        } while (!choice.equalsIgnoreCase("no") && choice.equalsIgnoreCase("yes"));
        
        
    }
 }


