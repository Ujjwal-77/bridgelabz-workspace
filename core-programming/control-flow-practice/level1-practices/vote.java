package Week1.Assignment2;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote.");
        }
        else{
            System.out.println("The person's age is "+age+" and can not vote.");
        }
        sc.close();
    }
}
