// Name: Jeet Kumar
// Class Section: IS 147
// Instructor: Benjamin Houdeshell
// Date: 2/16/16
// Description: This program will enter a monthly savings amount and 
// display the value of the account after the sixth month.

import java.util.Scanner;

public class CompoundValue{
   
      public static void main(String[] args) {
      double account;
      		
      
      //Step 1: Ask the user for the amount in the account
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the amount in the account: ");
      account = input.nextDouble();
         
      //Step 2: Calculate the amount in the account after the sixth month
      account = (500 + account) * (1 + 0.02502);
      
      //Step 3: Display the result
      System.out.println("The amount in the account after six months is $" + account);
      
      
      
    }
    
   }
      