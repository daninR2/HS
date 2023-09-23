/**********
 * Project: Unit 2 Assignment
 * Programmer: Daniyal Naqvi & Faris Saboor
 * Date: Sept 23, 2021
 * Program Name: Unit 2 - Ipo Assignment.java
 * Desc: Unit 2 - IPO, Assignment
 **********/

package unit2assignment;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Unit2Assignment 
{
 public static void main(String[] args) 
 {
  
     Scanner scanN = new Scanner(System.in);
     Scanner scanS = new Scanner(System.in);
     DecimalFormat threeDec = new DecimalFormat("#.#######");
     
     //greeting to the store the customer has arrived at
     //create the store name MallWart
     
     //Declare Variables
     String name1; 
     String initial;
     String name2;
     String email_Address;
     double item1 = 3.99;
     double item2 = 13.99;
     double item3 = 11.99;
     double item4 = 7.99;
     double item5 = 12.99;  
     double sub, tax, total;
     int quan1, quan2, quan3, quan4, quan5;
     double cost1, cost2, cost3, cost4, cost5;


     
     //Store Sign 
     System.out.println("\t*************************" 
                + "\n\t*\t\t\t*"
                + "\n\t*\tMallWart\t*"
                + "\n\t*\t\t\t*"
                + "\n\t*************************"); 
     //Prompt user to input First name, Last name and Email Address
     System.out.print("\nPlease enter your first name: ");
     name1 = scanS.nextLine();
     System.out.print("Please enter the first initial of your name: ");
     initial = scanS.nextLine();
     System.out.print("Please enter your last name: ");
     name2 = scanS.nextLine();
     System.out.print("Please input your Email: ");
     email_Address = scanS.nextLine();
     

     
     DecimalFormat decFor = new DecimalFormat("$###,##0.00");
     //System.out.println(decFor.format(item1));
     
     //Items for sale
     System.out.println("\n\nWe currentley have these items for sale:");
     System.out.format("%n%12s%30s", "Item", "Price" );
     System.out.println("\n\t-----------------------      --------" );
     System.out.format("%15s%30s", "Cookies", (decFor.format(item1)));
     System.out.format("%n%13s%32s", "Shoes", (decFor.format(item2)));
     System.out.format("%n%11s%34s", "Hat", (decFor.format(item3)));
     System.out.format("%n%13s%32s", "Shirt", (decFor.format(item4)));
     System.out.format("%n%13s%32s", "Pants", (decFor.format(item5)));
     
     //Instructions on how to buy
     System.out.println("\n\nHow many of each item would you like to purchase?"
             + "\nType 0 if you do not want to purchase that item.");
     
     //1. Cookies 
     System.out.print("\t     1. Cookies ($3.99 each): ");
     quan1 = scanN.nextInt();
     cost1 = quan1 * item1;
     
     //2. Shoes 
     System.out.print("\t     2. Shoes ($13.99 each): ");
     quan2 = scanN.nextInt();
     cost2 = quan2 * item2;
     
     //3. Hat
     System.out.print("\t     3. Hat ($11.99 each): ");
     quan3 = scanN.nextInt();
     cost3 = quan3 * item3;
     
     //4. Shirt 
     System.out.print("\t     4. Shirt ($7.99 each): ");
     quan4 = scanN.nextInt();
     cost4 = quan4 * item4;
     
     //5. Pants 
     System.out.print("\t     5. Pants ($7.99 each): ");
     quan5 = scanN.nextInt();
     cost5 = quan5 * item5;
     
     //Checkout
     System.out.println("\n\t***M A L L W A R T***");
        
     
     //User information 
     System.out.println("        " + initial + ". " + name2 
                + " * " + email_Address);
     
  
     //Cart 
     System.out.format("%n%-20s%-15s%-6s", "Item", "Quantity", "Cost" );
     System.out.format("%n%-20s%-15s%-1s", "------------------", "--------", 
             "--------" );
     System.out.format("%n%-27s%-11s%-6s", "Cookies", quan1 , // 
             (decFor.format(item1)));
     System.out.format("%n%-27s%-10s%-6s", "Shoes" , quan2 , 
             (decFor.format(item2)));
     System.out.format("%n%-27s%-10s%-6s", "Hat" , quan3 , 
             (decFor.format(item3)));
     System.out.format("%n%-27s%-11s%-6s", "Shirt" , quan4, 
             (decFor.format(item4)));
     System.out.format("%n%-27s%-10s%-6s", "Pants" , quan5 , 
             (decFor.format(item5)));
     System.out.print("\n-------------------------------------------");
      
             

     //Recipt
     sub = cost1 + cost2 + cost3 + cost4 + cost5;
     System.out.println("\n\t\t\tSUBTOTAL    " + (decFor.format(sub)));
     tax = sub * 0.13;
     System.out.println("\t\t\tTAX          " + (decFor.format(tax)));
     total = sub + tax;
     System.out.println("\t\t\tTOTAL       " + (decFor.format(total)));
     
     
     System.out.println("\n\n\nThank you for shopping at MallWart,"
             + " Please contact (MallWart@Wart.com) for a chance to win a "
             + "new TOASTY BUNS toaster.");
     System.out.println("\n\t\t\tTERMS AND CONDITIONS"
             + "\n\nAcknowledge that your MallWart contest is "
             + "not sponsored, endorsed or administered by,\nor "
             + "associated with"
             + " TOASTY BUNS TM."); 
     
     
     
     
     
     
     
     
     
     
     
     
    }
    
}
