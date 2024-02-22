/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codereview;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CodeReview 
{
 public static void main(String[] args)
 {
 System.out.println(" Welcome to the The Three Brothers!");
      
          //create a scanner
          Scanner scanS = new Scanner(System.in);
          Scanner scanN = new Scanner(System.in);
          
          //new decimal format
          DecimalFormat twoDec = new DecimalFormat("$#,###,##0.00");
          
          //declare variables
          String name;
          String phoneNumber;
          String postalCode;
          int menu;
          int remove;
          int item;
          int hats = 0;
          int shirts = 0;
          int hoodie = 0;
          int pants = 0;
          int socks = 0;
          int remHats = 0;
          int remShirts = 0;
          int remHoodie = 0;
          int remPants = 0;
          int remSocks = 0;
          double hatsTotal;
          double shirtsTotal;
          double hoodiesTotal;
          double pantsTotal;
          double socksTotal;
          double shoesTotal;
          double subTotal;
          double tax;
          double total;
          int userChoice;
          int cpuNum = (int)(5 + Math.random()*(20));
          double coupon = cpuNum;
          
          
          hatsTotal = 6.99;
          shirtsTotal = 13.99;
          hoodiesTotal = 19.99;
          pantsTotal = 17.99;
          socksTotal = 3.99;
          subTotal = hatsTotal + shirtsTotal + hoodiesTotal + pantsTotal 
                + socksTotal;
          tax = subTotal * 1.13;
          total = subTotal + tax;
                 
          
          
        //asking user to input info  
        System.out.print("\nWhat is your name?");
        name = scanS.nextLine();
        
        System.out.print("What is your phone number?");
        phoneNumber = scanS.nextLine();
        
        System.out.print("What is your postal code?");
        postalCode = scanS.nextLine();
        
        for (int i = 1; i > 0; i++)
        {
      
        do 
        {
        System.out.println("\nHow can we help you today?");
        System.out.println("\t1. Add to cart");
        System.out.println("\t2. Remove from cart");
        System.out.println("\t3. View cart");
        System.out.println("\t4. Checkout");
        System.out.println("\t5. Cancel");
        
        System.out.print("Choose a menu option(1-5):");
        menu = scanN.nextInt();
        
        if (menu < 1 || menu > 5)
        {
        System.out.println("Invalid option");
        }
        }while (menu < 1 || menu > 5);


        switch (menu) 
        {

        //add
        case 1:
        System.out.println("\nWhat would you like to add to your shopping cart?");
        System.out.println("\t1. Hats ($6.99)");
        System.out.println("\t2. Shirts ($13.99)");
        System.out.println("\t3. Hoodies ($19.99)");
        System.out.println("\t4. Pants ($17.99)");
        System.out.println("\t5. Socks ($3.99)");
        System.out.print("choose an item(1-5)");
        item = scanN.nextInt();
        if (item == 1) {
        System.out.print("How many would you like to add?");
        hats = scanN.nextInt();
        } else if (item == 2) {
        System.out.print("How many would you like to"
        + " add?");
        shirts = scanS.nextInt();
        } else if (item == 3) {
        System.out.print("How many would you like"
        + "to add?");
        hoodie = scanN.nextInt();
        } else if (item == 4) {
        System.out.print("How many would you like to "
        + "add?");
        pants = scanN.nextInt();
        } else if (item == 5) {
        System.out.print("How many would you like to"
        + " add?");
        socks = scanN.nextInt();
        } else {
        System.out.println("This is not an option");
        }
        hatsTotal = 6.99 * hats;
        shirtsTotal = 13.99 * shirts;
        hoodiesTotal = 19.99 * hoodie;
        pantsTotal = 17.99 * pants;
        socksTotal = 3.99 * socks;
        break;
        
        //remove
        case 2:
        System.out.println("What would you like to remove from your shopping "
                + "cart?");
        System.out.println("\t1. Hats ($6.99)");
        System.out.println("\t2. Shirts ($13.99)");
        System.out.println("\t3. Hoodies ($19.99)");
        System.out.println("\t4. Pants ($17.99)");
        System.out.println("\t5. Socks ($3.99)");

        System.out.print("Choose an item(1-5)");
        item = scanN.nextInt();
        if (item == 1)
        {
        System.out.print("How many would you like to remove?");
        hats = scanN.nextInt();
        } else if (item == 2)
        {
        System.out.print("How many would you like to remove?");
        shirts = scanN.nextInt();
        } else if (item == 3)
        {
        System.out.print("How many would you like to remove?");
        hoodie = scanN.nextInt();
        } else if (item == 4)
        {
        System.out.print("How many would you like to remove?");
        pants = scanN.nextInt();
        } else if (item == 5)
        {
        System.out.print("How many would you like to remove?");
        socks = scanN.nextInt();
        } else
        {
        System.out.println("This is not an option");
        }
        hats = hats - remHats;
        shirts = shirts - remShirts;
        hoodie = hoodie - remHoodie;
        pants = pants - remPants;
        socks = socks - remSocks;
        break;
             
        case 3:
        if (hats + shirts + hoodie + pants + socks == 0)
        {
        System.out.println("You haven't ordered anything"); 
        }     
        else
        {
        System.out.format("%1s%-20s%1s%-10s%1s%-10s%5s", "\n|",
        "Item", "|", "Price", "|", "Quantinty", "|");
        
        System.out.format("%1s%-20s%1s%-10s%1s%-10d%5s", "\n|",
        "Hats", "|", twoDec.format(hatsTotal), "|", hats, "|");

        System.out.format("%1s%-20s%1s%-10s%1s%-10d%5s", "\n|",
        "Shirts", "|", twoDec.format(shirtsTotal), "|", shirts, "|");

        System.out.format("%1s%-20s%1s%-10s%1s%-10d%5s", "\n|",
        "Hoodies", "|", twoDec.format(hoodiesTotal), "|", hoodie, "|");

        System.out.format("%1s%-20s%1s%-10s%1s%-10d%5s",
        "\n|", "Pants", "|", twoDec.format(pantsTotal),"|", pants, "|");

        System.out.format("%1s%-20s%1s%-10s%1s%-10d%5s", "\n|",
        "Socks", "|", twoDec.format(socksTotal), "|", socks, "|");
        }
        break;
        
        case 4:

        System.out.println("Thank you for shopping with us," + name 
                +"\nYou have gotten a coupon for " + cpuNum + "%");
        
        hatsTotal = 6.99 * hats;
        shirtsTotal = 13.99 * shirts;
        hoodiesTotal = 19.99 * hoodie;
        pantsTotal = 17.99 * pants;
        socksTotal = 3.99 * socks;
        subTotal = hatsTotal + shirtsTotal + hoodiesTotal + pantsTotal 
                + socksTotal - coupon;
        tax = subTotal * 1.13;
        total = subTotal + tax;
        
        System.out.format("%n%-9s%15s%15s","Item","Price","Quantity");
        
        System.out.format("%n%-9s%15s%15s", "********", "********", 
                "***********");
                
        System.out.format("%n%-9s%15s%15d","Hats", 
                twoDec.format(hatsTotal), hats);
        
        System.out.format("%n%-9s%15s%15d", "Shirts", 
                twoDec.format(shirtsTotal), shirts);
        
        System.out.format("%n%-9s%15s%15d", 
        "Hoodies", twoDec.format(hoodiesTotal), hoodie);
        
        System.out.format("%n%-9s%15s%15d",
        "Pants", twoDec.format(pantsTotal), pants);
        
        System.out.format("%n%-9s%15s%15d",
        "Socks", twoDec.format(socksTotal), socks);
        
        System.out.println("\n\t\tSUBTOTAL\t" + twoDec.format(subTotal));
        System.out.println("\t\tCOUPON:\t\t " + coupon + "%");
        System.out.println("\t\tTAX\t\t" + twoDec.format(tax));
        System.out.println("\t\tTOTAL\t\t" + twoDec.format(total));
        break;
        
        
        case 5:
        System.out.println("\nThanks for shopping at The Three Brothers!");
        break;
        
        }
        if (menu == 5 || menu == 4)
        {

        break;
        }
        }
 }
}
