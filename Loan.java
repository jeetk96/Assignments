
package Chapter10;

public class Loan {
    private double annualInterestRate, loanAmount;
    private int years;
    private java.util.Date loanDate;
    
    /** default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }
    
    public Loan(double annualInterestRate, int years, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.years = years;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getYears(){
        return years;
    }
    
    public void setYears(int years){
        this.years = years;
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));
    return monthlyPayment;
    }
    
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * years * 12;
        return totalPayment;
    }
    
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
