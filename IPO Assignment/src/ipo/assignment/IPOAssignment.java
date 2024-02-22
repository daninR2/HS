/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo.assignment;
import java.util.Scanner;
import java.text.DecimalFormat;
        
public class IPOAssignment 
{
 public static void main(String[] args) 
 {
     //create scanner
     Scanner scanN = new Scanner(System.in);
     Scanner scanS = new Scanner(System.in);
     DecimalFormat threeDec = new DecimalFormat("#.#######");
     
     //greeting to the store the customer has arrived at
     //create the store name MallWart
     
     String Name;
     String Email_Address;
     double item0 = 11.999;
     double Item1 = 11.989;
     double Item2 = 12.44;
     double Item3 = 9.93;
     double Item4 = 43.42;
     double Item5;
     double total;
    
    if (Email_Address.equals("@")) {
	System.out.println("Email is Valid");
    } else {
	System.out.println("Email is not Valid :(");
    }
     
     DecimalFormat decFor = new DecimalFormat("$###,##0.00");
     System.out.println(decFor.format(Item1));
     System.out.println(decFor.format(Item2));
     System.out.println(decFor.format(Item3));
     
     System.out.println("*************************" 
                + "\n*\t\t\t*"
                + "\n*\tMallWart\t*"
                + "\n*\t\t\t*"
                + "\n*************************"); 
     
     //promt user to input first name
     System.out.print("\nPlease enter your first name: ");
     Name = scanS.nextLine();
     //promt user to input last name
     System.out.print("Please enter your last name: ");
     Name = scanS.nextLine();
     //promt user to input email address
     System.out.print("Please input your Email: ");
     Email_Address = scanS.nextLine();

     //if (!Email_Address.equals(@gmail.com)){
     //} else {
     //System.out.println("Valid Entry");}
     
     //Output items for sale
     System.out.println("\nWe currently have these items for sale:");
     //Output item and price catagories, and create border
     System.out.println("\n\nITEMS\t\t\t\tPRICE");
     System.out.println("-----------\t\t\t--------");
     
    System.out.println("\nAir Jordan 1 University \t$159.99");
    System.out.println("\nNike Dunk Low Retro \t\t$99.99");
    System.out.println("\nAir Jordan 1 Obsidian \t\t$109.99");
     

     
     
     
     
     
    }
    
}
