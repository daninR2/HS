/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadeassignment;
import java.util.Scanner;
public class ArcadeAssignment 
{
 public static void main(String[] args) 
 {
  //import scanner   
  Scanner scanN = new Scanner(System.in);
  //declare the variables
  int cpuNum = (int)(1 + Math.random()*(50));
  int choiceinput;
  int guess = 0;
  int numofguess = 0;
  int rock = 1;
  int paper = 2;
  int scissors = 3;
  int player = 0;
  int cpu = 0;
  int games = 0;
  int choice;
  int game = 0;
  int answer;
  int count = 0;
  
  
  do 
  {
      System.out.println("\n*****************************************"
                + "\n*\t\t\t\t\t*"
                + "\n*\t   \t\t\t\t*"
                + "\n*\tWELCOME TO DANIYALS ARCADE\t*"
                + "\n*\t\t\t \t\t*"
                + "\n*\t\t\t\t\t*"
                + "\n\nWelcome to Daniyal's Arcade: AKA The Best Arcade "
                + "\nHow TO PLAY GAME 1: Please enter a number between 1 - 50 to "
                + "guess what number the cpu has chosen, you get 5 tries to try to "
                + "win. \nHOW TO PLAY GAME 2: To play rock paper scissors, "
                + "please enter either rock paper or scissors by selecting the "
                + "corresponding numbers, once you choose a number you will play "
                + "3 rounds of rps, CAN YOU WIN!");
      System.out.println("\n\nWhat game would you like to play"
                + "\n1. Number Game"
                + "\n2. Rock, Paper, Scissors, Game!"
                + "\n3. Exit");
                choice = scanN.nextInt();

      
  switch (choice) 
  {
      case 1:
  do
  {
      System.out.println("Welcome to Guess The Number - Press any # key to Start");
        answer = scanN.nextInt();
        count++;
  }
  while ((answer != cpuNum)&&(count<1));

  //start of the for loop   
  for(numofguess=0; numofguess<=4; numofguess++)
  {
      System.out.println("Type in a guess for the number:");
      guess = scanN.nextInt();
      if(cpuNum > guess)
      {
          System.out.println("Guess again, but higher!");
      }
      else if (cpuNum < guess)
      {
          System.out.println("Guess again, but lower!");
      }
      else if (cpuNum == guess)
      {
       System.out.println("Congratulations! ");
      }   
     }//end of for loop 
     //if statement for running out of number guesses 
     if (numofguess>4)
      {
          System.out.println("You ran out of guesses");
      }
     break;
     
     /*************************************************
      *  Second Game, Rock Paper Scissors.             *
      *  Loops used: "While"                           *
      *  Desc: Used because im running multiple times  *
      *************************************************/
      
      case 2:
     while (games < 3) //start of while loop
     {
         System.out.println("\nRock = 1\nPaper = 2\nScissors = 3");
         //declaring game variables
         choiceinput = scanN.nextInt();
         int cpuinput = (int)(Math.random()*3);
         
         //start if statements
         //If cpu does paper and player does rock
         if (cpuinput == 2 && choiceinput == 1)
         {
             System.out.println("Paper wins!\n CPU won!");
         games++;
         cpu++;
         }
         //If player does paper and cpu does rock
         else if (choiceinput == 2 && cpuinput == 1)
         {
             System.out.println("Paper wins!\n Player won!");
         games++;
         player++;
         }
        //If player does rock and cpu does scissors
        else if (cpuinput == 1 && choiceinput == 3)
        {
         System.out.println("Rock wins!" +
                 "\nPlayer won!");
         games++;
         player++;
        }
        //If cpu does rock and player does scissors
        else if (choiceinput == 1 && cpuinput == 3)
        {
         System.out.println("Rock wins!" +
                 "\nCPU won!");
         games++;
         cpu++;
        }
       //If cpu does scissors and player does paper
        else if (cpuinput == 3 && choiceinput == 2 )
        {
            System.out.println("Scissors wins!\nCPU won!");
            games++;
            cpu++;
        }
        //If player does scissors and player does paper
        else if (choiceinput == 3 && cpuinput == 2 )
        {
            System.out.println("Scissors wins!\nPlayer won");
            games++;
            player++;
        }
        else if (choiceinput >= 4)
        {
            System.out.println("Please enter a valid choice");
        }
        //IF Ties
        //If both do rock
        else
          System.out.println("\n*****************************************" 
                + "\n*\t\t\t\t\t*"
                + "\n*\t   \t\t\t\t*"
                + "\n*\t\tITS A TIE\t\t*"
                + "\n*\t\t\t \t\t*"
                + "\n*\t\t\t\t\t*"
                + "\n*****************************************");
        }
  break;
  }  
  } while (choice < 3);
 }
}