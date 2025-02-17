package Week1.Assignment2;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in kg:");
        double weight=sc.nextDouble();
        System.out.print("Enter weight in kg:");
        double heightCm=sc.nextDouble();
        double heightM=heightCm*0.01;
        double bmi=weight / (heightM * heightM);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
