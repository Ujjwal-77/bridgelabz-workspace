import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;

    }
    
    public static int[] storeDigits(int number) {

        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++){
            digits[i] = numStr.charAt(i) -'0';

        }
        return digits;
    }

    
    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0");
    }
    
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int  temp = number;
        int digits = countDigits(number);
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

    
    
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(digits));
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest)
                secondLargest = digit;
        }
        return new int[] { largest, secondLargest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largestValues = findLargestAndSecondLargest(storeDigits(number));

        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);
    }
}
