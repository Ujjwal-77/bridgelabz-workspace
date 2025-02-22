import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        scanner.close();

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    private static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
