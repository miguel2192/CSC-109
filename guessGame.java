//Author: Miguel A. Rodriguez
//Date:   10/08/2015

import java.util.*;
import java.text.*;

public class guessGame
{
 public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    
    
    
    String another="";
    System.out.println("Do you wish to enter the guessing game <y or n>?: ");
    another = scan.nextLine();
    
    while (another.equalsIgnoreCase("y"))
    {
    System.out.println("Welcome to the guessing game, you will have ten chances to enter the right number!");
    System.out.print("");
    
    int correct_Value = 37;
    final int MAX_LIMIT=10;
    int number=0;
    
    while(number<MAX_LIMIT)
      {
       System.out.println("Please enter a number between 1 - 100: ");
       number = scan.nextInt();
       if (number>=1 && number<=100)
        {
         if (number< correct_Value)
            System.out.println("Your guess is too low!");
            
         else 
             if (number> correct_Value)
             System.out.println("Your guess is too high!");
             
         else
             if (number == correct_Value){
               System.out.println("Nice job! You guessed the correct answer!");
               break;
               }
        else
           System.out.println("Not a valid input!");
           }
      else
          System.out.println("Your number is out of range!");
          
          }//END INNER WHILE
           System.out.println("Do you wish to play again <y or n>?: ");
           another = scan.next();
          }//END OUTER WHILE
          System.out.println("Thanks for playing the guessing game!");
         
        }//END METHOD
      }//END CLASS
           
           
           
