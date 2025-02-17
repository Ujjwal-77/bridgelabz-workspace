import java.util.Scanner;
public class SimpleInterest{
    public void Si(double p,double r,double t){
        return (p*r*t)/100;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        System.out.print("The Simple Interest is "+Si(principal,rate,time) +"for Principal " + principal+", Rate of Interest "+rate +" and Time "+time);
    }
}