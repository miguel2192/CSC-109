/*************************************************************
*                                                            *
*   Miguel A. Rodriguez    CSC 111                           *
*   report.java                                              *
*   User can input a series of numbers in to an array. It    *
*    calculates the class average and prints a report of the *
*    test grades and class average.                          *
**************************************************************/

import java.text.*;
import java.util.Scanner;

public class report
{
 public static void main(String[] args)
  {
  
  final int MAX_SIZE = 15;
  String another = "y";
  int sum, index;
  double average;
  int[] testGrade = new int[MAX_SIZE];
  
  
      Scanner scan = new Scanner(System.in);
   
   while(another.equalsIgnoreCase("y"))
     {
      index = -1;
     
    do
    {
     index++;
     
     System.out.println("Please enter the grade # " + index+1 + ""+"<-1 to exit>:\t");
     testGrade[index] = scan.nextInt();
     
     }while(testGrade[index]>=0);//END DO WHILE LOOP
         sum = 0;
        
      for( int i=0; i<index;i++)
       
        sum += testGrade[1];
       
       
       average = (double) sum / index;
       
       System.out.println("The class average is: "+ average + "\nand the test grade scores are: ");
      for (int i = 0; i<index; i++)
           System.out.println(i+1 + " " + testGrade[i] + "\n");
       
       
     }//end while another
      System.out.println("Do you have another class to process<y or n>?\t");
      another = scan.next();
    }//end main

  } 
