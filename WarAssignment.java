/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warassignment;
import java.util.*;
public class WarAssignment {
    
    public static ArrayList<String> discardPile = new ArrayList<>();
    public static Scanner scanN = new Scanner(System.in);
    public static Scanner scanS = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        ArrayList<String> drawDeck = new ArrayList<>(Arrays.asList("2♠", "3♠",
        "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "2♥", "3♥","4♥", "5♥",
        "6♥", "7♥", "8♥", "9♥", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣",
        "8♣", "9♣", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦"));
        ArrayList<String> playerOne = new ArrayList<>( );
        ArrayList<String> playerTwo = new ArrayList<>( );
        char choice;
        
        Collections.shuffle(drawDeck);
        
        System.out.println("------|Welcome to WAR|------\n\nBoth players start off with "
                + "10 cards in a deck,\nthen each of them place a card to compare "
                + "between each other.\nIf a players card is greater then the"
                + " others,\nthey will recive all the cards. Player with the "
                + "most cards at the end wins the game.");
        
        for (int i = 0; i < 10; i++) {
            playerOne.add(drawDeck.get(0));
            drawDeck.remove(0);
            System.out.println(" ");
            playerOne.add(drawDeck.get(0));
            drawDeck.remove(0);
        }
        
        do {
            
        } while (choice != 'Go');
        
             


        
            


        
        
    }
    
}
