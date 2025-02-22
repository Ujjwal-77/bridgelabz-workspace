import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
