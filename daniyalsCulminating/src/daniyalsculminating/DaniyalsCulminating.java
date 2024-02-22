/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniyalsculminating;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DaniyalsCulminating 
{
 public static void main(String[] args) 
 {
//import decimal format
DecimalFormat decFor = new DecimalFormat("0.00");
//import scanner   
Scanner scanS = new Scanner(System.in);
//declare string name variable
String name;
//declare your money variable
int[] money = {1000, 2000, 4000, 8000, 12000, 32000, 64000, 128000, 256000, 512000, 1000000};
        
        
System.out.println("Welcome, before we start please enter your name");
name = scanS.nextLine();
     System.out.println("\nWelcome to Daniyal's Who Wants To Be A Millionaire!"
             + " With everybody's favoraite host...Daniyal!"
             + "\nToday we are joined with a special guest..." + name + "!");
Instructions(name, money);
Questions(name, money);
 }//end of main method

public static void Instructions(String name, int[] money) 
{
    System.out.println("\n--------       ------     -----------------"
            + "\nLets start off with the rules. The way the game works"
            + "\nis that you are given a question per round,"
            + "\nby getting the question correct you will be given the"
            + "\nmoney prize and you will move up to the higher "
            + "\nrounds. You are also given three lifelines,"
            + "\nLastly you are also given the choice of cashing out at the"
            + "\ncash prizes of 8000, 128000 and 512000,\nright before the final"
            + " question.\nRemember one wrong answer and your...OUT!");

}//end of Game method

public static void Questions(String name, int[] money)
{
Scanner scanN = new Scanner(System.in);
Scanner scanS = new Scanner(System.in);
int cpuNum = (int)(1 + Math.random()*(3));
//String a = "a";
//String b = "b";
//String c = "c";
//String d = "d";
int userChoice = 0;
int choice = 1;
//String y = "Yes";
//String n = "No";
//String fiftyFifty;
//String phoneAFriend;
//String askTheHost;
int[]answers = {4, 2, 1, 2, 1, 3, 2, 4, 1, 3};
//String[] Answer = new String[10];
//Answer[0] = "D";
//Answer[1] = "B";
//Answer[2] = "A";
//Answer[3] = "B";
//Answer[4] = "A";
//Answer[5] = "C";
//Answer[6] = "B";
//Answer[7] = "D";
//Answer[8] = "A";
//Answer[9] = "C";
int currentQuestion = 1;
int[] lifeLineUsed = new int[3];
lifeLineUsed[0] = 0;
lifeLineUsed[1] = 0;
lifeLineUsed[2] = 0;
String[] lifelines = new String[3];
lifelines[0] = "\n5. Fifty Fifty";
lifelines[1] = "6. Phone A Friend";
lifelines[2] = "7. Ask The Host";
String[] question = new String[10];
question[0] = "\n\nWhich of these is not a multiple of 8 when multiplied by two."
        + "\n1. 16\n2. 4\n3. 40\n4. 58";       
question[1] = "\n\nWhat does the www stand for in the website browser?"
        + "\n1. World War Won\n2. World Wide Web\n3. Who What When\n4. Wide World Web";
question[2] = "\n\nWhat is the Capital of the United States of America."
        + "\n1. Washington, D.C\n2. New York\n3. The White House\n4. Washington";
question[3] = "\n\nHow many years does the FIFA Mens World Cup take place?"
        + "\n1. 6\n2. 4\n3. 5\n4. 2";
question[4] = "\n\nWho was the first man on the moon?"
        + "\n1. Neil Armstrong\n2. Elon Musk\n3. Jeremy Hansen\n4. Chris Hadfield";
question[5] = "\n\nWhat famous Japanese Anime is the main protaganist Eren Jaeger "
        + "from?\n1. Naruto\n2. One Peice\n3. Attack on Titan\n4. Pokemon";
question[6] = "\n\nWho is the artist of the famous late 1980s song...Never Gonna "
        + "Give You Up\n1. Rick Roll\n2. Rick Astley\n3. The Beetles\n4. One Direction";
question[7] = "\n\nWhat is the name of the assistant of the famous detective "
        + "Sherlock Holmes.\n1. James Watson\n2. John Stones\n3. Mycroft\n4. John Watson";
question[8] = "\n\nAs of 2020 what was the highest exporter of blueberrys?"
        + "\n1. Peru\n2. Canada\n3. Brazil\n4. Argentina";
question[9] = "\n\nWhat is the smallest country in population?\n1. Tuvalu\n2."
        + " Nauru\n3. Vatican City\n4. Palau";
String lastQuestion = "\n\nThe Earth is approximately how many miles away from the "
        + "Sun?\n1. 9.3 million\n2. 39 million\n3. 93 million\n4. 193 million";


    while(choice == 1)   
    {
     switch (currentQuestion)
     {
            case 1:{
    System.out.println("--------       ------     -----------------");
    System.out.println(question[0]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 4)
    {
     System.out.println("Correct! Lets move on to the next question");
     System.out.println("--------       ------     -----------------");
     currentQuestion = 2;
     continue;
    }
    else if(userChoice == 5)
    {
      System.out.println("You have chosen the Fifty Fifty Life Line!"
      + "\nThe two incorrect answers are answers 1 and 3.");
      lifeLineUsed[0] = 1;
      continue;
    }
    else if(userChoice == 6)
    {
     System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Lucas said...he believes the answer is 4!");
             lifeLineUsed[1] = 1;
             continue;
    }
    else if(userChoice == 7)
    {
     System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 2.");
             lifeLineUsed[2] = 1;
             continue;
    }
    else if(userChoice < 4)
    {    
     System.out.println("Incorrect, on the first question??");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
     System.out.println("Please enter a valid choice");
     continue;
    }
        }
    
    //*********************************
    //1ST QUESTION ENDS HERE
    case 2: {
    System.out.println(question[1]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 2)    
    {
        System.out.println("Correct! Next Question!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 3;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     {
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 1 and 3.");
             lifeLineUsed[0] = 1;
     }
     else
     {
         System.out.println("Fifty Fifty life line already used");
     }
         continue;
    }
    else if(userChoice == 6)
    {
     if(lifeLineUsed[1] == 0)
     {
        System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Khizr said...he believes the answer is 3!");
             lifeLineUsed[1] = 1;
     }
     else
     {
         System.out.println("You have already used the Phone A Friend life line");
     }
             continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
     {
      System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 2.");
             lifeLineUsed[2] = 1;
     }
     else
     {
         System.out.println("The Ask The Host Life Line has already been used");    
     }
             continue;
    }
    else if(userChoice == 1 || userChoice == 3 || userChoice == 4)
    {
        System.out.println("Well...you had a nice run. Incorrect!");
        System.out.println("--------       ------     -----------------");
        break;
    }
    
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 3:
    {
    System.out.println(question[2]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 1)    
    {
        System.out.println("Thats is....Correctttt!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 4;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     {
      System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 2 and 3.");
             lifeLineUsed[0] = 1;
     }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used");
     }
             continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
     {
        System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Ayaan said...he believes the answer is 1!");
             lifeLineUsed[1] = 1;
     }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used");
    }
    continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
     {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 1.");
             lifeLineUsed[2] = 1;
     }
     else
     {
         System.out.println("The Ask The Host Life Line has already been used.");
     }
    continue;
    }
    else if(userChoice == 2 || userChoice == 3 || userChoice == 4)
    {
      System.out.println("Ohhh, nice try but better luck next time.");
      System.out.println("--------       ------     -----------------");
      break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 4:
    {
    System.out.println(question[3]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");    
    userChoice = scanN.nextInt();
    if(userChoice == 2)    
    {
        System.out.println("WoooooHooo, on a roll. CORRECT!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 5;
        continue;
    }
        else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     {
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 3 and 4.");
            lifeLineUsed[0] = 1; 
     }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used.");    
     }
            continue;
    }
    else if(userChoice == 6)
    {
     if(lifeLineUsed[1] == 0)
     {
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Faris said...he believes the answer is 2!");
            lifeLineUsed[1] = 1; 
     }
     else
     {
         System.out.println("The Phone A Friend Life Line has already been used.");    
     }
            continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
     {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 2.");
             lifeLineUsed[2] = 1;
     }
    else
     {
         System.out.println("The Ask The Host Life Line has already been used.");
     }
             continue;
    }
    else if(userChoice == 1 || userChoice == 3 || userChoice == 4)
    {
     System.out.println("Haha, no money for you. Incorrect!");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 5:
    {
    System.out.println(question[4]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 1)    
    {
        System.out.println("Correct! Next Question");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 6;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     {     
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 2 and 4.");
            lifeLineUsed[0] = 1;
     }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used.");
     }
            continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
    {    
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Mohsin said...he believes the answer is 4!");
            lifeLineUsed[1] = 1;
    }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
            continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
        {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 1.");
             lifeLineUsed[2] = 1;
        }
     else
     {
         System.out.println("The Ask The Host Life Line has already been used.");
     }        
     continue;
    }
    else if(userChoice == 2 || userChoice == 3 || userChoice == 4)
    {
     System.out.println("4 Questions in and your already out. Incorrect!");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 6:
    {
    //*********************************
    //QUESTION 4 ENDS
    System.out.println(question[5]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 3)    
    {
        System.out.println("You weeb, nice job. Correct!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 7;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     { 
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 1 and 4.");
             lifeLineUsed[0] = 1;   
     }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used.");
     }
    continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
     {    
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Ryan said...he believes the answer is 4!");
            lifeLineUsed[1] = 1; 
     }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
            continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
      {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 3.");
             lifeLineUsed[2] = 1;
      }
     else
     {
         System.out.println("The Ask The Host Life Line has already been used.");
     }
             continue;
    }
    else if(userChoice == 2 || userChoice == 1 || userChoice == 4)
    {
     System.out.println("Not so well with anime, that fine. Incorrect!");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 7:
    {
    //************************************
    //END OF 5
    System.out.println(question[6]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 2)    
    {
        System.out.println("On a roll! Correct");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 8;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
        {
        System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 3 and 4.");
             lifeLineUsed[0] = 1;
        }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used.");
     }
             continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
        {     
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Billy said...he believes the answer is 2!");
            lifeLineUsed[1] = 1; 
        }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
            continue;
    }
    else if(userChoice == 7)
    {
     if(lifeLineUsed[2] == 0)
     {   
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 2.");
             lifeLineUsed[2] = 1;
     }
     else
     {
         System.out.println("The Ask The Host Life Line has already been used.");
     }
             continue;
    }
    else if(userChoice == 1 || userChoice == 3 || userChoice == 4)
    {
     System.out.println("You got rick rolled, and you got the question wrong"
                + "unfortunate. Incorrect.");
     System.out.println("--------       ------     -----------------");    
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 8:
    {
    //*************************
    //END OF Q 6
    System.out.println(question[7]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 4)    
    {
        System.out.println("Nice deduction...Correct");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 9;
        continue;
    }
    else if(userChoice == 5)
    {
     if(lifeLineUsed[0] == 0)
     {
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 2 and 3.");
             lifeLineUsed[0] = 1;
     }
     else
     {
         System.out.println("The Fifty Fifty Life Line has already been used.");
     }
             continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
    {    
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Robert said...he believes the answer is 4!");
             lifeLineUsed[1] = 1;
    }
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
    continue;
    }
    else if(userChoice == 7)
    {
    if(lifeLineUsed[2] == 0)
    {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 4.");
             lifeLineUsed[2] = 1;
    }
    else
    {
        System.out.println("The Ask The Host Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 2 || userChoice == 3 || userChoice == 1)
    {
     System.out.println("Unfortunate...Incorrect");
     System.out.println("--------       ------     -----------------");   
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 9:
    {
    //****************
    //END OF Q 7
    System.out.println(question[8]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 1)    
    {
        System.out.println("Lucky Guess? Correct!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 10;
        continue;
    }
    else if(userChoice == 5)
    {
    if(lifeLineUsed[0] == 0)
    {   
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 2 and 3.");
             lifeLineUsed[0] = 1;
    }
    else
    {
        System.out.println("The Fifty Fifty Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
    {     
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Lucas said...he believes the answer is 1!");
             lifeLineUsed[1] = 1;
    }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 7)
    {
    if(lifeLineUsed[2] == 0)
    {     
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 1.");
             lifeLineUsed[2] = 1;
    }
    else
    {
        System.out.println("The Ask The Host Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 2 || userChoice == 3 || userChoice == 4)
    {
     System.out.println("Well...that was tricky. Incorrect!");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    case 10:
    {
    //*******************************
    //END OF Q 8
    System.out.println(question[9]);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 3)    
    {
        System.out.println("Nice with your geography...Correct!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 11;
        continue;
    }
    else if(userChoice == 5)
    {
    if(lifeLineUsed[0] == 0)
    {
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 1 and 4.");
             lifeLineUsed[0] = 1;
    }
    else
    {
        System.out.println("The Fifty Fifty Life Line has already been used.");        
    }
             continue;
    }
    else if(userChoice == 6)
    {
    if(lifeLineUsed[1] == 0)
    {    
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Faris said...he believes the answer is 3!");
             lifeLineUsed[1] = 1;
    }
    else
    {
        System.out.println("The Phone A Friend Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 7)
    {
    if(lifeLineUsed[2] == 0)
    {
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 3.");
             lifeLineUsed[2] = 1;
    }
    else
    {
        System.out.println("The Ask The Host Life Line has already been used.");
    }
    continue;
    }
    else if(userChoice == 2 || userChoice == 1 || userChoice == 4)
    {
     System.out.println("Oh so close. Incorrect!");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
    }
    }
    case 11:
    {
    //******************************
    //END OF Q 9
    System.out.println(lastQuestion);
    System.out.println(lifelines[0]);
    System.out.println(lifelines[1]);
    System.out.println(lifelines[2]);
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 3)    
    {
        System.out.println("CONGRADULATIONS! YOU HAVE WON!");
        System.out.println("--------       ------     -----------------");
        currentQuestion = 12;
        continue;
    }
    else if(userChoice == 5)
    {
    if(lifeLineUsed[0] == 0)
    {
     System.out.println("You have chosen the Fifty Fifty Life Line!"
             + "\nThe two incorrect answers are answers 1 and 2.");
             lifeLineUsed[0] = 1;
    }
    else
    {
        System.out.println("The Fifty Fifty Life Line has already been used.");
    }
             continue;
    }
    else if(userChoice == 6)
    {
        if(lifeLineUsed[1] == 0)
	{
    System.out.println("You have chosen the Phone a Friend Life Line!"
             + "\nYour friend Mohsin said...he believes the answer is 4!");
             lifeLineUsed[1] = 1;
        }
    else
        {
            System.out.println("The Phone A Friend Life Line has already been used.");
        }
             continue;
    }
    else if(userChoice == 7)
    {
        if(lifeLineUsed[2] == 0)
	{
    System.out.println("You have chosen the Ask The Host Life Line!"
             + "\n" + name + " The correct answer is...Choice 3.");
             lifeLineUsed[2] = 1;
        }
    else
        {
            System.out.println("The Ask The Host Life Line has already been used.");
        }
             continue;
    }
    else if(userChoice == 2 || userChoice == 1 || userChoice == 4)
    {
     System.out.println(name + "\nYOU HAVE JUST LOST HALF A MILLION DOLLARS");
     System.out.println("--------       ------     -----------------");
     break;
    }
    else
    {
        System.out.println("Please enter a valid input");
        continue;
    }
    }
    //***********************************
    //END OF Q 10
    case 12:
    {
    System.out.println("\n\nNow " + name + " you have the chance to double your money"
            + "\nwith 1 final question...Do you wish to continue?\nwith the catch"
            + "being a do or die\nlosing to the final question will lose or double"
            + "\nALL your current money\nType in 1 if"
            + " you wish to continue and 2 if you wish to quit.");
    System.out.println("--------       ------     -----------------");
    userChoice = scanN.nextInt();
    if(userChoice == 1)
    {
        System.out.println("\nAhh daring I see, for this final game\nyou will need"
                + " to guess a randomized\ncomputer number from 1 and 2.\n"
                + "Please enter your guess.");
        System.out.println("--------       ------     -----------------");
        userChoice = scanN.nextInt();
        if(userChoice == cpuNum)
        {
            System.out.println(name + "\nYOU\nHAVE\nJUST\nWON\n2\nMILLION\nDOLLARS!"
                    + "\n |.--------_--_------------_--__--.|\n" +
" ||    /\\ |_)|_)|   /\\ | |(_ |_   ||\n" +
" ;;`,_/``\\|__|__|__/``\\|_| _)|__ ,:|\n" +
"((_(-,-----------.-.----------.-.)`)\n" +
" \\__ )        ,'     `.        \\ _/\n" +
" :  :        |_________|       :  :\n" +
" |-'|       ,'-.-.--.-.`.      |`-|\n" +
" |_.|      (( (*  )(*  )))     |._|\n" +
" |  |       `.-`-'--`-'.'      |  |\n" +
" |-'|        | ,-.-.-. |       |._|\n" +
" |  |        |(|-|-|-|)|       |  |\n" +
" :,':        |_`-'-'-'_|       ;`.;\n" +
"  \\  \\     ,'           `.    /._/\n" +
"   \\/ `._ /_______________\\_,'  /\n" +
"    \\  / :   ___________   : \\,'\n" +
"     `.| |  |           |  |,'\n" +
"       `.|  |           |  |\n" +
"         |  |           |  |");
            System.out.println("--------       ------     -----------------");
        }
        else if(userChoice >= 3)
        {
            System.out.println("\nSorry thats an invalid option, you lose");
            System.out.println("--------       ------     -----------------");
        }
        else
        {
            System.out.println("\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|______________"
                    + "____\nYOU HAVE LOST 1 MILLION DOLLARS");
            System.out.println("\n\n--------       ------     -----------------");
        }
    }    
    else
    {
      System.out.println("--------       ------     -----------------");
      System.out.println(name + "YOU\nARE\nNOW\nA\nMILLIONARE"); 
      System.out.println("--------       ------     -----------------");
      break;
    }
    }
    break;
    }
   }

    
    
}//end of Questions method
}//end of class


