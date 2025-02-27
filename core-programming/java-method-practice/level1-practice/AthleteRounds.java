import java.util.Scanner;
public class AthleteRounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        
        double rounds = 5000/perimeter;

        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park in meters: ");

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        System.out.println("Athlete must complete " + calculateRounds(side1, side2, side3) + " rounds.");
    }
}
