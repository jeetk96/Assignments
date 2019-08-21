package Chapter10;


import java.util.Scanner;



public class TestLoanClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Enter loan: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, years, loanAmount);

        System.out.printf("The loan was created on: %s\n"
                + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }

}
