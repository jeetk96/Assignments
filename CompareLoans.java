// Name: Jeet Kumar
// Class Section: IS 147
// Instructor: Benjamin Houdeshell
// Date: 3/27/16
// Description: This program will ask the user to enter the loan amount and loan period in number of years
// and displays the monthly and total payments for each interest rate starting from
// 5% to 8%, with an increment of 1/8.


import java.util.Scanner;
   public class CompareLoans{
      public static void main(String[] args){
      //a scanner for amounts 
      Scanner input = new Scanner(System.in);
      
      

      // TODO: Prompt for and accept the user's loan amount
         System.out.print("Enter the loan amount: ");
         double loan = input.nextDouble();
               
      // TODO: Prompt for and accept the number of years for the loan
         System.out.print("Enter number of years: ");
         int years = input.nextInt();
      
      // TODO: Print the header to include "Interest Rate", "Monthly Payment", "Total Payment"
         System.out.println("Interest Rate    Monthly Payment        TotalPayment");
         double annualInterestRate = 5.0;
         
    
         while (annualInterestRate >= 5.0 && annualInterestRate <= 8.0) {
         
            double monthlyInterestRate = annualInterestRate / 1200;
         // Compute mortgage (formula for monthlypayment and totalpayment from listing 2.9)
            double monthlyPayment = loan * monthlyInterestRate /
               (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));
            double totalPayment = monthlyPayment * years * 12;
         
         // TODO: Display results annualInterestRate %, monthlyPayment $, totalPayment $);

            //System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
    // monthlyPayment, totalPayment);
            System.out.printf("%-20.3f%-20.2f%-20.2f\n", annualInterestRate, monthlyPayment, totalPayment);
            annualInterestRate = annualInterestRate + 1.0 / 8;
         }
       }
        
}

      
    

//(Financial application: compare loans with various interest rates) Write a program
//that lets the user enter the loan amount and loan period in number of years
//and displays the monthly and total payments for each interest rate starting from
//5% to 8%, with an increment of 1/8. Here is a sample run:
//Loan Amount: 10000
//Number of Years: 5
//Interest Rate Monthly Payment Total Payment
//5.000% 188.71 11322.74
//5.125% 189.29 11357.13
//5.250% 189.86 11391.59
//...
//7.875% 202.17 12129.97
//8.000% 202.76 12165.84