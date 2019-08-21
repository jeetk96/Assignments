package Chapter10;

public class UseBMIClass {
    public static void main(String[] args){
        BMI bmi1 = new BMI("Jeet", 21, 80, 170);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        
        BMI bmi2 = new BMI("Susan King", 70, 215);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
