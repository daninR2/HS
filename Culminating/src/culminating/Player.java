/*
 * Name: Daniyal Naqvi
 * Date: June 2nd, 2022
 * Desc: Player Class, has all the needs of the player, and the money balance
 */

package culminating;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Player extends Charactar {
    
//create scanners    
Scanner scanN = new Scanner(System.in);
Scanner scanS = new Scanner(System.in);


    //fields & all local variables
    private int money, time, day, experience, level;
    private String name = null;
    private ArrayList<String> playerItems = new ArrayList<String>();
    private ArrayList<String> playerEstate = new ArrayList<String>();
    private ArrayList<String> playerStore = new ArrayList<String>();
    private ArrayList<String> infinateHunger = new ArrayList<String>();
    
    //arg costructor, super as well as local player var's
    public Player(int hun,int thr,int slp,int mn, int hr, int dy, int
        xp, int lvl, String nm) throws IOException {
        super(hun,thr,slp);
        money = mn;
        time = hr;
        day = dy;
        experience = xp;
        level = lvl;
        name = nm;
    }

    //no-arg constructor | sets money to negitive a million
    public Player() throws IOException{
        money = -1000000;
        time = 24;
        day = 30;
        experience = 0;
        level = 1;
        name = null;
    }
    
    //getters
    public void setCost(int mn){
        money = mn;
    }
    
    public void setTime(int hr){
        time = hr;
    }
    
    public void setDay(int dy){
        day = dy;
    }
    
    public void setExp(int xp){
        experience = xp;
    }
    
    public void setLevel(int lvl){
        level = lvl;
    }
    public void setName(String nm){
        name = nm;
    }
    
    
    //setters
    public int getCost(){
        return money;
    }
    
    public int getTime(){
        return time;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getExp(){
        return experience;
    }
    
    public int getLevel(){
        return level;
    }
    public String getName(){
        return name;
    }

    /**
     * Name: toString
     * Desc: displays all hunger, thirst, sleep, money, day as well as level.
     * @return str 
     */
    
    public String toString(){
        String str = "\nHunger: " + hunger + "\nThirst: " + thirst + "\nSleep: " 
                + sleep + "\nMoney: " + money + "\nDay: " + day + "\nLevel: "
                + level + "\nItems: " + playerItems + "\nPlayer Estate: " + 
                playerEstate + "\nPlayer Store: " + playerStore;
        return str;
    }
    
    /**
     * Name: menu
     * Desc: Displays all the choices and redirects to the desired methods
     */
    
    @Override
    public void menu(){
        //quick if to catch their name before we start, if name is null...
        if (name == null) {
            //ask their name
            System.out.println("\nHello, What is your name?");
            name = scanS.nextLine();
        }
        //statement to display all the menu choices
        System.out.println("\nWelcome " + name + " this the menu, choose an "
                + "option from below:\n1. Food\n2. Drink\n3. Sleep"
                + "\n4. Get A Job\n5. Interact\n6. Propety Mangement\n7. Shop");
        int choice = scanN.nextInt();
        //call the decFields method to reduce hunger, sleep and thirst
        decFields();
        time = time - 12;
        //start of switch, condition is the choice scanner
        switch (choice) {
            //case 1 redicrects user to the eat food method
            case 1:
                eatFood();
                //stops the code if hunger drops to 0 or less
                if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) 
                {
            try {
                lose();
            } catch (FileNotFoundException ex) 
            
            {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
                }
                break;
            //case 2 redicrets user to the drink method
            case 2:
                drink();
                //stops code if thirst drops to 0 or less
                if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) 
                {
                    
            try 
            {
                lose();
            } catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
            }
            break;
            //case 3 redirects the user to the sleep method          
            case 3:
                Sleep();
                //same as other two
                if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) {
            try {
                lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            //case 4, takes user to get a job    
            
            case 4:
            getAJob();
            //day restriction, stops code if day equals to 0 or less
            if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) {
            try {  
                lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,ex);
            }
            }
            break;
            //case 5, takes to the NPC interaction method    
            case 5:
            //interact method is called
            interact();
            if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) {
            try {   
            lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,ex);
            }
            }
            break;
            //case 6, same as others
            case 6:
            //calls work on business method
            workOnBusiness();
            if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) {
            try {  
                lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,ex);
            }
            }
            break;
            case 7:
            {//try-catch because shop is expecting an IO to be thrown or 
             //declared
            try {
                //calls shop
                shop();
            } catch (IOException ex) {
                Logger.getLogger(Player.class.getName()).log
                (Level.SEVERE, null, ex);
            }
            }   
                if (sleep <= 0 || day <= 0 || money >= 0 || hunger <= 0) {
            try {  
                lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
            }
            break;                                                                
            //default incase the user does not type in the correct key
            default:
                System.out.println("Not an option");
        }//end of switch
    }//end of menu
    
    /**
     * Name: eatFood.
     * Desc: Gives options of food to the player from a menu, each option has a
     * randomized statement.
     */
    
    @Override
    public void eatFood(){
        int food = 0;
        do{ 
            System.out.println("This is the eat food menu\n1. Brownies\n2. "
                + "Doritos\n 3. Bannana\t\t\t5$\n4. Pizza\n5. Sandwich\n "
                + "6. Curry \t\t\t10$\n7. Curry Platter"
                + "\n8. Chicken Dinner\n9. Chow Mein\t15$");
            food = scanN.nextInt();
        if (food == 1 || food == 2 || food == 3) {
            //random number to output randomized message 
            int num = (int)(6 + Math.random()* (6 - 1 + 1));    
            //start of switch, prints out randomized messages based off rand-num
            switch(num){
                //cases & statements till the end of case 6
                case 1:
                    System.out.println("Not too filling, but good food"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
                case 2:
                    System.out.println("I sure hope thats not all for today"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
                case 3:
                    System.out.println("Yummmy, more would have been better"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
                case 4:
                    System.out.println("Mmmm, that was nice"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
                case 5:    
                    System.out.println("It tastes better when it cheaper"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
                case 6:
                    System.out.println("Blah, wouldnt wanna have that again"
                            + "\nHunger Has Been Replenished By 3 Points");
                    break;
            }
            //adds 3 points to hunger, takes 5 from money and traps hunger to 
            //the max of 20
            hunger = hunger + 3;
            money = money - 5;
            if (hunger > 20) {hunger = 20;}
        }
        //start of else if, this is for the 10$ foods
        else if (food == 4 || food == 5 || food == 6) {
            //random number to output randomized message 
            int num = (int)(6 + Math.random()* (6 - 1 + 1));    
            //start of switch, prints out randomized messages based off rand-num
            switch(num){
                //statements continue down to case 6
                case 1:
                    System.out.println("Mmmm this was amazing\nHunger Has"
                            + "Been Replenished By 7 Points");
                    break;
                case 2:
                    System.out.println("Why can't life always be this tasty"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 3:
                    System.out.println("Burpppp, yummmmy"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 4:
                    System.out.println("10 Dollars for this???"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 5:    
                    System.out.println("I should probably learn to cook"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 6:
                    System.out.println("Wowza, this was fannnnntatic"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
            }
            //add 7 to hunger, take 10 from money, cap on hunger max
            hunger = hunger + 7;
            money = money - 10;
            if (hunger > 20) {
                hunger = 20;
            }
        }
        //start of else if
        else if (food == 7 || food == 8 || food == 9) {
            //random number to output randomized message 
            int num = (int)(1 + Math.random()* (6 - 1 + 1));    
            //start of switch, prints out randomized messages based off rand-num
            switch(num){
                //continues till case 6
                case 1:
                    System.out.println("Th-this taste, its AMAZING!\nHunger Has "
                            + "Been Replenished By 12 Points");
                    break;
                case 2:
                    System.out.println("I-I can't eat another...bite"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 3:
                    System.out.println("Complemento to the cefo"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 4:
                    System.out.println("A feast fit for a king, and in this case"
                            + " thats moi\nHunger Has Been Replenished By 7 "
                            + "Points");
                    break;
                case 5:    
                    System.out.println("Why-can't I HAVE THIS EVERYDAY"
                            + "\nHunger Has Been Replenished By 7 Points");
                    break;
                case 6:
                    System.out.println("Enough with paying back the debt, I say"
                            + "let's just eat more FOOD\nHunger Has Been "
                            + "Replenished By 7 Points");
                    break;
            }
            //add 12 to hunger, set cap, take 15 from money
            hunger = hunger + 12;
            money = money - 15;
            if (hunger > 20 && infinateHunger.size() < 1) {
                hunger = 20;
            }        
        }
        //error trap
        else{System.out.println("Please enter a valid option");}
        break;
        //end of while
        }while(food < 1 || food > 3);
    }
    
    @Override
    public void drink(){
    //vars
    int drink;
    //do-while start
    do{
        //give them the options...
        System.out.println("What would you like to drink today?\n1. Water (2$)"
                + "\t\t2. Coffee (4$)\t\t3. Milk (6$)");
        drink = scanN.nextInt();
        // if they choose the water
        if (drink == 1) {
            System.out.println("Sipppppp Ahhh, that was refreshing\nThirst has "
                    + "been replenished by 2");
            thirst = thirst + 2;
            money = money - 2;
            break;
        }
        //if they choose coffee
        else if(drink == 2){
            System.out.println("Aw that hits the spot\nThirst has been "
                    + "replenished by 5");
            thirst = thirst + 5;
            sleep = sleep + 2;
            money = money - 4;
            break;
        }
        //if they choose milk
        else if(drink == 3){
            System.out.println("Mooo, nice cup of milk\nThirst has been "
                    + "replenised by 8");
            thirst = thirst + 8;
            money = money - 6;
            break;
        }
        //error-trap
        else{
            System.out.println("Enter a valid option");
        }
    //end of while
    }while(drink < 1 || drink > 3);    
    }
    
    /**
     * Name: Sleep.
     * Desc: Prompts the player with two options of sleeping, naps as well as 
     * full sleep, to which each have their pros and cons.
     **/
    
    @Override
    public void Sleep(){
    //varaibles
    int slp;
    //do-while start
    do{    
        //list options for user
        System.out.println("You are about to sleep, choose an option"
                + "\n1. Nap (4hr)\t\t2. Sleep(8hr)");
        slp = scanN.nextInt();
        //if they choose to nap
        if (slp == 1) {
            System.out.println("I should-YAWN-proably take a quick nap\nSleep"
                    + " has been restored by 4");
            //adjust variables
            sleep = sleep + 4;
            time = time - 4;
            if (sleep > 20) {
                sleep = 20;
            }
            break;
        }
        //if they choose to sleep
        else if (slp == 2) {
            System.out.println("Zzz\nZzz\nZzz\nZzz\n\nYawn that was some restful"
                + "sleep\nSleep has been restored by 8");
            //add sleep but take away time
            sleep = sleep + 8;
            time = time - 8;
            if (sleep > 20) {
                sleep = 20;
            }
            break;
        }
        else{
            System.out.println("Enter a valid option");
        }
    }while(slp < 1 || slp > 2);    
    
    }
    
    /**
     * Name: interact.
     * Desc: Has randomized options for NPC dialog, each have their own unique
     * statements which allow the player to have advantages or disadvantages.
     **/
    
    @Override
    public void interact(){
        //create variables
        int num = (int)(1 + Math.random()* (5 - 1 + 1)); 
        int choice;
        //create switch, based off random numbers
        switch(num){
            case 1:
                //start do while
                do {
                    //prompt them with options
                    System.out.println("Theres a odd looking guy standing "
                        + "at the edge of an ally, What do you do?"
                        + "\n1. Say Hi\t\t2. Ask for help\t\t3. Walk away");
                    choice = scanN.nextInt();
                    //if choice one, start side quest
                    if (choice == 1) {
                        do{
                        System.out.println("Look, I'm not helping you at all"
                            + "unless you ain't bring me one bannana and lets not forget the turbo drive! "
                            + "\n1. Give the Spatula\t\t2. Walk away");
                            choice = scanN.nextInt();
                            if (choice == 1){ 
                                if (playerItems.contains("spatula")) {
                                    System.out.println("You-you helped me- now "
                                    + "I can become a chef like I've always"
                                    + " dreamed about.\nThe odd man then "
                                    + "cast a spell on you making it so "
                                    + "you would never lose hunger again");
                                    System.out.println("You gave the spatula");
                                    playerItems.remove("spatula");
                                    infinateHunger.add("yes");
                                    hunger = hunger + 100000;
                                }
                            else{System.out.println("You don't have it");}
                            }
                            //if choice equals two, you walk away
                            else if (choice == 2) 
                                System.out.println("You walked away");
                            //send to decrease fields
                            decFields();
                            experience = experience + 5;
                            if (experience > 10) {
                                experience = 0;                                
                                level = level + 1;
                                System.out.println("\nLEVEL UP!");
                            }
                            //have them answer as a valid response
                            else{
                                System.out.println("Enter a valid response");
                            }
                            }while(choice < 1 || choice > 2);
                        }
                        //next statment
                        else if (choice == 2) {
                            System.out.println("I don't got what you want, but "
                                    + "I may have something else for the next "
                                    + "time you come. Until then SCRAM!"
                                    + "\nYou walked away 5 xp has been gained");      
                            decFields();
                            experience = experience + 5;
                            if (experience > 10) {
                                experience = 0;    
                                level = level + 1;
                                System.out.println("\nLEVEL UP!");
                            }
                        }
                        else if (choice == 3) {
                            System.out.println("That could have been bad");
                            decFields();                            
                        }
                        //error trap
                        else{
                            System.out.println("Enter a valid option");
                        }
                    } while (choice < 1 || choice > 3);
                    break;
                //case 2-5, all simmilar dialogs, diffrent after effects
                case 2:
                    do {
                        System.out.println("You see an old lady walking through"
                                + " the streets by herself, unfortunaly for her "
                                + "she also dropped her wallet. What do you do?"
                                + "\n1. Offer to help\t\t2. Run away with her "
                                + "wallet\t\t3. Walk away");
                        choice = scanN.nextInt();
                        if (choice == 1) {
                            System.out.println("GET AWAY FROM ME! I AM FULLY "
                                    + "CAPABLE OF WALKING ALONE! "
                                    + "\nWith Your Head Down You walked "
                                    + "away 5 xp has been gained");
                            decFields();
                            experience = experience + 5;
                            if (experience >= 10) {
                                experience = 0;
                                level = level + 1;
                                System.out.println("\nLEVEL UP!");
                            }
                        }
                        else if (choice == 2) {
                        int chance = (int)(1 + Math.random()* (2 - 1 + 1));    
                            switch(chance){
                                case 1:
                                    System.out.println("Huff-Puff-Puff\nHooo "
                                            + "can't believe I actally got away"
                                            + "\nYou Opened the Wallet to See "
                                            + "1000k Dollars\n5 xp has been "
                                            + "gained");
                                    money = money + 1000;
                                    break;
                                    
                                case 2:
                                    System.out.println("PUT YOUR HAND BEHIND "
                                            + "YOUR BACK AND RETURN THE WALLET"
                                            + "\nYou returned the wallet and "
                                            + "went to jail for 3 days\n10"
                                            + " xp has been gained");
                                    experience = experience + 5;
                                    day = day - 3;
                                    break;
                            }
                            decFields();
                            experience = experience + 5;
                            if (experience >= 10) {
                                experience = 0;
                                level = level + 1;
                                System.out.println("\nLEVEL UP!");
                            }
                        }
                        else if (choice == 3) {
                            System.out.println("SCEECH, You turn around to see "
                                    + "a car has hit the old lady (IF ONLY "
                                    + "SOMEONE COULD HAVE\nHELPED ME CROSS THE "
                                    + "ROAD) she yelled\nNo xp was gained ");
                            time = time - 1;
                            decFields();               
                            if (time > 24) {
                                day = day - 1;
                            }                            
                        }
                        else{
                            System.out.println("Enter a valid option");
                        }
                    } while (choice < 1 || choice > 3);
                    break;
                    
                case 3:
                    int chance = (int)(1 + Math.random()* (2 - 1 + 1));
                    do {
                        System.out.println("A man runs urgently towards you, "
                            + "money for food he says. What do you do?"
                            + "\n1. Give him the five dollars\t\t2. Walk Away");
                        choice = scanN.nextInt();
                        if (choice == 1) {
                            System.out.println("Because of the kindness of your "
                                    + "heart you give him 5 dollars");
                            switch(chance){
                                case 1:
                                    System.out.println("\nYou watch him walk in"
                                        + " and buy a lotto ticket, he wins. "
                                        + " You ask him if you can get a cut\n"
                                        + "He punches you in the face and runs "
                                        + "away");
                                        decFields();       
                                        experience = experience + 5;
                                        if (time > 24) {
                                            day = day - 1;
                                        }
                                        if (experience >= 10) {
                                            experience = 0;
                                            level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                        }
                                    break;
                                
                                case 2:
                                    System.out.println("\nHe walks into the "
                                            + "store and buys food\nYou walk "
                                            + "away");
                                        decFields();      
                                        experience = experience + 5;
                                        if (time > 24) {
                                            day = day - 1;
                                        }
                                        if (experience >= 10) {
                                            experience = 0;
                                            level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                        }                                    
                                    break;
                                    
                                case 3:
                                    System.out.println("He walks inside and buys"
                                            + " a lotto ticket, happily he "
                                            + "walks over to you and hands you "
                                            + "a handsome split of his 200k win"
                                            + "\nYou gained 5 xp and 100k");
                                        money = money + 100000;
                                        decFields();       
                                        experience = experience + 5;
                                        if (time > 24) {
                                            day = day - 1;
                                        }
                                        if (experience >= 10) {
                                            experience = 0;
                                            level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                        }                                    
                                    break;
                                
                                default:
                                    System.out.println("Enter a valid option");
                            }
                        }
                        else if (choice == 2) {
                            System.out.println("You left the poor man begging"
                                    + "\nNo xp has been gained");
                                    decFields();     
                                    if (time > 24) {
                                        day = day - 1;
                                    }
                        }
                        else{
                            System.out.println("Enter a valid option");
                        }
                    } while (choice < 1 || choice > 2);
                    break;
                    
                case 4:
                    do {
                       System.out.println("You meet a man claiming he's a "
                            + "decendant of a very wealthy family. He hands "
                            + "\nyou a blanc check and tells you to enter any"
                            + "amount and deposit it to the bank\nWhat do "
                            + "you do? \n1. Take it to the bank\t\t2. Leave it");
                       choice = scanN.nextInt();
                        if (choice == 1) {
                            System.out.println("You take the check and write "
                                    + "down a million dollars. Finally thinking "
                                    + "your free you happly hand it to the clerk"
                                    + "\nwho then tells you that you've commeted"
                                    + " fraud and calls the police\nYou spent "
                                    + "1 day in jail. You've gained 10 xp");
                                    decFields();       
                                    experience = experience + 10;
                                    day = day - 1;
                                    if (experience >= 10) {
                                        experience = 0;
                                        level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                    }                                
                        }
                        else if (choice == 2) {
                            System.out.println("You leave him waving his check "
                                    + "in the air\nNo xp has been gained");
                                decFields();                            
                        }
                        else{
                            System.out.println("Enter a valid option");
                        }
                    } while (choice < 1 || choice > 2);
                    break;
                    
                case 5:    
                    int chance2 = (int)(1 + Math.random()* (2 - 1 + 1));
                    do {
                        System.out.println("You meet a man who offers to take "
                            + "you to get some coffee. You agree and there he "
                            + "starts to talk to you about opening a business"
                            + "\nHis ideas sound promising, until he asks "
                            + "you to invest 100k promising that the business "
                            + "will turn it into 500k\nWhat do you do?\t\t"
                            + "1. Give him the 100k\t\t2. Deline his offer");
                    choice = scanN.nextInt();
                    switch(chance2){
                        case 1:
                            System.out.println("After giving your 100k you "
                                    + "patiently wait for the return of your "
                                    + "investment. It never comes\n15 xp has "
                                    + "been gained");
                                    money = money - 100000;
                                    decFields();
                                    experience = experience + 15;
                                    if (experience >= 10) {
                                        experience = 0;
                                        level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                    }
                                    if (time == 0) {
                                        time = time + 24;
                                        day = day - 1;
                                    }
                            break;
                            
                        case 2:
                            System.out.println("You get a call from an unknown "
                                    + "number, it appears to be the business "
                                    + "guy. He tells you a man is on his way "
                                    + "to give the 500k. Happly you rush to the "
                                    + "door and find your money\n500k has been "
                                    + "gained");
                                    decFields();
                                    money = money + 500000;
                                    experience = experience + 5;
                                    if (experience >= 10) {
                                        experience = 0;
                                        level = level + 1;
                                        System.out.println("\nLEVEL UP!");
                                    }
                            break;
                            
                        default:
                            System.out.println("Enter a valid option");
                    }
                    } while (choice < 1 || choice > 2);
                    break;
                    
            }
    }
    
    /**
     * Name: getAJob.
     * Desc: Shows an array of jobs to the user and prompts them with a choice
     * to choose their prefered job.
     */
    
    @Override
    public void getAJob(){
        
        //create var
        int uChoice;
        //start of do-while
        do {
        //beginning statement
          System.out.println("Hello this is the job menu, what would you like to "
                + "do?\n1. Search for Job\t\t2. Get a Job");
        uChoice = scanN.nextInt();
        //if choice is equal to 1
        if (uChoice == 1) {
                  String[] jobNames = {"Lawnmower", "Dog walker", 
            "Window Cleaner", "Vber", "Food Clerk", 
            "Car Washer","Software Engineer", "Accountant",
            "Surgon"};
        //create vars and wage array
        int[] jobWage = {10, 10, 12, 30, 18, 22, 100, 70, 80};
        int keyIndex;
        String key;
        //send vars to sort array
        sortArray(jobNames, jobWage);
        //start of for loop
        for (int i = 0; i < jobWage.length; i++) {
            System.out.println(jobNames[i]);
        }
        //ask what there searching for and put that into the key var
        System.out.println("What job are you searching for?");
        key = scanS.nextLine();
        //send to key
        keyIndex = key(key, jobNames);
        //if key is not found
        if (keyIndex == -1) 
            System.out.println("This job is not in out directory");
        else
            System.out.println(jobNames[keyIndex] + " has a wage of "
                    + jobWage[keyIndex]);  
        }
        //if userChoice is equal to 2
        else if(uChoice == 2){
            //make vars
            int choice;
            //start of do-while
            do {
            //present them with a big statement
            System.out.println("\nWelcome to Indood Please look through our "
                + "list of jobs\n1. Lawnmower (10$ + 2hr)\t"
                + "\t2. Dog walker (10$ + 1hr)\t\t3. Window Cleaner (12$ + 3hr)"
                + "\n4. Vber (30$ + 2hr)\t\t5. Food Clerk (18$ + 1hr)\t"
                + "\t6. Car Washer (22$ + 3hr)\n7. Software Enginner "
                + "(100$ + 4hr)\t\t8. Accountant (70$ + 3hr)\t\t"
                + "9. Surgeon (80$ + 5hr)");
        choice = scanN.nextInt();
        //create switch, depends on choice
        switch(choice){
            //case 1-9, statements and diffrent money addition
            case 1:
                System.out.println("\nYou worked for 2 hours and made 20$");
                decFields();
                money = money + 20;
                time = time - 2;
                break;
                
            case 2:
                System.out.println("\nYou worked for 1 hours and made 10$");
                decFields();
                money = money + 10;
                time = time - 1;
                break;
                
            case 3:
                System.out.println("\nYou worked for 3 hours and made 36$");
                decFields();
                money = money + 36;
                time = time - 1;
                break;
            
            case 4:
                System.out.println("\nYou worked for 2 hours and made 60$");
                decFields();
                money = money + 60;
                time = time - 1;
                break;
                
            case 5:
                System.out.println("\nYou worked for 1 hours and made 18$");
                decFields();
                money = money + 18;
                time = time - 1;
                break;
                
            case 6:
                System.out.println("\nYou worked for 3 hours and made 44$");
                decFields();
                money = money + 44;
                time = time - 1;
                break;
            
            case 7:
                if (level > 15) {
                   System.out.println("\nYou worked for 4 hours and made 400$");
                   decFields();
                   money = money + 400;
                   time = time - 4;
                }
                else if (level < 15) {
                    System.out.println("You don't have enough level's");
                }
                break;
                
            case 8:
                if (level > 15) {
                    System.out.println("\nYou worked for 3 hours and made 210$");
                    decFields();
                    money = money + 210;
                    time = time - 3;
                }
                else if (level < 15) {
                    System.out.println("You don't have enough level's");
                }
                break;
                
            case 9:
                if (level > 15) {
                    System.out.println("\nYou worked for 5 hours and made 400$");
                    decFields();
                    money = money + 400;
                    time = time - 5;
                }
                else if (level < 15) {
                    System.out.println("You don't have enough level's");
                }
                break;
            //defualt to error trap    
            default:
                System.out.println("Please enter a valid option");
        //end switch
        }
        } while (choice < 1 || choice > 9); 
        }
        else{
            System.out.println("Enter a valid choice");
        }  
        } while (uChoice < 1 || uChoice > 2);
    }
    
    /**
     * Name: sortArray
     * Desc: Sorts the array through the use of the job names sent down
     * @param jobNames
     * @param jobWage 
     */
    
    public static void sortArray(String[] jobNames, int[] jobWage){
        //inizalize variables
        String minVal;
        int midIndex, dummy;
        //start for-loop
        for (int i = 0; i < jobNames.length - 1; i++) {
            //minimun value starts at i
            minVal = jobNames[i];
            //i is also middle of the index
            midIndex = i;
            //start of inner for loop
            for (int j = i + 1; j < jobNames.length; j++) {
                if(jobNames[j].compareTo(minVal) < 0) {
                    //make minimum value equal to job names at j
                    minVal = jobNames[j];
                    midIndex = j;
                }
            }
            //make midIndex equal to jobNames at i
            jobNames[midIndex] = jobNames[i];
            jobNames[i] = minVal;
            //have a dummy hold midIndex
            dummy = jobWage[midIndex];
            jobWage[midIndex] = jobWage[i];
            //make wage equvilant to dummy
            jobWage[i] = dummy;
            
        }    
    }
    
    /**
     * Name: key
     * Desc: Searches for a key through out an array.
     * @param key
     * @param names
     * @return 
     */
    
    public static int key(String key, String[] names){
        //inizalize variables
        int first = 0, mid = 0, last = names.length - 1;
        boolean isFound = false;
        //start while when not found and first is less then last
        while(!isFound && first <= last) {
            //middle equals first plus last divided by 2
            mid = (first + last) / 2;
            //if the name in the middle is equal to the key
            if(names[mid].equalsIgnoreCase(key)) 
                //make isFound true
                isFound = true;
            //if not found there but less then 0
            else if (names[mid].compareToIgnoreCase(key) > 0)
                //make last equal to one less then middle
                last = mid - 1;
            //do the same but opposite process
            else if (names[mid].compareToIgnoreCase(key) < 0)
                //make first equal to mid adding one
                first = mid + 1;
        }
        
        //when found return middle
        if (isFound) 
            return mid;
        //if not return -1
        else
            return -1;
    }
    
    /**
     * Name: workOnBusiness.
     * Desc: Send the player to their desired choice of methods, either 
     * convinence or real estate.
     */
    
    @Override
    public void workOnBusiness(){
        //inizialize variables
        int choice;
        do {
          //prints them with an option
        System.out.println("This is work on Business, Choose a business you "
               + "would like to work on\n1. Real Estate\t"
               + "\t2. Convinence Store");
        choice = scanN.nextInt();
        //if choice is one, send them to realEstate method
        if (choice == 1) {
            realEstate();
        }
        //if choice is 2 then send the to convience store
        else if(choice == 2){
            convienceStore();
        }
        else{
            System.out.println("Enter a valid response");
        }  
        } while (choice < 1 || choice > 2);

        
        
    }
    
    /**
     * Name: realEstate
     * Desc: Prints out the options of the multiple house's you can buy.
     */
    
    public void realEstate(){
        //inizalize variables
        int choice;
        //start of do-while
        do {
        System.out.println("Welcome to property browsing, what propety would "
                + "you like to buy?\n1. Small House 20 000$\t\t2. Medium House "
                + "200 000$\t\t3. Big House 500 000$");
        choice = scanN.nextInt();
        //if choice is equal to one
        if (choice == 1) {
            //subtract the money
            money = money - 20000;
            System.out.println("You now own a Small House, what would you like "
                    + "to do?\n1. Sell\t\t2. Rent");
            choice = scanN.nextInt();
            //add a small house to the players arraylist
            playerEstate.add("Small House");
            if (choice == 1) {
                System.out.println("SOLD\nYour property was sold for 25 000$");
                money = money + 250000;
            }
            else if (choice == 2) {
                System.out.println("You listed your property for rent, you will"
                        + " gain 8000$ per week");
                money = money + 8000;
            }
            //if they don't answer a valid question
            else{
                System.out.println("Enter a valid option");
            }
        }
        //if choice is equal to 2
        else if(choice == 2){
            //subtract money
            money = money - 200000;
            System.out.println("You now own a Medium House, what would you like "
                    + "to do?\n1. Sell\t\t2. Rent");
            choice = scanN.nextInt();
            //add the house to the players arrayList
            playerEstate.add("Medium House");
            if (choice == 1) {
                System.out.println("SOLD\nYour property was sold for 250 000$");
                money = money + 250000;
            }
            else if (choice == 2) {
                System.out.println("You listed your property for rent, you will"
                        + " gain 12000$ per week");
                money = money + 12000;
            }
            //if they don't answer a valid options
            else{
                System.out.println("Enter a valid option");
            }
        }
        else if(choice == 3){
            money = money - 500000;
            System.out.println("You now own a Large House, what would you like"
                    + " to do?\n1. Sell\t\t2. Rent");
            choice = scanN.nextInt();
            playerEstate.add("Large House");
            if (choice == 1) {
                System.out.println("SOLD\nYour property was sold for 250 000$");
                money = money + 650000;
            }
            else if (choice == 2) {
                System.out.println("You listed your property for rent, you will"
                        + " gain 12000$ per week");
                money = money + 120000;
            }
            else{
                System.out.println("Enter a valid option");
            }
        }
        else{
            System.out.println("Enter a valid option");
        }
        } while (choice < 1 || choice > 3);
    }

    /**
     * Name: convienceStore.
     * Desc: Buys the player a store and checks the array list from the player 
     * to see if they already own a store.
     */
    
    public void convienceStore(){
        //inizalize variables
        String choice, strChoice;
        //if the playerstore array is empty
        if (playerStore.size() == 0) {
            //start of do-while
            do {
            System.out.println("Welcome to buy a store, would you like to "
                    + "purchase a convience store for 500k (yes/no)?");
            choice = scanS.nextLine();
            //if the player wants to buy the store
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("You have purchased a convience store, "
                        + "you will make 5000$ per day.\nWhat would you like "
                        + "to name your store?");
                //add the store with the desired name to the arraylist
                playerStore.add(strChoice = scanS.nextLine());
            }
            //if the choice is equal to no
            else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Good Bye");  
            }
            //error trap and tell them the haven't put a valid response
            else{
                System.out.println("Please enter a valid response");
            }
            //end of do-while
        } while (!choice.equalsIgnoreCase("yes") 
                    || choice.equalsIgnoreCase("no"));
        }
        //if the player already owns a store, tell them they already have one
        else if (playerStore.size() == 1) {
            System.out.println("You already own a store");
        }
    }
    
    /**
     * Name: Shop
     * Desc: Prints the items in the shop, and sorts the items alphabetically
     * @throws IOException 
     **/
    
    @Override
    public void shop() throws IOException{
        
        //inizalize variables
        String search, line, choice;
        boolean flag = true;
        String dummy;
        int num = (int)(1 + Math.random() * 6 + 1 - 1);
        //create 3 String arraylists
        ArrayList<String> Word = new ArrayList<>();
        ArrayList<String> randWord = new ArrayList<>();
        ArrayList<String> items = new ArrayList<String>();
        //add the following items to an array list
        items.add("Lotto Ticket");
        items.add("Spatula");
        items.add("Bat");
        items.add("Car");
        
        System.out.println("Welcome to AmazingOn\nHere are our deals:" );
        
        //while true condition, as the boolean flag is true
        while  (flag) { 
            //change the boolean to false
            flag = false;
            //start of for-loop
            for(int i=0; i < items.size() - 1; i++ ) {
                //if the item at "1" is equal to item at "2"
                if (items.get(i).compareToIgnoreCase(items.get(i + 1)) > 0) {
                    //then make dummy equal to item at i
                    dummy = items.get(i);
                    //set items to item at i + 1
                    items.set(i, items.get(i + 1));
                    items.set(i+1, dummy);
                    //change flag back to true
                    flag = true;
                } 
                
            }
        }
        
        //run for-loop for the size of the arrays list
        for(int i=0; i < items.size(); i++) {
            //pring out the item at i
            System.out.println(items.get(i));
        }
        
        //create my file for the file input
        File myFile = new File("lottoticket.txt");
        //create the scanner that would read from thefile
        Scanner readFile = new Scanner(myFile);
        
        //start of while for tokanizing
        while(readFile.hasNext()) {
            line = readFile.nextLine();
            //split lines at...
            String[] tokens = line.split(", ");
            for (int i = 0; i < 5; i++) {
                Word.add(tokens[i]);
            }
        }
        //start a do-while
        do{
        //ask them what they would like to buy
        System.out.println("What would you like to purchase?"); 
        search = scanS.nextLine();
        //if they wanna purchase a lotto ticket
        if (search.equalsIgnoreCase("Lotto Ticket")) {
            System.out.println("This is your loto ticket, press go when "
                    + "your ready\n10$ Per Ticket");
            money = money - 10;
            String randomOne, randomTwo, randomThree;
            if (true) {
                //have three random words from the lotto file
                randomOne = Word.get((int)(Math.random()*(Word.size())));
                randomTwo = Word.get((int)(Math.random()*(Word.size())));
                randomThree = Word.get((int)(Math.random()*(Word.size())));
                //if all of them match
                if (randomOne.equals(randomTwo) && randomOne.equals
                (randomThree)) {
                    //add 1000 dollars
                    money = money + 1000;
                    //print out a statement
                    System.out.println("JackPot Winner: " 
                            + "\nYou have won 1000$");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" 
                            + randomThree);
                }
                //if only two match
                else if(randomOne.equals(randomTwo)){
                    //add 250 dollars
                    money = money + 250;
                    //show them a statement
                    System.out.println("Congrats: "
                            + " You have won 250$");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" 
                            + randomThree);
                }
                //if two match again...
                else if(randomOne.equals(randomThree)){
                    money = money + 250;
                    //statement for their win
                    System.out.println("Congrats: "
                            + " You have won 250$");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" 
                            + randomThree);
                }
                //if the remaning two match
                else if (randomTwo.equals(randomThree)){
                    money = money + 250;
                    //statement for their win
                    System.out.println("Congrats: "
                            + " You have won 250$");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" 
                            + randomThree);
                }
                //if nothing matches
                else{
                    //tell them they lost
                    System.out.println("You Lost! "
                            + " You won nothing");
                    System.out.println(randomOne + "\t" + randomTwo + "\t" 
                            + randomThree);
                }
                //break out and back to method
                break;
            }
        }
        //prompt them to purchase a bat
        else if (search.equalsIgnoreCase("bat")) {
            System.out.println("Bat\nPrice: 15$\nDesc: Look cool with this bat"
                    + "\nReviews: 3.4 (John from USA: Worst Bat Ever)\nWould "
                    + "you like to purchase this? (yes/no)");
            search = scanS.nextLine();
            //decrease money and add bat to array list
            if (search.equalsIgnoreCase("yes")) {
                money = money - 15;
                items.remove("bat");
                playerItems.add("bat");
            }
            //send them to menu
            else if (search.equalsIgnoreCase("no")) {
                System.out.println("See you later");
            }
            else{
                System.out.println("Please enter a valid response");
            }
            break;
        }
        //car purchase prompt
        else if (search.equalsIgnoreCase("car")) {
            System.out.println("Car\nPrice: 7000$\nDesc: Save time "
                    + "going out and about\nReviews: 5.0 (Daniyal from CA: "
                    + "I got like 10 maybe 15 of these, there pretty sick)"
                    + "\nWould you like to purchase this? (yes/no)");
            search = scanS.nextLine();
            //if yes...
            if (search.equalsIgnoreCase("yes")) {
                //decrease money and add car to the player items
                money = money - 7000;
                items.remove("car");
                playerItems.add("car");
            }
            //if no then send them back
            else if (search.equalsIgnoreCase("no")) {
                System.out.println("See you later");
            }
            //error trap
            else{
                System.out.println("Please enter a valid response");
            }
            break;
        }
        //spatula purchase prompt
        else if (search.equalsIgnoreCase("spatula")) {
            System.out.println("Spatula\nPrice: 30$\nDesc: Give it to the ally "
                    + "dude\nReviews: 5.0 (Ally Guy from Ally: I can't by one "
                    + "myself, but I would love it)"
                    + "\nWould you like to purchase this? (yes/no)");
            search = scanS.nextLine();
            //if yes...
            if (search.equalsIgnoreCase("yes")) {
                //decrease momey and add spatula to the player items array list
                money = money - 30;
                items.remove("spatula");
                playerItems.add("spatula");
            }
            //if no then send back to menu
            else if (search.equalsIgnoreCase("no")) {
                System.out.println("See you later");
            }
            //error trapping
            else{
                System.out.println("Please enter a valid response");
            }
            break;
        }
        else{
            System.out.println("Enter a valid option");
        }
        //end of while
        }while(!search.equalsIgnoreCase("Lotto Ticket") || 
                !search.equalsIgnoreCase("bat") || 
                !search.equalsIgnoreCase("car") ||
                !search.equalsIgnoreCase("spatula"));
    }   
   
    /**
     * Name: decFields
     * Desc: Decreases the players stats, check for loss and decrease the number
     * of day.
     **/
    
    public void decFields() {
        
        //decrease the stats of the player
        hunger = hunger - 1;
        thirst = thirst - 1;
        sleep = sleep - 1;
        time = time - 5;        
        //nested if statement for decreasing the day and for givening player 
        //rent
        if (time <= 0) {
            day = day - 1;
            if (playerStore.size() == 1) {
                money = money + 5000;
            }
        }
        //if to pay player rent depending on their house, give every week
        if (day == 7 || day == 14 || day == 21 || day == 28 
                && playerEstate.contains("Small House")) {
            money = money + 8000;
        }
        else if(day == 7 || day == 14 || day == 21 || day == 28 
                && playerEstate.contains("Medium House")) {
            money = money + 12000;
        }
        else if (day == 7 || day == 14 || day == 21 || day == 28 
                && playerEstate.contains("Large House")) {
            money = money + 120000;
        }
        //send to lose if they have less then any of these stats
        if (hunger <= 0 || thirst <= 0 || sleep <= 0 || day <= 0) {
            try {
                lose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
        }
    }
    
    /**
     * Name: Lose
     * Desc: Prints a lose statement and a to-string to the player and shuts off
     * the program, also outputs all stats.
     * @throws FileNotFoundException 
     */
    
    public void lose() throws FileNotFoundException{
        
        //create the outputFile printwriter
        PrintWriter outputFile = new PrintWriter("usernamesandmoney.txt");
        
        //Big statement
        System.out.println("\n$$\\\n" +
            "$$ |                                             \n" +
            "$$ |      $$$$$$\\   $$$$$$$\\  $$$$$$\\   $$$$$$\\  \n" +
            "$$ |     $$  __$$\\ $$  _____|$$  __$$\\ $$  __$$\\ \n" +
            "$$ |     $$ /  $$ |\\$$$$$$\\  $$$$$$$$ |$$ |  \\__|\n" +
            "$$ |     $$ |  $$ | \\____$$\\ $$   ____|$$ |      \n" +
            "$$$$$$$$\\\\$$$$$$  |$$$$$$$  |\\$$$$$$$\\ $$ |      \n" +
            "\\________|\\______/ \\_______/  \\_______|\\__|      \n" +
            " ");
        //show to-string to show player what they lost from
        System.out.println(toString());
        System.out.println("Please rate and review the game on app store");
        
        //Output all the stats of the player
        outputFile.print("Name:  " + name + " ");
        outputFile.print("Money:  " + money + " ");
        outputFile.print("Day:  " + day + " ");
        outputFile.print("Level:  " + level + " ");
        outputFile.print("Hunger:  " + hunger + " ");
        outputFile.print("Thirst:  " + thirst + " ");
        outputFile.print("Sleep:  " + sleep + " ");
        outputFile.print("Estate:  " + playerEstate + " ");
        outputFile.print("Store:  " + playerStore + " ");
        outputFile.print("Items:  " + playerItems + "\n");
        //close the outputFile
        outputFile.close();
        //system exit because they lost
        System.exit(0);
        
    }
    
}
