import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResult(num1, num2, gcd, lcm);
    }

    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    private static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
