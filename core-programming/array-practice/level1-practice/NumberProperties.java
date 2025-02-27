import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (num > 0)
                if (num % 2 == 0) {
                    System.out.println(num + " is " + "Even");
                } else {
                    System.out.println(num + " is " + "Odd");
                }
            else if (num < 0)
                System.out.println(num + " is Negative");
            else {
                System.out.println(num + " is Zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater.");
        } else {
            System.out.println("First element is smaller.");
        }
    }
}
