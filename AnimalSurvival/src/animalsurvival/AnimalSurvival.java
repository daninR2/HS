package animalsurvival;
import java.util.Scanner;

public class AnimalSurvival {
    public static Scanner scanN = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int choice = introduction();
        
        Animal player = null;
        switch (choice) {
            case(1):
                player = new Lion(15,15,20);
                break;
            
            case(2):
                player = new Giraffe(10,25,15);
                break;
              
            case(3):
                player = new Fish(10,5,10);
                break;
        }
        for(int i = 1;;i++) {
            player.menu(i);
        }
    }
    
    public static int introduction() {
        
        System.out.println("Welcome to the animal survival game! Choose one of"
                + " the following animals to play as... \nYou will need to keep"
                + " your hunger, thirst, and warmth levels high enough to survive!");
        
        System.out.println("Who would you like to play as: \n1. Lion\n2. Giraffe");
        return scanN.nextInt();
      
    }
    
}
