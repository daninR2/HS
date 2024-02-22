/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_calculator;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Area_Calculator {

    public static void main(String[] args) {
            System.out.println("\n\tAREA CALCULATOR");
        
        //create a scanner
          Scanner scanS = new Scanner(System.in);
          Scanner scanN = new Scanner(System.in);
          
          //new decimal format
          DecimalFormat twoDec = new DecimalFormat("$#,###,##0.00");
          
          //declare variables 
          int option;
          double triBase;
          double triHeight; 
          double squLength;
          double squWidth;
          double recLength; 
          double recWidth; 
          double cirRadius;
          

        do{
        System.out.println("Choose a shape from the following options\n");
        System.out.println("1. Triangle\n2. Square\n3. Rectangle\n4. Circle\n" +
        "5. Quit\n"); // giving them 4 shapes to find the area of
        option = scanN.nextInt();

        }while(option < 1 || option > 5); // error handling

        switch (option) {

        case 1:
        System.out.print("\nPlease give a base for the triangle: ");
        triBase = scanN.nextDouble();
        System.out.print("\nPlease give a height for the triangle: ");
        triHeight = scanN.nextDouble();
        // asking for the base and height of the triangle to find the area
        Triangle(triBase, triHeight);

        System.out.print("\nThe area of the triangle is: " + twoDec.format
        (Triangle(triBase, triHeight)));// inputting decimal formatter

        break;// ending the program

        case 2:
        System.out.print("\nPlease input the length for the square: ");
        squLength = scanN.nextDouble();
        // asking for the length of the square to find the area
        Square(squLength);

        System.out.print("\nThe area of the square is: " + twoDec.format
        (Square(squLength)));// inputting decimal formatter

        break;// ending the program

        case 3:
        System.out.print("\nPlease enter the length for the rectangle: ");
        recLength = scanN.nextDouble();

        System.out.print("\nPlease enter the width for the rectangle: ");
        recWidth = scanN.nextDouble();
        // asking for the length and width of the rectangle to find the area
        Rectangle(recLength, recWidth);

        System.out.print("\nThe area of the rectangle is: " + twoDec.format
        (Rectangle(recWidth, recLength)));// inputting decimal formatter

        break;// ending the program

        case 4:
        System.out.print("\nPlease input the radius of your circle: ");
        cirRadius = scanN.nextDouble();
        // asking for the radius of the circle to find the area
        System.out.print("\nThe area of the circle is: " + twoDec.format
        (Circle(cirRadius)));// inputting decimal formatter

        break;// ending the program

        case 5:
        System.out.println("\nThe program is now ending");
        }
        asterisks(); //Introduction method
        }

        //**********************************************************************    
    
        public static void asterisks()    
        {
        for (int i=0; i<40; i++)
            System.out.print("");
        
        System.out.println("");
        main(null);
        }//end of asterisks method
        //Methods to calculate the values of the shapes above

        //**********************************************************************
        
        public static double Triangle(double triBase, double triHeight) {
        double triArea;

        triArea = triBase * triHeight / 2;

        return (triArea);
        }
        
        //**********************************************************************
        
        public static double Square(double squLength) {
        double squArea;

        squArea = squLength * squLength;

        return(squArea);
        }
        
        //**********************************************************************
        
        public static double Rectangle(double recLength, double recWidth) {
        double recArea;

        recArea = recLength * recWidth;

        return(recArea);

        }
        
        //**********************************************************************
        
        public static double Circle(double cirRadius) {
        double cirArea;

        cirArea = 3.14 * (cirRadius * cirRadius);

        return(cirArea);



   }



}

