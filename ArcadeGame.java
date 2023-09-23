/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadegame;

import java.util.Scanner;
        
public class ArcadeGame {

    public static void main(String[] args) {

         Scanner scanN = new Scanner(System.in);
         
         int numberGame = 1;
         int RPS = 2;
         int choice;
         int EXIT = 3;
         int game = 0;
                      int count = 0;

          int answerNG;   
            int cpuNum = (int)(1 + Math.random()*(5));

         do
         {
             System.out.println("What Game would You like to play");
             System.out.println("type the game number you want to play");
             System.out.println(numberGame + ". " +" Would you like to Play the Number game!?");
             System.out.println(RPS + ". " + "Would you like to Play Rock, Paper, Scissors!?");
             System.out.println(EXIT + ". " + " EXIT game?");
             choice = scanN.nextInt();
             
         } while(game >= 3);
             
        switch (game) {
            
            
            case 1:
            do
            {
                System.out.println("Guess the Number: ");
                answerNG = scanN.nextInt();
                count++;
            } while ((answerNG != cpuNum ) && (count<5));
            
            if (answerNG != cpuNum)
            {
                System.out.println("U have Failed This GAME!!");
            }
            else
            {
                System.out.println("Congrats!!!!!");
            }
         } 
        
        
    }
    
}
