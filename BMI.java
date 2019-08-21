package Chapter10;

import java.*;

public class BMI {

    private String name;
    private int age;
    
    private double height;
    private double weight;
    
    public static double kilos = 0.45359237;
    public static double meters = 0.0254;

   

    public BMI(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public BMI(String name, double height, double weight) {
        this(name, 20, height, weight);
    }

    public double getBMI() {
        double bmi = weight * kilos / ((height * meters) * (height * meters));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }
     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

}
