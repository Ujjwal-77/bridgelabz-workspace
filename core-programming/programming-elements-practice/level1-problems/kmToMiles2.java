package Week1.Assignment1;
import java.util.Scanner;

public class kmToMiles2 {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double miles=km*1.6;
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
        input.close();
    }
}
