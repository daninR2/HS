package animalsurvival;
import java.util.*;

public class Lion extends Animal{
    
    Scanner scanN = new Scanner(System.in);
    Random rNum = new Random();
    
    public Lion(int hunger, int thirst, int warmth) {
        super(hunger, thirst, warmth);
    }
    
    public void menu(int day) {
        int choice;
       
        System.out.println("\n\tDAY " + day);
        System.out.println(toString());
        
        if (hunger < 1 || thirst < 1 || warmth < 1) {
            System.out.println("\n\nYou have died! You survived for " + day
                    + "days");
            System.exit(0);
        }
        
        System.out.println("\nWhat would you like to do?\n1. Hunt for food"
                + "\n2. Search for water\n3. Find Shelter");
        

        
        choice = scanN.nextInt();
        
        hunger -= 3;
        thirst -= 3;
        warmth -= 3;
        
        switch(choice) {
            case (1):
                findFood();
                break;
                
            case(2):
                findWater();
                break;
                
            case(3):
                findWarmth();
                break;
        }
        
    }
    
    public String toString() {
        return ("ANIMAL: LION" + super.toString());
    }
    
    public void findFood() {
         if (rNum.nextInt(2) == 0) {
             System.out.println("You have successfully hunted food! Your hunger"
                     + " has been fully replenished");
             hunger = hungerCap;
         }
         else
             System.out.println("Unfortunately you did not find any food..."
                     + " another day going hungry");
    }
    
    public void findWater() {
        int num = rNum.nextInt(6) + 6;
        System.out.println("Your thirst has replenished by " + num + " points");
        thirst += num;
        
        if (thirst > thirstCap) {
            thirst = thirstCap;
        }
    }
    
    public void findWarmth() {
        
        System.out.println("You stayed in your den and warmed up today, your"
                + " warmth has increased by 8");
        warmth += 8;
        
        if (warmth > warmthCap) {
            warmth = warmthCap;
        }
        
    }
    
}


