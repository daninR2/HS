/*********
 * Project: Switch Homework
 * Programmer: Daniyal Naqvi
 * Date: Sept 29, 2021
 * Program: SwitchHW.java
 * Description: Unit 3 - Switch HW
 ********/

package switchhw;
import java.util.Scanner;

public class SwitchHW 
{
 public static void main(String[] args) 
 {
     String channel;
     Scanner scanS = new Scanner (System.in);
     
     System.out.println("In this town, there are 5 non-cable TV channels. Which"
             + " non-cable channel is your favorite (2,4,6,8,11)?");
     channel = scanS.nextLine();
     //channel = channel.toLowerCase();
     
     switch (channel)
     {
      case "Channel 2":
      System.out.println("Channel 2 got top rating last week!");
      break;
      case "Channel 4":
      System.out.println("Channel 4 shows primarily news!");
      break;
      case "Channel 6":
      System.out.println("Channel 6 shows old movies!");
      break;
      case "Channel 8":
      System.out.println("Channel covers local events!");
      break;
      case "Channel 11":
      System.out.println("Channel 11 is public brodcasting");
      break;
      default:
      System.out.println("The channel does not exist. It must be cable "
              + "channel");
      break;
     
     
     
     
     
     /*
        EXAMPLE - The user will input the current month. Output a description 
        of what the weather might look like that month.
        */
        
        //declare variables/scanners
//        String month;   //the month that the user types in
//        Scanner scanS = new Scanner (System.in);
//        
//        //get user input
//        System.out.print("What month is it? ");
//        month = scanS.nextLine();
        
//        //weather outputs
//        if (month.equalsIgnoreCase("january"))
//        {
//            System.out.println("New year and it's freezing!");
//        }
//        else if (month.equalsIgnoreCase("february"))
//        {
//            System.out.println("WInter is almost over! Still cold!");
//        }
//        else if (month.equalsIgnoreCase("march"))
//        {
//            System.out.println("Spring is around the corner.");
//        }
//        else if (month.equalsIgnoreCase("april"))
//        {
//            System.out.println("Lots of rain!");
//        }
//        else if (month.equalsIgnoreCase("may"))
//        {
//            System.out.println("It's starting to get warmer.");
//        }
//        else if (month.equalsIgnoreCase("june"))
//        {
//            System.out.println("Definately hot out.");
//        }
//        else if (month.equalsIgnoreCase("july"))
//        {
//            System.out.println("Summer break!");
//        }
//        else if (month.equalsIgnoreCase("august"))
//        {
//            System.out.println("It is way too hot out!");
//        }
//        else if (month.equalsIgnoreCase("september"))
//        {
//            System.out.println("Back at school!");
//        }
//        else if (month.equalsIgnoreCase("october"))
//        {
//            System.out.println("Spooky!");
//        }
//        else if (month.equalsIgnoreCase("november"))
//        {
//            System.out.println("It's starting to get cold out.");
//        }
//        else if (month.equalsIgnoreCase("december"))
//        {
//            System.out.println("It's going to be a White Christmas!");
//        }
//        else
//        {
//            System.out.println("That month does not exist...");
//        }
        

        /* SWITCH syntax        switch(variable) {
                                    case expression1:
                                        //line(s) of code that you want to execute
                                        break;
                                    case expression2:
                                        //line(s) of code that you want to erxecute
                                        break;
                                    default:
                                        //line(s) of code that you want to execute
                                        break;
                                }
        */
        
//        //avoid case sensitivity
//        month = month.toLowerCase();    //change input to lowercase
//        
//        
//        //weather outputs
//        switch (month)
//        {
//            case "january":
//                System.out.println("New year and it is freezing!");
//                break;                
//            case "february":
//                System.out.println("Winter is almost over! Still cold!");
//                break;
//            case "march":
//                System.out.println("Spring is around the corner!");
//                break;
//            case "april":
//                System.out.println("Lots of rain!");
//                break;
//            case "may":
//                System.out.println("It's starting to get warmer");
//                break;
//            case "june":
//                System.out.println("Definately hot out");
//                break;
//            case "july":
//                System.out.println("Daniyal's bday");
//                break;
//            case "august":
//                System.out.println("It is way too hot out");
//                break;
//            case "september":
//                System.out.println("Back to school");
//                break;
//            case "october":
//                System.out.println("Spooky");
//                break;
//            case "november":
//                System.out.println("It is starting to get cold out");
//                break;
//            case "december":
//                System.out.println("December goes kkkkkkraaazy!!!");
//                break;
//            default:
//                System.out.println("That month does not exist");
//                break;
//        }//end of my switch
        

        /*
        EXAMPLE - Switch with integers
        */
        
        //declare variables
//      int num;
//      int money = 40;
//      Scanner scanN = new Scanner(System.in);
//        
//      //menu screen
//      System.out.println("You have $" + money + " what would you like to do?"
//                + "\n\t1. Buy a sandwich \n\t2. Go to work \n\t3. Go to sleep"
//                + "\n\t4. Buy a car \n\t5. Buy a house");
//        num = scanN.nextInt();
//        
//        switch (num)
//        {
//            case 1:
//                money -= 16;
//                System.out.println("You bought a grilled cheese sandwich, "
//                        + "you have $" + money + " left.");
//                break;
//            
//            case 2:
//                money += 40;
//                System.out.println("You worked your paper route, you now "
//                        + "have $" + money);
//                break;
//                
//            case 3:
//                System.out.println("You took a nap, you still have $" + money);
//                break;
//                
//            case 4:
//            case 5:
//                System.out.println("You do not have enough money for that...");
//                break;
//                
//            default:
//                System.out.println("That is not a valid option.");
//                break;
//        }
     
 }    
}
